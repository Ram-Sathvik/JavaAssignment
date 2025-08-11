package com.SpringBootTesting.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.SpringBootTesting.model.GroceryItem;
import com.SpringBootTesting.repository.GroceryItemRepository;

class GroceryItemServiceTest {

    @Mock
    private GroceryItemRepository groceryItemRepository;

    @InjectMocks
    private GroceryItemService groceryItemService;

    public GroceryItemServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllItems() {
        List<GroceryItem> list = Arrays.asList(
                new GroceryItem(1L, "Apple", 5, 10.0),
                new GroceryItem(2L, "Banana", 3, 5.0)
        );

        when(groceryItemRepository.findAll()).thenReturn(list);

        List<GroceryItem> result = groceryItemService.getAllItems();
        assertEquals(2, result.size());
        verify(groceryItemRepository, times(1)).findAll();
    }

    @Test
    void testGetItemById() {
        GroceryItem item = new GroceryItem(1L, "Apple", 5, 10.0);
        when(groceryItemRepository.findById(1L)).thenReturn(Optional.of(item));

        GroceryItem result = groceryItemService.getItemById(1L);
        assertEquals("Apple", result.getName());
    }

    @Test
    void testCreateItem() {
        GroceryItem item = new GroceryItem(null, "Mango", 2, 15.0);
        GroceryItem savedItem = new GroceryItem(1L, "Mango", 2, 15.0);

        when(groceryItemRepository.save(item)).thenReturn(savedItem);

        GroceryItem result = groceryItemService.createItem(item);
        assertEquals(1L, result.getId());
    }

    @Test
    void testUpdateItemById() {
        GroceryItem existing = new GroceryItem(1L, "Apple", 5, 10.0);
        GroceryItem update = new GroceryItem(1L, "Orange", 10, 20.0);

        when(groceryItemRepository.findById(1L)).thenReturn(Optional.of(existing));
        when(groceryItemRepository.save(existing)).thenReturn(update);

        GroceryItem result = groceryItemService.updateItemById(1L, update);
        assertEquals("Orange", result.getName());
    }

    @Test
    void testDeleteItemById() {
        GroceryItem existing = new GroceryItem(1L, "Apple", 5, 10.0);
        when(groceryItemRepository.findById(1L)).thenReturn(Optional.of(existing));
        doNothing().when(groceryItemRepository).deleteById(1L);

        groceryItemService.deleteItemById(1L);
        verify(groceryItemRepository, times(1)).deleteById(1L);
    }
}