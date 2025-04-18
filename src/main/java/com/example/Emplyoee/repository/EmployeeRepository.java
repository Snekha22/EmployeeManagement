package com.example.Emplyoee.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Emplyoee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}