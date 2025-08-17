import { Component } from "react";

class MenuItem extends Component {
    render() {
        const { name, price, category, available } = this.props;
        return (
            <div>
                <p>Name: {name}, Price: {price}, Category: {category}, Available: {available}</p>
            </div>
        );
    }
}

class Restaurant extends Component {
    render() {
        return (
            <div>
                <h2>Spice Hub</h2>
                <h3>Block B, First Floor</h3>
                <h3>Open Hours: 10:00 AM to 10:00 PM</h3>
                <h3>Restaurant Menu</h3>
                <ul>
                    <li><MenuItem name="Paneer Butter Masala" price={150} category="Main Course" available="Yes" /></li>
                    <li><MenuItem name="Chicken Biryani" price={200} category="Main Course" available="Yes" /></li>
                    <li><MenuItem name="Gulab Jamun" price={40} category="Breakfast" available="No" /></li>
                    <li><MenuItem name="Veg Thali" price={120} category="Combo" available="Yes" /></li>
                </ul>
                <hr />
            </div>
        );
    }
}

export default Restaurant;