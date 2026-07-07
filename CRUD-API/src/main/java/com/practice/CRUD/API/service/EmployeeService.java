package com.practice.CRUD.API.service;

import com.practice.CRUD.API.Models.Employee;
import com.practice.CRUD.API.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    /// create
    public Employee save(Employee employee){
        return  employeeRepo.save(employee);
    }

    /// read All
    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }

    /// Read by ID
    public Employee getById(Long id){
        return employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found by id"));
    }
}
