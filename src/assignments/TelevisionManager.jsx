import { Component } from "react";

// arrow functional component
const TelevisionList = ({ models }) => {
    return (
        // iterating models array and displaying as unordered list
        <ul>
            {models.map((model) => (
                <li>{model}</li>
            ))}
        </ul>
    );
}

// class component
class TelevisionManager extends Component {
    constructor(props) {
        super(props);
        this.state = {
            models: ["Sony A95K", "LG C4 OLED", "Samsung S95D OLED"],
            inputModel: ""
        }
    }

    // updated the value in input field using setState
    handleChange = (e) => {
        this.setState({ inputModel: e.target.value });
    }

    // added fruit in input field to fruits array and reset input fruit
    addModel = () => {
        this.setState({
            models: [...this.state.models, this.state.inputModel],
            inputModel: ""
        })
    }

    render() {
        return (
            <div>
                <h2>TV Models</h2>

                {/* handleChange method is called when some input is given */}
                <input type="text" value={this.state.inputModel} onChange={this.handleChange} placeholder="Enter TV model" />

                {/* addFruit method is called when button is clicked */}
                <button onClick={this.addModel}>Add model</button>

                <TelevisionList models={this.state.models} />
            </div>
        );
    }
}

export default TelevisionManager;