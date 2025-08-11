package com.SpringBootTesting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootTesting.model.GroceryItem;
import com.SpringBootTesting.repository.GroceryItemRepository;

@Service
public class GroceryItemService {

	@Autowired
	private GroceryItemRepository groceryItemRepository;

	public List<GroceryItem> getAllItems() {
		return groceryItemRepository.findAll();
	}

	public GroceryItem getItemById(Long id) {
		return groceryItemRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Not found Item with ID: " + id));
	}

	public GroceryItem createItem(GroceryItem groceryItem) {
	    return groceryItemRepository.save(groceryItem);
	}

	public GroceryItem updateItemById(Long id, GroceryItem groceryItem) {
	    GroceryItem existingItem = groceryItemRepository.findById(id)
	        .orElseThrow(() -> new RuntimeException("Not found Item with ID: " + id));

	    existingItem.setName(groceryItem.getName());
	    existingItem.setQuantity(groceryItem.getQuantity());
	    existingItem.setPrice(groceryItem.getPrice());
	    
	    return groceryItemRepository.save(existingItem);
	}

	public void deleteItemById(Long id) {
		GroceryItem existingItem = groceryItemRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Not found Item with ID: " + id));
		
		groceryItemRepository.deleteById(existingItem.getId());
	}
}