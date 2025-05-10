package com.example.userservice.service;

import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService 
{

    @Autowired
    private UserRepository userRepository;

    // Create a new user
    public User createUser(User user) 
    {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() 
    {
        return userRepository.findAll();
    }

    // Get a user by id
    public Optional<User> getUserById(Long id) 
    {
        return userRepository.findById(id);
    }

    // Update a user
    public User updateUser(Long id, User userDetails) 
    {
        User user = userRepository.findById(id).orElseThrow();
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

    // Delete a user
    public void deleteUser(Long id) 
    {
        userRepository.deleteById(id);
    }
}
