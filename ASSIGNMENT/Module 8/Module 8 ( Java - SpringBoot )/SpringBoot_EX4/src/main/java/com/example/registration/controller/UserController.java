package com.example.registration.controller;

import com.example.registration.model.User;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    // Show the registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";  // Return view name for the registration form
    }

    // Handle form submission and validation
    @PostMapping("/register")
    public String submitRegistrationForm(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "register";  // Return the form view with error messages
        }

        // Logic for successful registration (e.g., saving user to the database)
        model.addAttribute("message", "Registration successful!");
        return "registration-success";  // Return a success view
    }
}
