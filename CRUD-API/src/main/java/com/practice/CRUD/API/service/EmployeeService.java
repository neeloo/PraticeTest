package com.practice.CRUD.API.service;

import com.practice.CRUD.API.Models.Employee;
import com.practice.CRUD.API.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Create
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    // Read All
    public List<Employee> getAll() {
        return repository.findAll();
    }

    // Read By Id
    public Employee getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    // Update
    public Employee update(Long id, Employee employee) {

        Employee existing = getById(id);

        existing.setName(employee.getName());
        existing.setEmail(employee.getEmail());
        existing.setSalary(employee.getSalary());

        return repository.save(existing);
    }

    // Delete
    public void delete(Long id) {
        repository.deleteById(id);
    }
}