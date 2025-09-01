import { Component } from "react";

// class component
class MarriageForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            brideName: "",
            groomName: "",
            date: "",
            venue: ""
        }
    }

     // updated the value in input field using setState
    handleChange = (e) => {
        this.setState({ [e.target.name]: e.target.value });
    };

    // prevents page from reloading when form is submitted
    handleSubmit = (e) => {
        e.preventDefault();
    };

    render() {
        return (
            <div className="container mt-4">
                <div className="card p-4 shadow w-50">
                    <h2 className="mb-3">Marriage Form</h2>
                    <form onSubmit={this.handleSubmit}>

                        {/* input fields */}
                        <div className="form-group mb-3">
                            <label>Bride Name</label> 
                            <input type="text" className="form-control" name="brideName" value={this.state.brideName} onChange={this.handleChange} />
                        </div>

                        <div className="form-group mb-3">
                            <label>Groom Name</label> 
                            <input type="text" className="form-control" name="groomName" value={this.state.groomName} onChange={this.handleChange} />
                        </div>

                        <div className="form-group mb-3">
                            <label>Date</label> 
                            <input type="date" className="form-control" name="date" value={this.state.date} onChange={this.handleChange} />
                        </div>

                        <div className="form-group mb-3">
                            <label>Venue</label> 
                            <input type="text" className="form-control" name="venue" value={this.state.venue} onChange={this.handleChange} />
                        </div>

                        <button className="btn btn-dark w-100" type="submit">Submit</button>
                    </form>
                </div>

                {/* displaying the marriage details */}
                <div className="card mt-4 p-3 w-50">
                    <h3>Marriage Details</h3>
                    <p>Bride: {this.state.brideName}</p>
                    <p>Groom: {this.state.groomName}</p>
                    <p>Date: {this.state.date}</p>
                    <p>Venue: {this.state.venue}</p>
                </div>
            </div>
        );
    }
}

export default MarriageForm;