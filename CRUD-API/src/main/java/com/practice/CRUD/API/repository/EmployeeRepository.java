package com.practice.CRUD.API.repository;

import com.practice.CRUD.API.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}