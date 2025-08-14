package com.KafkaConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KafkaConsumer.entity.Ride;

public interface RideRepository extends JpaRepository<Ride, Integer> {}