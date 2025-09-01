import { useState } from "react";

const Phone = () => {
    const brand = "Apple";
    const model = "iPhone 15";
    const [price, setPrice] = useState(80000);

    return (
        <div>
            <h2>Phone Details</h2>
            <p>Brand: {brand}</p>
            <p>Model: {model}</p>
            <p>Price: {price}</p>
            <button onClick={() => { setPrice(price + 10000) }}>Increase Price</button>
        </div>
    );
}

export default Phone;