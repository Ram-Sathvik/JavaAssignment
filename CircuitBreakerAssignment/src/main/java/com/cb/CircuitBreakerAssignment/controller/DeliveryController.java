package com.cb.CircuitBreakerAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.CircuitBreakerAssignment.service.DeliveryService;

@RestController
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/check-delivery")
    public String checkDeliveryStatus() {
        return deliveryService.getDeliveryStatus();
    }
}