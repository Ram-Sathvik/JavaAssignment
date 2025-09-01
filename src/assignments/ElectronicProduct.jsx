import { useEffect, useState } from "react";

const LoadingComponent = () => {
    return (
        <h2>Loading Product Details...</h2>
    );
}

const ErrorComponent = () => {
    return (
        <h2>Error fetching product details</h2>  
    );
}

const ProductComponent = ({ product }) => {
    return (
        <div className="card p-4 shadow m-4">
            <h2>Electronic Product Details</h2>
            <p>Name: {product.name}</p>
            <p>Brand: {product.brand}</p>
            <p>Price: {product.price}</p>
            <p>Category: {product.category} ({product.price > 50000 ? "Premium Product" : "Budget Product"}) </p>
            <p>{product.warranty > 0 ? `Warranty: ${product.warranty} years` : "No Warranty"}</p>
            <p>{product.availability ? "In stock" : "Out of stock"}</p>
            {product.category === "Laptop" && <p>Free Laptop Bag Offer</p>}
        </div>
    );
}

function ElectronicProduct() {

    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(false);
    const [product, setProduct] = useState(null);

    useEffect(() => {
        setTimeout(() => {
            setProduct({
                name: "HP",
                brand: "Pavilion 15",
                price: 70000,
                category: "Laptop",
                warranty: 2,
                availability: true
            });

            // setProduct({
            //     name: "11X Pro",
            //     brand: "MI",
            //     price: 30000,
            //     category: "Mobile",
            //     warranty: 1,
            //     availability: true
            // });

            // setError(true);

            setLoading(false);
        }, 2000);
    }, [])

    return (
        <div>
            {loading ? <LoadingComponent /> : error ? <ErrorComponent /> : <ProductComponent product={product} />}
        </div>
    );
}

export default ElectronicProduct;