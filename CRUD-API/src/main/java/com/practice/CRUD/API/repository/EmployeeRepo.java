package com.practice.CRUD.API.repository;

import com.practice.CRUD.API.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee , Long> {
}
