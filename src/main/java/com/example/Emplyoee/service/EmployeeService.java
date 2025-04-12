package com.example.Emplyoee.service;

import org.springframework.stereotype.Service;

import com.example.Emplyoee.entity.Employee;
import com.example.Emplyoee.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
 private final EmployeeRepository repository;

 public EmployeeService(EmployeeRepository repository) {
     this.repository = repository;
 }

 public List<Employee> getAllEmployees() {
     return repository.findAll();
 }

 public Optional<Employee> getEmployeeById(Long id) {
     return repository.findById(id);
 }

 public Employee saveEmployee(Employee employee) {
     return repository.save(employee);
 }

 public void deleteEmployee(Long id) {
     repository.deleteById(id);
 }
}






