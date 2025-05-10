package com.example.shoppingapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.shoppingapp.model.LoginRequest;
import com.example.shoppingapp.repository.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository userRepository; 

    @Autowired
    private RestTemplate restTemplate;
    private static final String PRODUCT_SERVICE_URL = "http://localhost:8082/products/list";

    public List<Product> getAllProductsFromProductService() {
        ResponseEntity<List<Product>> response = restTemplate.exchange(
            PRODUCT_SERVICE_URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {}
        );
        return response.getBody();
    }
    public void saveUser(User user) 
    {
        userRepository.save(user); // Save user to the database
    }
    // Method to validate user during login
    public boolean validateUser(LoginRequest loginRequest) {
        // Find user by username
        User user = new User();
        
        // Validate password
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return true;
        }
        return false;
    }
}
