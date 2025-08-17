const Juice = ({ id, name, price }) => {
    return (
        <tr>
            <td>{id}</td>
            <td>{name}</td>
            <td>₹{price}</td>
        </tr>
    );
}

const JuiceList = () => {
    const juices = [
        { 
            id: 1, 
            name: "Orange Juice", 
            price: 80
        },
        { 
            id: 2, 
            name: "Apple Juice", 
            price: 100
        },
        { 
            id: 3, 
            name: "Mango Juice", 
            price: 120
        }
    ]

    return (
        <div>
            <h2>Juice Menu</h2>
            <table border="2">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Juice Name</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    {juices.map((juice) => (
                        <Juice key={juice.id} id={juice.id} name={juice.name} price={juice.price} />
                    ))}
                </tbody>
            </table>
            <hr />
        </div>
    );
}

export default JuiceList;