import "bootstrap/dist/css/bootstrap.min.css";

const ServiceCard = ({ serviceName, price, fabricsAvailable }) => {
    return (
        <div className="col-md-4 mb-3">
            <div className="card shadow-sm">
                <div className="card-body">
                    <h5 className="card-title">{serviceName}</h5>
                    <p className="card-text">Price: ${price}</p>
                    <h6>Fabrics Available:</h6>
                    <ul>
                        {fabricsAvailable.map((fabric) => (
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
        { serviceName: "Shirt", price: 20, fabricsAvailable: ["Cotton", "Linen", "Polyester"] },
        { serviceName: "Pant", price: 30, fabricsAvailable: ["Denim", "Wool", "Chino"] },
        { serviceName: "Lehenga", price: 150, fabricsAvailable: ["Silk", "Georgette", "Chiffon"] },
        { serviceName: "Blouse", price: 40, fabricsAvailable: ["Cotton", "Silk", "Satin"] },
    ];

    return (
        <div className="container mt-4">
            <h2 className="text-center mb-4">Tailoring Shop Services</h2>
            <div className="row">
                {services.map((service, index) => (
                    <ServiceCard key={index} serviceName={service.serviceName} price={service.price} fabricsAvailable={service.fabricsAvailable} />
                ))}
            </div>
        </div>
    );
};

export default TailorShop;