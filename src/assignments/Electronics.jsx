import { useState } from "react";

function Electronics() {
    const name = "Laptop";
    const [brand, setBrand] = useState("Dell");
    const [price, setPrice] = useState(50000);

    return (
        <div>
            <h2>Electronic Item Details</h2>
            <p>Name: {name}</p>
            <p>Brand: {brand}</p>
            <p>Price: {price}</p>
            <button onClick={() => setBrand("HP")}>Change Brand</button>
            <button onClick={() => setPrice(price + 10000)}>Increase Price</button>
            <hr />
        </div>
    );
}

export default Electronics;