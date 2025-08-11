package com.zipkin.OrderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/order")
  public String order() {
    String paymentResp = restTemplate.getForObject("http://localhost:8082/payment", String.class);
    return "Order placed successfully, Payment: " + paymentResp;
  }
}