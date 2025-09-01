import { useEffect, useState } from "react";
import axios from "axios";

const TailoringInventory = () => {
  const [items, setItems] = useState([]);

  // Fetch items on mount
  useEffect(() => {
    axios
      .get("http://localhost:5000/tailoringItems")
      .then((res) => setItems(res.data))
      .catch((err) => console.error("Error fetching items:", err));
  }, []);

  return (
    <div className="container mt-5">
      <h2 className="text-center">Tailoring Shop Inventory</h2>

      <table className="table table-bordered table-striped mt-3">
        <thead className="table-dark">
          <tr>
            <th>ID</th>
            <th>Item Name</th>
            <th>Size</th>
            <th>Price (₹)</th>
          </tr>
        </thead>
        <tbody>
          {items.length > 0 ? (
            items.map((item) => (
              <tr key={item.id}>
                <td>{item.id}</td>
                <td>{item.name}</td>
                <td>{item.size}</td>
                <td>{item.price}</td>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="4" className="text-center">
                Loading inventory...
              </td>
            </tr>
          )}
        </tbody>
      </table>
    </div>
  );
};

export default TailoringInventory;