package eureka.ProducerRestaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages= {"eureka"})

public class ProducerRestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerRestaurantApplication.class, args);
	}
}