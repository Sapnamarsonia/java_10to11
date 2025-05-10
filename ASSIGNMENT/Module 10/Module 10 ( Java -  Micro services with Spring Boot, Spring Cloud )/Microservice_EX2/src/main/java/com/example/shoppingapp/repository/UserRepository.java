package com.example.shoppingapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppingapp.controller.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}