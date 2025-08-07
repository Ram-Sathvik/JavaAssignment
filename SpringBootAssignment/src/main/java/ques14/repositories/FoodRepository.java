package ques14.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ques14.models.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {}