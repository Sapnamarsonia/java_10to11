package com.example.orderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Value("${user.service.url}")
    private String userServiceUrl;

    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/orders")
    public String getOrder(@RequestParam String orderId, @RequestParam String username) {
        // Call UserService to fetch user data
        String userResponse = restTemplate.getForObject(userServiceUrl + "?username=" + username, String.class);
        return "Order ID: " + orderId + ", " + userResponse;
    }
}
