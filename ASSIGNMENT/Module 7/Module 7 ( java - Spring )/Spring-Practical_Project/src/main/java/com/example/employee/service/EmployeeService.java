package com.example.employee.service;

import com.example.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void saveEmployee(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> searchEmployees(String keyword);
}
