package ques14.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ques14.models.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {}