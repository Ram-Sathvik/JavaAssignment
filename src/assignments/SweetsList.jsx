function SweetsList() {
    const sweets = [
        {
            id: 1,
            name: "Laddu",
            price: 50
        },
        {
            id: 2,
            name: "Jalebi",
            price: 40
        },
        {
            id: 3,
            name: "Rasgulla",
            price: 60
        },
        {
            id: 2,
            name: "Gulab Jamun",
            price: 70
        }
    ];
    return (
        <div>
            <h2>Sweets List</h2>
            {sweets.map((sweet) => (
                <p>
                    {sweet.name} - Price: ₹{sweet.price}
                </p>
            ))}
            <hr />
        </div>
    );
}

export default SweetsList;