const CanteenItem = ({name, price, category, available}) => {
    return (
        <div>
            <p>Name: {name}, Price: {price}, Category: {category}, Available: {available}</p>
        </div>
    );
}

const CanteenMenu = () => {
    return (
        <div>
            <h2>Campus Food Court</h2>
            <h3>Block-A Ground Floor</h3>
            <h3>Open Hours: 8:00 AM to 8:00 PM</h3>
            <h3>Canteen Menu</h3>
            <ul>
                <li><CanteenItem name="Idli" price={30} category="Breakfast" available="Yes" /></li>
                <li><CanteenItem name="Dosa" price={5} category="Breakfast" available="Yes" /></li>
                <li><CanteenItem name="Poori" price={40} category="Breakfast" available="No" /></li>
                <li><CanteenItem name="Meals" price={120} category="Lunch" available="Yes" /></li>
            </ul>
            <hr />
        </div>
    );
}

export default CanteenMenu;