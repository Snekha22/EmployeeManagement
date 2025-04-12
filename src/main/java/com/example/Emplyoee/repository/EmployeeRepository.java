package com.example.Emplyoee.repository;



//repository/EmployeeRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Emplyoee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
