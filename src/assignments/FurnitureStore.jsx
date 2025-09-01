import { useState } from "react";

const Chair = ({ details }) => (
    <div className="card p-3 shadow">
        <h3>Chair</h3>
        <p>Brand: {details.brand}</p>
        <p>Material: {details.material}</p>
        <p>Size: {details.size}</p>
        <p>Price: Rs.{details.price}</p>
    </div>
);

const Table = ({ details }) => (
    <div className="card p-3 shadow">
        <h3>Table</h3>
        <p>Brand: {details.brand}</p>
        <p>Merial: {details.material}</p>
        <p>Size: {details.size}</p>
        <p>Price: Rs.{details.price}</p>
    </div>
);

const Sofa = ({ details }) => (
    <div className="card p-3 shadow">
        <h3>Sofa</h3>
        <p>Brand: {details.brand}</p>
        <p>Material: {details.material}</p>
        <p>Size: {details.size}</p>
        <p>Price: Rs.{details.price}</p>
    </div>
);

const Bed = ({ details }) => (
    <div className="card p-3 shadow">
        <h3>Bed</h3>
        <p>Brand: {details.brand}</p>
        <p>Material: {details.material}</p>
        <p>Size: {details.size}</p>
        <p>Price: Rs.{details.price}</p>
    </div>
);

const FurnitureStore = () => {
    const [furniture, setFurniture] = useState("Chair");

    const furnitureDetails = {
        Chair: { 
            brand: "Green Soul",
            material: "Velour fabric", 
            size: "Medium", 
            price: 20000 
        },
        Table: { 
            brand: "Pepperfry",
            material: "Glass",
            size: "Large",
            price: 12000
        },
        Sofa: {
            brand: "Kurlon",
            material: "Leather",
            size: "3-Seater",
            price: 30000
        },
        Bed: {
            brand: "Sleepwell",
            material: "Teak Wood",
            size: "Large",
            price: 35000
        },
    };

    const displayFurniture = () => {
        switch (furniture) {
            case "Chair": return <Chair details={furnitureDetails.Chair} />;
            case "Table": return <Table details={furnitureDetails.Table} />;
            case "Sofa": return <Sofa details={furnitureDetails.Sofa} />;
            case "Bed": return <Bed details={furnitureDetails.Bed} />;
            default: return <p>Please select a furniture item.</p>;
        }
    };

    return (
        <div className="container mt-5 text-center">
        <h2>Furniture Store</h2>

        <select className="form-select w-50 mx-auto mt-3" value={furniture} onChange={(e) => setFurniture(e.target.value)} >
            <option value="Chair">Chair</option>
            <option value="Table">Table</option>
            <option value="Sofa">Sofa</option>
            <option value="Bed">Bed</option>
        </select>

        <div className="mt-4 w-50 mx-auto">{displayFurniture()}</div>
        </div>
    );
};

export default FurnitureStore;