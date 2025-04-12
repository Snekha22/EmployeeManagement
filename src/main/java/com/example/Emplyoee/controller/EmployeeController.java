package com.example.Emplyoee.controller;

//controller/EmployeeController.java

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.Emplyoee.entity.Employee;
import com.example.Emplyoee.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

 private final EmployeeService service;

 public EmployeeController(EmployeeService service) {
     this.service = service;
 }

 @GetMapping
 public String listEmployees(Model model) {
     model.addAttribute("employees", service.getAllEmployees());
     return "employee_list";
 }

 @GetMapping("/new")
 public String showCreateForm(Model model) {
     model.addAttribute("employee", new Employee());
     return "employee_form";
 }

 @PostMapping
 public String saveEmployee(@Valid @ModelAttribute Employee employee, BindingResult result) {
     if (result.hasErrors()) return "employee_form";
     service.saveEmployee(employee);
     return "redirect:/employees";
 }

 @GetMapping("/edit/{id}")
 public String showEditForm(@PathVariable Long id, Model model) {
     model.addAttribute("employee", service.getEmployeeById(id).orElseThrow());
     return "employee_form";
 }

 @PostMapping("/update/{id}")
 public String updateEmployee(@PathVariable Long id, @Valid @ModelAttribute Employee employee, BindingResult result) {
     if (result.hasErrors()) return "employee_form";
     employee.setId(id);
     service.saveEmployee(employee);
     return "redirect:/employees";
 }

 @GetMapping("/delete/{id}")
 public String deleteEmployee(@PathVariable Long id) {
     service.deleteEmployee(id);
     return "redirect:/employees";
 }

 @GetMapping("/view/{id}")
 public String viewEmployee(@PathVariable Long id, Model model) {
     model.addAttribute("employee", service.getEmployeeById(id).orElseThrow());
     return "employee_view";
 }
}
