# Spring Data JPA CRUD Project

This repository contains a simple hands-on Spring Boot project built while learning **Spring Data JPA** and how to connect it with a Spring Boot REST API.

The project focuses on understanding the core flow between:

Controller → Service → Repository → Database

It includes a basic Employee CRUD example using Spring Data JPA, H2 in-memory database, DTO mapping, and Swagger UI for API testing.

---

## 🚀 Project Overview

The project implements a simple Employee Management API.

It covers the basic operations needed to understand how Spring Boot works with Spring Data JPA:

- Create employee
- Get employee by ID
- Get all employees
- Update employee
- Delete employee
- Use DTOs for API request/response
- Use H2 database for development
- Test APIs using Swagger UI

Spring Data JPA provides repository support for JPA and simplifies database access through a consistent programming model.  
It also provides ready-made repository interfaces like `JpaRepository`, which includes common database operations without writing SQL manually.  
References: Spring Data JPA documentation and `JpaRepository` API.  
https://docs.spring.io/spring-data/jpa/reference/index.html  
https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Lombok
- Swagger UI / Springdoc OpenAPI

---

## 📦 Project Structure

```text
src/main/java/com/springData/springData
│
├── controller
│   └── EmpController.java
│
├── service
│   └── EmpService.java
│
├── repository
│   └── EmpRepo.java
│
├── model
│   ├── entity
│   │   └── Employee.java
│   │
│   └── dto
│       └── EmployeeDto.java
│
└── SpringDataApplication.java
