package com.KafkaProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}
}


/*
{
	"id": 1,
	"driverName": "Karan",
	"passengerName": "Rohan",
	"pickupLocation": "Badangpet",
	"dropLocation": "Dilsukhnagar",
	"fare": 200.0
}
*/