package com.example.Emplyoee.entity;

//model/Employee.java

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @NotBlank(message = "Name is mandatory")
 private String name;

 @Email(message = "Email should be valid")
 private String email;

 @NotBlank(message = "Department is required")
 private String department;

/**
 * @return the id
 */
public Long getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the department
 */
public String getDepartment() {
	return department;
}

/**
 * @param department the department to set
 */
public void setDepartment(String department) {
	this.department = department;
}

 // Getters and Setters
}
