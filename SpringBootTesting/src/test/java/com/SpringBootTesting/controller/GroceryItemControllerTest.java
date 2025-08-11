package com.SpringBootTesting.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.SpringBootTesting.model.GroceryItem;
import com.SpringBootTesting.service.GroceryItemService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(GroceryItemController.class)
class GroceryItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GroceryItemService groceryItemService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testCreateItem() throws Exception {
        GroceryItem item = new GroceryItem(null, "Mango", 2, 15.0);
        GroceryItem savedItem = new GroceryItem(1L, "Mango", 2, 15.0);

        Mockito.when(groceryItemService.createItem(Mockito.any())).thenReturn(savedItem);

        mockMvc.perform(post("/api/items")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(item)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Mango"));
    }

    @Test
    void testGetAllItems() throws Exception {
        List<GroceryItem> list = Arrays.asList(
                new GroceryItem(1L, "Apple", 2, 10.0),
                new GroceryItem(2L, "Banana", 1, 5.0)
        );

        Mockito.when(groceryItemService.getAllItems()).thenReturn(list);

        mockMvc.perform(get("/api/items"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));
    }

    @Test
    void testGetItemById() throws Exception {
        GroceryItem item = new GroceryItem(1L, "Apple", 5, 10.0);
        Mockito.when(groceryItemService.getItemById(1L)).thenReturn(item);

        mockMvc.perform(get("/api/items/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Apple"));
    }

    @Test
    void testDeleteItem() throws Exception {
        Mockito.doNothing().when(groceryItemService).deleteItemById(1L);

        mockMvc.perform(delete("/api/items/1"))
                .andExpect(status().isOk());
    }
}