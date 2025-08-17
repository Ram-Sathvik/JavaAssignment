import logo from './logo.svg';
import './App.css';

import GroceryList from './assignments/GroceryList';
import Car from './assignments/Car';
import Phone from './assignments/Phone';
import SweetsList from './assignments/SweetsList';
import Electronics from './assignments/Electronics';
import CanteenMenu from './assignments/CanteenMenu';
import JuiceList from './assignments/JuiceList';
import Restaurant from './assignments/Restaurant';
import TempleList from './assignments/TempleList';
import TailorShop from './assignments/TailorShop';

function App() {

  const items = ["Rice", "Wheat", "Sugar", "Milk", "Oil"];

  return (
    <div>
      <GroceryList items={items} />
      <Car brand="Tata" model="Altroz" color="White" year="2020" /> 
      <Phone />
      <SweetsList />
      <Electronics />
      <CanteenMenu />
      <JuiceList />
      <Restaurant />
      <TempleList />
      <TailorShop />
    </div>
  );
}

export default App;