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

import ques14.models.Food;
import ques14.services.FoodService;

@RestController
@RequestMapping("/api/restaurants")
public class FoodController {
	
	@Autowired	
	private FoodService foodService;

	@GetMapping("/{restId}/foods")
	public List<Food> getAllFoodsByRestaurantId(@PathVariable int restId) {
		return foodService.getAllFoodsByRestaurantId(restId);
	}
	
	@PostMapping("/{restId}/foods")
	public void addFoodsToRestaurantById(@PathVariable int restId, @RequestBody Food food) {
		foodService.addFoodsToRestaurantById(restId, food);
	}
	
	@DeleteMapping("/foods/{foodId}")
	public void deleteFoodById(@PathVariable int foodId) {
		foodService.deleteFoodById(foodId);
	}
}