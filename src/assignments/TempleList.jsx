function TempleList() {
    const temples = [
        {
            id: 1,
            name: "Meenakshi Amman Temple",
            location: "Madurai, Tamil Nadu",
            deities: ["Meenakshi", "Sundareshwar"]
        },
        {
            id: 2,
            name: "Sri Venkateshwara Temple",
            location: "Tirupati, Andhra Pradesh",
            deities: ["Venkateshwara", "Lakshmi"]
        },
        {
            id: 3,
            name: "Jagannath Temple",
            location: "Puri, Odisha",
            deities: ["Jagannath", "Balabhadra", "Subhadra"]
        }
    ]

    return (
        <div>
            <h2>Famous Temples in India</h2>
            <table border="2">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Temple Name</th>
                        <th>Location</th>
                        <th>Deities</th>
                    </tr>
                </thead>
                <tbody>
                    {temples.map((temple) => (
                        <tr key={temple.id}>
                            <td>{temple.id}</td>
                            <td>{temple.name}</td>
                            <td>{temple.location}</td>
                            <td>
                                <ul>
                                    {temple.deities.map((deity) => (
                                        <li>{deity}</li>
                                    ))}
                                </ul>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
            <hr />
        </div>
    );
}

export default TempleList;