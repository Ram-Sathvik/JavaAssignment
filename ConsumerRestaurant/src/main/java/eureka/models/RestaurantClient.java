package eureka.models;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ProducerRestaurant")
public interface RestaurantClient {

	@GetMapping("/restaurants")
    List<Restaurant> getAllRestaurants();
}