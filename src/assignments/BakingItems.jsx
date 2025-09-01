import { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

function BakingItems() {
    const [form, setForm] = useState({
        itemName: "",
        quantity: "",
        ingredients: "",
        bakingTime: "",
        category: "Cake"
    });

    const [items, setItems] = useState([]);

    const handleChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = (e) => {
        // prevents page from reloading when form is submitted
        e.preventDefault();

        // updates the items by adding the item from input field and resets the form
        setItems([...items, form]);
        setForm({ itemName: "", quantity: "", ingredients: "", bakingTime: "", category: "Cake" });
    };

    return (
        <div className="container mt-4">
            <div className="card p-4 shadow-sm" style={{ maxWidth: "600px", margin: "0 auto" }}>
                <h3 className="mb-3">Baking Items Form</h3>
                <form onSubmit={handleSubmit}>

                    {/* input fields */}
                    <div className="mb-3">
                        <label className="form-label">Item Name</label>
                        <input type="text" className="form-control" name="itemName" value={form.itemName} onChange={handleChange} required />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Quantity</label>
                        <input type="number" className="form-control" name="quantity" value={form.quantity} onChange={handleChange} required />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Ingredients</label>
                        <input type="text" className="form-control" name="ingredients" value={form.ingredients} onChange={handleChange} required />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Baking Time (minutes)</label>
                        <input type="number" className="form-control" name="bakingTime" value={form.bakingTime} onChange={handleChange} required />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Category</label>
                        <select className="form-control" name="category" value={form.category} onChange={handleChange} >
                            <option value="Cake">Cake</option>
                            <option value="Bread">Bread</option>
                            <option value="Pastry">Pastry</option>
                        </select>
                    </div>
                    <button type="submit" className="btn btn-dark w-100">Add Baking Item</button>
                </form>
            </div>

            {/* the details of the baking items will be displayed only if there is atleast one baking item added */}
            {items.length > 0 && (
                <div className="card mt-4 p-3 shadow-sm">
                    <h4>Baking Items List</h4>
                    <table className="table table-bordered table-striped">
                        <thead className="table-dark">
                            <tr>
                                <th>Item Name</th>
                                <th>Quantity</th>
                                <th>Ingredients</th>
                                <th>Baking Time</th>
                                <th>Category</th>
                            </tr>
                        </thead>
                        <tbody>
                            {items.map((item) => (
                                <tr>
                                    <td>{item.itemName}</td>
                                    <td>{item.quantity}</td>
                                    <td>{item.ingredients}</td>
                                    <td>{item.bakingTime} mins</td>
                                    <td>{item.category}</td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                </div>
            )}
        </div>
    );
}

export default BakingItems;
