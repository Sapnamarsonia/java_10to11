package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // Create or Update
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Read All
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    // Delete
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
    // Get Employee by Deparment
    public List<Employee> getEmployeesByDepartment(String department) {
        return repository.findByDepartment(department);
    }

}
