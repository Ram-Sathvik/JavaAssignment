import * as Yup from "yup";
import { Formik, Form, Field, ErrorMessage } from "formik";
import { useEffect, useState } from "react";
import axios from "axios";

const positions = ["Forward", "Midfielder", "Defender", "Goalkeeper"];

const PlayerForm = () => {

    const [players, setPlayers] = useState([]);
    const [editPlayer, setEditPlayer] = useState(null);

    const playerSchema = Yup.object({
        name: Yup.string()
                .min(3, "Min 3 characters")
                .required("Required"),
        age: Yup.number()
                .typeError("Enter a number")
                .integer("Integer only")
                .min(16, "Min age 16")
                .max(40, "Max age 40")
                .required("Required"),
        position: Yup.string()
                .oneOf(positions, "Select a valid position")
                .required("Required"),
        club: Yup.string()
                .required("Required"),
        nationality: Yup.string()
                .required("Required"),
        goals: Yup.number()
                .typeError("Enter a number")
                .min(0, "Must be >=0")
                .required("Required"),
        matchesPlayed: Yup.number()
                .typeError("Enter a number")
                .min(0, "Must be >=0")
                .required("Required"),
        jerseyNumber: Yup.number()
                .typeError("Enter a number")            
                .integer("Integer only")
                .min(1, "1-99")
                .max(99, "1-99")
                .required("Required"),
        email: Yup.string()
                .email("Invalid email")
                .required("Required"),
        contactNumber: Yup.string()
                .matches(/^\d{10}$/, 'Must be 10 digits')
                .required("Required")
    })
        
    const initialValues = {
        id: undefined,
        name: "",
        age: "",
        position: "",
        club: "",
        nationality: "",
        goals: "",
        matchesPlayed: "",
        jerseyNumber: "",
        email: "",
        contactNumber: ""
    };

    useEffect(() => {
        console.log("Fetching players from API...");
        axios.get("http://localhost:5000/players")
        .then(res => {
            console.log("Fetched players:", res.data);
            setPlayers(res.data);
        })
        .catch(err => console.error("Error fetching players:", err));
    }, []);

    const handleSubmit = (values, { resetForm }) => {
        console.log("Submitting form values:", values);
        if (editPlayer) {
          console.log("Updating player: ", editPlayer.id);
          axios.put(`http://localhost:5000/players/${editPlayer.id}`, values)
            .then(res => {
              console.log("Updated player response: ", res.data);
              setPlayers(players.map(player => (player.id === editPlayer.id ? res.data : player)));
              setEditPlayer(null);
              resetForm();
            })
            .catch(err => console.error("Error updating player:", err));
        } else {
          console.log("Adding new player...");
          axios.post("http://localhost:5000/players", values)
            .then(res => {
              console.log("Added new player: ", res.data);
              setPlayers([...players, res.data]);
            })
            .catch(err => console.error("Error adding player:", err));
          resetForm();
        }
    };

    const handleDelete = (id) => {
        if (window.confirm("Are you sure you want to delete this player?")) {
          console.log("Deleting player: ", id);
          axios.delete(`http://localhost:5000/players/${id}`)
            .then(() => {
              console.log("Deleted player with ID: ", id);
              setPlayers(players.filter(player => player.id !== id));
            })
            .catch(err => console.error("Error deleting player: ", err));
        } else {
          console.log("Delete action cancelled.");
        }
    };
        
    return (
        <div className="container mt-4">
            <div className="card p-4 mb-4 shadow">
                <h3>{editPlayer ? "Edit Player" : "Add Player"}</h3>
                <Formik 
                    initialValues={editPlayer || initialValues}
                    validationSchema={playerSchema}
                    enableReinitialize
                    onSubmit={handleSubmit}
                >
                    <Form>
                        <div className="row">
                            <div className="col-md-6 mb-3">
                                <label>Name</label>
                                <Field name="name" className="form-control" />
                                <ErrorMessage name="name" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Age</label>
                                <Field type="number" name="age" className="form-control" />
                                <ErrorMessage name="age" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Position</label>
                                <Field as="select" name="position" className="form-control">
                                <option value="">Select</option>
                                <option value="Forward">Forward</option>
                                <option value="Midfielder">Midfielder</option>
                                <option value="Defender">Defender</option>
                                <option value="Goalkeeper">Goalkeeper</option>
                                </Field>
                                <ErrorMessage name="position" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Club</label>
                                <Field name="club" className="form-control" />
                                <ErrorMessage name="club" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Nationality</label>
                                <Field name="nationality" className="form-control" />
                                <ErrorMessage name="nationality" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Goals</label>
                                <Field type="number" name="goals" className="form-control" />
                                <ErrorMessage name="goals" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Matches Played</label>
                                <Field type="number" name="matchesPlayed" className="form-control" />
                                <ErrorMessage name="matchesPlayed" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Jersey Number</label>
                                <Field type="number" name="jerseyNumber" className="form-control" />
                                <ErrorMessage name="jerseyNumber" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Email</label>
                                <Field type="email" name="email" className="form-control" />
                                <ErrorMessage name="email" className="text-danger" component="div" />
                            </div>

                            <div className="col-md-6 mb-3">
                                <label>Contact Number</label>
                                <Field name="contactNumber" className="form-control" />
                                <ErrorMessage name="contactNumber" className="text-danger" component="div" />
                            </div>
                        </div>

                        <button type="submit" className="btn btn-dark" >{editPlayer ? "Update Player" : "Add Player"}</button>
                    </Form>
                </Formik>
            </div>

            <div className="card p-4 shadow">
                <h3>Player List</h3>
                <table className="table table-striped">
                    <thead className="table-dark">
                        <tr>
                            <th>Name</th>
                            <th>Age</th>
                            <th>Position</th>
                            <th>Club</th>
                            <th>Nationality</th>
                            <th>Goals</th>
                            <th>Matches</th>
                            <th>Jersey</th>
                            <th>Email</th>
                            <th>Contact</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {players.map((player) => (
                            <tr key={player.id}>
                                <td>{player.name}</td>
                                <td>{player.age}</td>
                                <td>{player.position}</td>
                                <td>{player.club}</td>
                                <td>{player.nationality}</td>
                                <td>{player.goals}</td>
                                <td>{player.matchesPlayed}</td>
                                <td>{player.jerseyNumber}</td>
                                <td>{player.email}</td>
                                <td>{player.contactNumber}</td>
                                <td>
                                    <button className="btn btn-warning btn-sm me-2" onClick={() => setEditPlayer(player)}>Edit</button>
                                    <button className="btn btn-danger btn-sm" onClick={() => handleDelete(player.id)}>Delete</button>
                                </td>
                            </tr>
                        ))}
                    </tbody>
                </table>

                {players.length === 0 && (
                    <p className="text-center">No players available</p>
                )}
            </div>
        </div>
    );
}

export default PlayerForm;