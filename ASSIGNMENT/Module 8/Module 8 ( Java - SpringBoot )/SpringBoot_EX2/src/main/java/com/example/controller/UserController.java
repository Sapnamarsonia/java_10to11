package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        // Create a list of users
        List<User> users = new ArrayList<>();
        users.add(new User("ABC", "abc@example.com"));
        users.add(new User("EFG", "efg@example.com"));
        users.add(new User("XYZ", "xyz@example.com"));

        // Add the list of users to the model
        model.addAttribute("users", users);

        // Return the name of the Thymeleaf template (without the .html extension)
        return "users";
    }
}
