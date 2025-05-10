package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create or Update
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Read (Select all)
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Read (Select by ID)
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Delete
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
