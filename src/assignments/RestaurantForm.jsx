import React, { useState, useEffect } from "react";

const RestaurantForm = () => {
  const [formData, setFormData] = useState({
    restaurantName: "",
    ownerName: "",
    email: "",
    contact: "",
    address: "",
    cuisine: "",
    openingHours: "",
  });

  const [submittedData, setSubmittedData] = useState(null);

  // Run on every render
  useEffect(() => {
    console.log("🍽️ Restaurant Form Rendered");
  });

  // Run only once (on mount)
  useEffect(() => {
    alert("Welcome to Restaurant Registration Form!");
  }, []);

  // Run whenever form data changes
  useEffect(() => {
    console.log("Form data changed:", formData);
  }, [formData]);

  // Auto-save every 5 seconds (cleanup with clearInterval)
  useEffect(() => {
    const interval = setInterval(() => {
      console.log("Auto-saving form data:", formData);
    }, 5000);

    return () => clearInterval(interval); // cleanup
  }, [formData]);

  // When inputs are given, the form data will be updated
  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  // When form is submitted, the form data will be stored
  const handleSubmit = (e) => {
    e.preventDefault();
    setSubmittedData(formData);
  };

  return (
    <div className="container mt-5">
      <h2 className="text-center">Restaurant Registration Form</h2>

      <form className="card p-4 shadow w-50 mx-auto" onSubmit={handleSubmit}>
        <div className="mb-3">
          <label className="form-label">Restaurant Name</label>
          <input type="text" name="restaurantName" className="form-control"
            value={formData.restaurantName} onChange={handleChange} required />
        </div>

        <div className="mb-3">
          <label className="form-label">Owner Name</label>
          <input type="text" name="ownerName" className="form-control"
            value={formData.ownerName} onChange={handleChange} required />
        </div>

        <div className="mb-3">
          <label className="form-label">Email</label>
          <input type="email" name="email" className="form-control"
            value={formData.email} onChange={handleChange} required />
        </div>

        <div className="mb-3">
          <label className="form-label">Contact Number</label>
          <input type="text" name="contact" className="form-control"
            value={formData.contact} onChange={handleChange} required />
        </div>

        <div className="mb-3">
          <label className="form-label">Address</label>
          <textarea name="address" className="form-control"
            value={formData.address} onChange={handleChange} required />
        </div>

        <div className="mb-3">
          <label className="form-label">Cuisine Type</label>
          <input type="text" name="cuisine" className="form-control"
            value={formData.cuisine} onChange={handleChange} required />
        </div>

        <div className="mb-3">
          <label className="form-label">Opening Hours</label>
          <input type="text" name="openingHours" className="form-control"
            value={formData.openingHours} onChange={handleChange} required />
        </div>

        <button type="submit" className="btn btn-dark">Register</button>
      </form>

      {/* JSON Output */}
      {submittedData && (
        <div className="mt-4">
          <h4>Submitted Data (JSON)</h4>
          <pre className="bg-light p-3 border rounded">
            {JSON.stringify(submittedData, null, 2)}
          </pre>
        </div>
      )}
    </div>
  );
};

export default RestaurantForm;