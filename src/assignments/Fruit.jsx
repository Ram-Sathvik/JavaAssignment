import { Component } from "react";

// arrow functional component
const FruitList = ({fruits}) => {
    return (
        // iterating fruits array and displaying as unordered list
        <ul>
            {fruits.map((fruit) => (
                <li>{fruit}</li>
            ))}
        </ul>
    );
}

// class component
class Fruit extends Component {
    constructor(props) {
        super(props);
        this.state = {
            fruits: ["Apple", "Banana", "Orange"],
            inputFruit: ""
        };
    }

    // updated the value in input field using setState
    handleChange = (e) => {
        this.setState({ inputFruit: e.target.value });
    }

    // added fruit in input field to fruits array and reset input fruit
    addFruit = () => {
        this.setState({
            fruits: [...this.state.fruits, this.state.inputFruit],
            inputFruit: ""
        });
    }

    render() {
        return (
            <div>
                <h2>Fruits</h2>

                {/* handleChange method is called when some input is given */}
                <input type="text" value={this.state.inputFruit} onChange={this.handleChange} placeholder="Enter fruit" /> 

                {/* addFruit method is called when button is clicked */}
                <button onClick={this.addFruit}>Add fruit</button>

                <FruitList fruits={this.state.fruits} />
            </div>
        );
    }
}

export default Fruit;