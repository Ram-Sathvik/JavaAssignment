package com.KafkaConsumer.service;

import java.util.Optional;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.KafkaConsumer.dto.RideDTO;
import com.KafkaConsumer.entity.Ride;
import com.KafkaConsumer.repository.RideRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RideConsumerService {

	private final RideRepository repository;
	private final ObjectMapper objectMapper = new ObjectMapper();

	public RideConsumerService(RideRepository repository) {
		this.repository = repository;
	}

	@KafkaListener(topics = "${wiproapp.topic.name}", groupId = "uber_ride_group")
	public void consume(String message) throws Exception {
		RideDTO dto = objectMapper.readValue(message, RideDTO.class);

		switch (dto.getOperation()) {
		case "CREATE":
			repository.save(new Ride(dto.getId(), dto.getDriverName(), dto.getPassengerName(), dto.getPickupLocation(),
					dto.getDropLocation(), dto.getFare()));
			break;
		case "UPDATE":
			Optional<Ride> existing = repository.findById(dto.getId());
			if (existing.isPresent()) {
				Ride r = existing.get();
				r.setDriverName(dto.getDriverName());
				r.setPassengerName(dto.getPassengerName());
				r.setPickupLocation(dto.getPickupLocation());
				r.setDropLocation(dto.getDropLocation());
				r.setFare(dto.getFare());
				repository.save(r);
			}
			break;
		case "DELETE":
			repository.deleteById(dto.getId());
			break;
		}
	}
}