package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot MVC with JSP!");
        return "welcome"; // maps to /WEB-INF/views/welcome.jsp
    }
}
