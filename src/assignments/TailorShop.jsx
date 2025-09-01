const ServiceCard = ({ name, price, available }) => {
    return (
        <div className="col-md-5 mb-4">
            <div className="card shadow-sm">
                <div className="card-body">
                    <h5 className="card-title">{name}</h5>
                    <p className="card-text">Price: ${price}</p>
                    <h6>Fabrics Available:</h6>
                    <ul>
                        {available.map((fabric) => (
                            <li>{fabric}</li>
                        ))}
                    </ul>
                </div>
            </div>
        </div>
    );
};

const TailorShop = () => {
    const services = [
        { name: "Shirt", price: 20, available: ["Cotton", "Linen", "Polyester"] },
        { name: "Pant", price: 30, available: ["Denim", "Wool", "Chino"] },
        { name: "Lehenga", price: 150, available: ["Silk", "Georgette", "Chiffon"] },
        { name: "Blouse", price: 40, available: ["Cotton", "Silk", "Satin"] },
    ];

    return (
        <div className="container mt-4">
            <h2 className="text-center mb-4">Tailoring Shop Services</h2>
            <div className="row">
                {services.map((service) => (
                    <ServiceCard name={service.name} price={service.price} available={service.available} />
                ))}
            </div>
        </div>
    );
};

export default TailorShop;