package eureka.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eureka.models.Restaurant;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	@GetMapping
	public List<Restaurant> getAllRestaurants() {
		return List.of(new Restaurant(1, "Bawarchi", "Hyderabad"), new Restaurant(2, "Saravana Bhavan", "Chennai"));
	}
}