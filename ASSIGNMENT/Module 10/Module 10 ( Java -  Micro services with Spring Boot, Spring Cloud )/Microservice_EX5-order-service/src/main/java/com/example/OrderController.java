package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{userId}")
    public String getUserFromOrder(@PathVariable String userId) {
        String userServiceUrl = "http://user-service/users/" + userId;
        return restTemplate.getForObject(userServiceUrl, String.class);
    }
}