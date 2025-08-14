package com.KafkaProducer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KafkaProducer.entity.RideDTO;
import com.KafkaProducer.service.RideProducerService;

@RestController
@RequestMapping("/rides")
public class RideProducerController {

	private final RideProducerService service;

	public RideProducerController(RideProducerService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<String> create(@RequestBody RideDTO ride) throws Exception {
		ride.setOperation("CREATE");
		service.sendMessage(ride);
		return ResponseEntity.ok("Ride create request sent to Kafka");
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody RideDTO dto) throws Exception {
		dto.setId(id);
		dto.setOperation("UPDATE");
		service.sendMessage(dto);
		return ResponseEntity.ok("Ride update request sent to Kafka");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) throws Exception {
		RideDTO ride = new RideDTO();
		ride.setId(id);
		ride.setOperation("DELETE");
		service.sendMessage(ride);
		return ResponseEntity.ok("Ride delete request sent to Kafka");
	}
}