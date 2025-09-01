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
import Fruit from './assignments/Fruit';
import TelevisionManager from './assignments/TelevisionManager';
import MarriageForm from './assignments/MarriageForm';
import AccessoriesForm from './assignments/AccessoriesForm';
import BakingItems from './assignments/BakingItems';
import FlightBooking from './assignments/FlightBooking';
import ElectronicProduct from './assignments/ElectronicProduct';
import FurnitureStore from './assignments/FurnitureStore';
import Festival from './assignments/Festival';
import RestaurantForm from './assignments/RestaurantForm';
import TailoringInventory from './assignments/TailoringInventory';

function App() {

  const items = ["Rice", "Wheat", "Sugar", "Milk", "Oil"];

  return (
    <div>
      <GroceryList items={items} /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <Car brand="Tata" model="Altroz" color="White" year="2020" /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <Phone /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <SweetsList /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <Electronics /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <CanteenMenu /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <JuiceList /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <Restaurant /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <TempleList /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <TailorShop /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <Fruit /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <TelevisionManager /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <MarriageForm /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <AccessoriesForm /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <BakingItems /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <FlightBooking /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <ElectronicProduct /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <FurnitureStore /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <Festival /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <RestaurantForm /> <hr style={{ height: "10px", backgroundColor: "black" }} />
      <TailoringInventory /> <hr style={{ height: "10px", backgroundColor: "black" }} />
    </div>
  );
}

export default App;