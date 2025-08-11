package com.SpringBootTesting.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.SpringBootTesting.model.GroceryItem;
import com.SpringBootTesting.repository.GroceryItemRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class GroceryItemIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private GroceryItemRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup() {
        repository.deleteAll();
    }

    @Test
    void testCreateAndRetrieveItem() throws Exception {
        GroceryItem item = new GroceryItem(null, "Tomato", 3, 9.0);

        MvcResult result = mockMvc.perform(post("/api/items")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(item)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Tomato"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        GroceryItem savedItem = objectMapper.readValue(response, GroceryItem.class);

        mockMvc.perform(get("/api/items/" + savedItem.getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.quantity").value(3));
    }

    @Test
    void testGetAllItems() throws Exception {
        repository.save(new GroceryItem(null, "A", 1, 2.0));
        repository.save(new GroceryItem(null, "B", 2, 3.0));

        mockMvc.perform(get("/api/items"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));
    }
}