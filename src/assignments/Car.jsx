import { Component } from "react";

class Car extends Component {
    render() {
        const { brand, model, color, year } = this.props;
        return (
            <div>
                <h2>Car Details</h2>
                <p>Brand: {brand}</p>
                <p>Model: {model}</p>
                <p>Color: {color}</p>
                <p>Year: {year}</p>
                <hr />
            </div>
        );
    }
}

export default Car;