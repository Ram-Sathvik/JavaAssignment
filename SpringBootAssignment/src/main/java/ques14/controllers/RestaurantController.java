package ques14.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ques14.models.Restaurant;
import ques14.services.RestaurantService;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping
	public List<Restaurant> getAllRestaurants() {
		return restaurantService.getAllRestaurants();
	}
	
	@GetMapping("/{restId}")
	public Restaurant getRestaurantById(@PathVariable int restId) {
		return restaurantService.getRestaurantById(restId);
	}
	
	@PostMapping
	public void createRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.createRestaurant(restaurant);
	}
	
	@DeleteMapping("/{restId}")
	public void deleteRestaurantById(@PathVariable int restId) {
		restaurantService.deleteRestaurantById(restId);
	}
}