package com.SpringBootTesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootTesting.model.GroceryItem;
import com.SpringBootTesting.service.GroceryItemService;

@RestController
@RequestMapping("/api/items")
public class GroceryItemController {
	
	@Autowired
	private GroceryItemService groceryItemService;

	@GetMapping
	public List<GroceryItem> getAllItems() {
		return groceryItemService.getAllItems();
	}
	
	@GetMapping("/{id}")
	public GroceryItem getItemById(@PathVariable Long id) {
		return groceryItemService.getItemById(id);
	}
	
	@PostMapping
	public GroceryItem createItem(@RequestBody GroceryItem groceryItem) {
	    return groceryItemService.createItem(groceryItem);
	}

	@PutMapping("/{id}")
	public GroceryItem updateItemById(@PathVariable Long id, @RequestBody GroceryItem groceryItem) {
	    return groceryItemService.updateItemById(id, groceryItem);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItemById(@PathVariable Long id) {
		groceryItemService.deleteItemById(id);
	}
}