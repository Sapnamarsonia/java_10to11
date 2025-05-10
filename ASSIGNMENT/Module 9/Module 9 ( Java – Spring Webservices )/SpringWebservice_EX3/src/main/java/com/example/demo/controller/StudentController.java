package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String showStudents(Model model) {
        // Create a list of students
        List<String> students = Arrays.asList("Demo1", "Demo2", "Demo3");
        
        // Add the list of students to the model
        model.addAttribute("students", students);
        
        // Return the view name
        return "students";
    }
}
