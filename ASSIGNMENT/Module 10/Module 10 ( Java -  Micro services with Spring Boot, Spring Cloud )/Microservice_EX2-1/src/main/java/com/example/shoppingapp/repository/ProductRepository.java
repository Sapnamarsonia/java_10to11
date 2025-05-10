package com.example.shoppingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppingapp.controller.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
