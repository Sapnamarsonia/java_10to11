package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String submitForm(@Valid @ModelAttribute("user") User user,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        return "success";
    }
}
