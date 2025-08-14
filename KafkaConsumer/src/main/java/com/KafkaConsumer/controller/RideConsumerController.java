package com.KafkaConsumer.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KafkaConsumer.entity.Ride;
import com.KafkaConsumer.repository.RideRepository;

@RestController
@RequestMapping("/rides")
public class RideConsumerController {

	private final RideRepository repository;

	public RideConsumerController(RideRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<Ride> getAll() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Ride> getById(@PathVariable int id) {
		return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
}