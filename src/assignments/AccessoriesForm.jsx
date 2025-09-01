import { Component } from "react";

class AccessoriesForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            accessoryName: "",
            description: "",
            category: "",
            brand: "",
            available: false,
            warranty: ""
        };
    }

    // if input is checkbox, it updates using checked, otherwise it updates using
    handleChange = (e) => {
        const { name, value, type, checked } = e.target;
        this.setState({
            [name]: type === "checkbox" ? checked : value
        });
    }

    // prevents page from reloading when form is submitted
    handleSubmit = (e) => {
        e.preventDefault();
    }

    render() {
        return (
            <div className="container mt-4">
                <div className="row justify-content-center">
                    <div className="col-md-6">
                        <div className="card p-4 shadow" style={{ width: "500px", margin: "0 auto" }}>
                            <h2 className="text-center mb-3">Accessories Form</h2>
                            <form onSubmit={this.handleSubmit}>

                                {/* input fields */}
                                <div className="mb-3">
                                    <label className="form-label">Accessory Name</label>
                                    <input type="text" className="form-control" name="accessoryName" value={this.state.accessoryName} onChange={this.handleChange} />
                                </div>

                                <div className="mb-3">
                                    <label className="form-label">Description</label>
                                    <textarea className="form-control" name="description" value={this.state.description} onChange={this.handleChange} ></textarea>
                                </div>

                                <div className="mb-3">
                                    <label className="form-label">Category</label>
                                    <select className="form-control" name="category" value={this.state.category} onChange={this.handleChange} >
                                        <option value="">Select</option>
                                        <option value="Electronics">Electronics</option>
                                        <option value="Fashion">Fashion</option>
                                        <option value="Home">Home</option>
                                    </select>
                                </div>

                                <div className="mb-3">
                                    <label className="form-label">Brand</label><br />
                                    <input type="radio" name="brand" value="Sony" checked={this.state.brand === "Sony"} onChange={this.handleChange} /> Sony
                                    <input type="radio" name="brand" value="Samsung" checked={this.state.brand === "Samsung"} onChange={this.handleChange} /> Samsung
                                    <input type="radio" name="brand" value="LG" checked={this.state.brand === "LG"} onChange={this.handleChange} /> LG
                                </div>

                                <div className="mb-3 form-check">
                                    <input type="checkbox" className="form-check-input" name="available" checked={this.state.available} onChange={this.handleChange} />
                                    <label className="form-check-label">Available in stock</label>
                                </div>

                                <div className="mb-3">
                                    <label className="form-label">Warranty (years)</label>
                                    <input type="number" className="form-control" name="warranty" value={this.state.warranty} onChange={this.handleChange} />
                                </div>

                                {/* form submit button */}
                                <button type="submit" className="btn btn-dark w-100">Submit</button>
                            </form>
                        </div>

                        {/* displaying details using bootstarp table */}
                        <div className="card mt-4 p-3">
                            <h4>Accessory Details</h4>
                            <table className="table table-bordered">
                                <tbody>
                                    <tr>
                                        <td>Name</td>
                                        <td>{this.state.accessoryName}</td>
                                    </tr>
                                    <tr>
                                        <td>Description</td>
                                        <td>{this.state.description}</td>
                                    </tr>
                                    <tr>
                                        <td>Category</td>
                                        <td>{this.state.category}</td>
                                    </tr>
                                    <tr>
                                        <td>Brand</td>
                                        <td>{this.state.brand}</td>
                                    </tr>
                                    <tr>
                                        <td>Available</td>
                                        <td>{this.state.available ? "Yes" : "No"}</td>
                                    </tr>
                                    <tr>
                                        <td>Warranty</td>
                                        <td>{this.state.warranty}</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default AccessoriesForm;