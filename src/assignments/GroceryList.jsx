function GroceryList({items}) {
    return (
        <div>
            <h2>Grocery List</h2>
            <ul>
                {items.map((item, index) => (
                    <li key={index}>{item}</li>
                ))}
            </ul>
            <button onClick={() => alert("Groceries added to cart")}>Add to Cart</button>
        </div>
    );
}

export default GroceryList;