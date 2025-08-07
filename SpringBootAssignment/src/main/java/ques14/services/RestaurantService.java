package ques14.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ques14.models.Restaurant;
import ques14.repositories.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;

	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.findAll();
	}

	public Restaurant getRestaurantById(int restId) {
		return restaurantRepository.findById(restId)
				.orElseThrow(() -> new RuntimeException("No Restaurant found with ID: " + restId));
	}

	public void createRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}

	public void deleteRestaurantById(int restId) {
		Restaurant existingRestaurant = restaurantRepository.findById(restId)
				.orElseThrow(() -> new RuntimeException("No Restaurant found with ID: " + restId));
		
		restaurantRepository.deleteById(existingRestaurant.getRestId());
	}	
}