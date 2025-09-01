import { Component, createRef } from "react";

class FlightBookingControlled extends Component {
    constructor(props) {
        super(props);
        this.state = {
            passengerName: "",
            email: "",
            gender: "",
            meal: "",
            request: "",
            submitted: false
        };
    }

    handleChange = (e) => {
        this.setState({ [e.target.name]: e.target.value });
    }

    handleSubmit = (e) => {
        e.preventDefault();
        this.setState({ submitted: true });
    }

    render() {
        return (
            <div className="card p-4 shadow mb-4" style={{ margin: "0 auto" }}>
                <h3 className="mb-3">Controlled Flight Booking Form</h3>
                <form onSubmit={this.handleSubmit}>
                    <div className="mb-3">
                        <label>Passenger Name</label>
                        <input type="text" className="form-control" name="passengerName" value={this.state.passengerName} onChange={this.handleChange} />
                    </div>

                    <div className="mb-3">
                        <label>Email</label>
                        <input type="email" className="form-control" name="email" value={this.state.email} onChange={this.handleChange} />
                    </div>

                    <div className="mb-3">
                        <label>Gender</label><br />
                        <input type="radio" name="gender" value="Male" checked={this.state.gender === "Male"} onChange={this.handleChange} /> Male &nbsp;
                        <input type="radio" name="gender" value="Female" checked={this.state.gender === "Female"} onChange={this.handleChange} /> Female
                    </div>

                    <div className="mb-3">
                        <label>Meal Preferences</label>
                        <select className="form-control" name="meal" value={this.state.meal} onChange={this.handleChange} >
                            <option value="Veg">Veg</option>
                            <option value="Non-Veg">Non-Veg</option>
                        </select>
                    </div>

                    <div className="mb-3">
                        <label>Special Request</label>
                        <textarea className="form-control" name="request" value={this.state.request} onChange={this.handleChange} />
                    </div>

                    <button type="submit" className="btn btn-dark w-100" >Submit</button>
                </form>

                {this.state.submitted && (
                    <div className="mt-4">
                        <h3>Booking Details</h3>
                        <table className="table table-bordered">
                            <tbody>
                                <tr>
                                    <th>Passenger</th>
                                    <td>{this.state.passengerName}</td>
                                </tr>
                                <tr>
                                    <th>Email</th>
                                    <td>{this.state.email}</td>
                                </tr>
                                <tr>
                                    <th>Gender</th>
                                    <td>{this.state.gender}</td>
                                </tr>
                                <tr>
                                    <th>Meal</th>
                                    <td>{this.state.meal}</td>
                                </tr>
                                <tr>
                                    <th>Request</th>
                                    <td>{this.state.request}</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                )}
            </div>
        );
    }
}


class FlightBookingUncontrolled extends Component {
    constructor(props) {
        super(props);
        this.flightNo = createRef();
        this.source = createRef();
        this.destination = createRef();
        this.date = createRef();
        this.terms = createRef();
        this.state = { submitted: false };
    }

    handleSubmit = (e) => {
        e.preventDefault();
        this.setState({ submitted: true });
    }

    render() {
        return (
            <div className="card p-4 shadow mb-4" style={{ margin: "0 auto" }}>
                <h3 className="mb-3">Uncontrolled Flight Booking Form</h3>
                <form onSubmit={this.handleSubmit}>
                    <div className="mb-3">
                        <label>Flight Number</label>
                        <input type="text" className="form-control" ref={this.flightNo} />
                    </div>

                    <div className="mb-3">
                        <label>Source</label>
                        <input type="text" className="form-control" ref={this.source} />
                    </div>

                    <div className="mb-3">
                        <label>Destination</label>
                        <input type="text" className="form-control" ref={this.destination} />
                    </div>

                    <div className="mb-3">
                        <label>Travel Date</label>
                        <input type="date" className="form-control" ref={this.date} />
                    </div>

                    <div className="mb-3 form-check">
                        <input type="checkbox" className="form-check-input" ref={this.terms} />
                        <label>Accept Terms</label>
                    </div>

                    <button type="submit" className="btn btn-dark w-100" >Submit</button>
                </form>

                {this.state.submitted && (
                    <div className="card mt-3 p-3">
                        <h3>Booking Details</h3>
                        <p>Flight No: {this.flightNo.current.value}</p>
                        <p>Source: {this.source.current.value}</p>
                        <p>Destination: {this.destination.current.value}</p>
                        <p>Date: {this.date.current.value}</p>
                        <p>Terms Accepted: {this.terms.current.checked ? "Yes" : "No"}</p>
                    </div>
                )}
            </div>
        );
    }
}

function FlightBooking() {
    return (
        <div className="container mt-4 d-flex">
            <FlightBookingControlled />
            <FlightBookingUncontrolled />
        </div>
    );
}

export default FlightBooking;