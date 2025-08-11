package com.SpringBootTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootTesting.model.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {}