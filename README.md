## 🧑‍💼 Employee Management Application Documentation

## Project Overview

 This is a full-stack web application for managing employee records, built with Spring Boot, Thymeleaf, and MySQL. It provides both a RESTful API and a web interface for CRUD operations on employee data, including a view page to display individual employee details.

---
## Project Setup

Prerequisites
- Java 23 or later
- Maven 3.6+
- MySQL 8.0+
- IDE (IntelliJ IDEA, Eclipse, etc.)
---
## Directory Structure
```
Emplyoee/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/example/Emplyoee/
│   │   │   │   ├── config/                               # SwaggerApi Doc
│   │   │   │   │   ├── SwaggerConfig.java
│   │   │   │   ├── controller/                           # REST & Web Controllers
│   │   │   │   │   ├── EmployeeController.java 
│   │   │   │   │   ├── EmployeeWebController.java
│   │   │   │   ├── entity/                               # Employee entity
│   │   │   │   │   ├── Employee.java
│   │   │   │   ├── repository/                           # Spring Data JPA Repositories
│   │   │   │   │   ├── EmployeeRepository.java
│   │   │   │   ├── service/                              # Service layer
│   │   │   │   │   ├── EmployeeService.java
│   │   │   │   ├── EmplyoeeApplication.java
│   │   ├── resources/
│   │   │   ├── templates/                               # Thymeleaf HTML templates
│   │   │   │   ├── employee-list.html
│   │   │   │   ├── employee-form.html
│   │   │   │   ├── employee-view.html
│   │   │   ├── application.properties
├── pom.xml                                              # Project dependencies
├── README.md                                            # Documentation

```
---
## Database Configuration

## 1. Install and start MySQL:
Windows: Start MySQL service via Services or net start mysql

## 2. Create a database:
```
CREATE DATABASE employee_db;

```
## 3. Update application.properties with your MySQL credentials:
```
spring.datasource.username=root
spring.datasource.password=your_password
```
---

## Build and Run

1. Build the project:
```
mvn clean install

```
2. Run the application:
```
mvn spring-boot:run

```
3. Access the application:

- Web interface: http://localhost:8080/employees
- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs

---
## 🚀 Technologies Used

- Java 21
- Spring Boot 3.2.5
- Spring Data JPA
- Thymeleaf or JavaScript
- MySQL
- Swagger (Springdoc OpenAPI)
- Maven Daemon (mvnd)

---
## Output: 

![image](https://github.com/user-attachments/assets/d1520c72-9cb9-4508-93f8-673774241f54)

---

![image](https://github.com/user-attachments/assets/552a3df5-3cd2-452b-bd52-792277c39a0e)

---
![image](https://github.com/user-attachments/assets/50b2562a-2f1a-42ce-a812-4ed665159e0d)

---
![image](https://github.com/user-attachments/assets/fccc4899-032e-4d93-acb8-8e241dc21197)

---
![image](https://github.com/user-attachments/assets/8f91f1ea-32c4-4346-a617-4c8d13ee1945)

---







