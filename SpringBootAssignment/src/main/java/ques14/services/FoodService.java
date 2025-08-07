package ques14.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ques14.models.Food;
import ques14.models.Restaurant;
import ques14.repositories.FoodRepository;
import ques14.repositories.RestaurantRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	@Autowired
	private RestaurantRepository restaurantRepository;

	public List<Food> getAllFoodsByRestaurantId(int restId) {
		Restaurant existingRestaurant = restaurantRepository.findById(restId)
				.orElseThrow(() -> new RuntimeException("No Restaurant found with ID: " + restId));
		
		return existingRestaurant.getFoodsList();
	}
	
	public void addFoodsToRestaurantById(int restId, Food food) {
		Restaurant existingRestaurant = restaurantRepository.findById(restId)
				.orElseThrow(() -> new RuntimeException("No Restaurant found with ID: " + restId));
		
		food.setRestaurant(existingRestaurant);
        foodRepository.save(food);
	}
	
	public void deleteFoodById(int foodId) {
		Food existingFood = foodRepository.findById(foodId)
				.orElseThrow(() -> new RuntimeException("No Food found with ID: " + foodId));
		
		foodRepository.deleteById(existingFood.getFoodId());
	}
}