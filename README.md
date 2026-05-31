# Spring Data JPA CRUD Project

This repository contains a simple hands-on Spring Boot project built while learning **Spring Data JPA** and how to connect it with a Spring Boot REST API.

The project focuses on understanding the core flow between:

```text
Controller → Service → Repository → Database
```

It includes a basic Employee CRUD example using Spring Data JPA, H2 in-memory database, DTO mapping, and Swagger UI for API testing.

---

## 📚 Course Reference

- Course: Spring Data JPA with Spring Boot
- Platform: Udemy
- Language: Arabic
- Level: Intermediate
- Duration: ~1 hour
- Lectures: 21

This project was created as part of learning the fundamentals of Spring Data JPA.

---

## 🚀 Project Overview

The project implements a simple Employee Management REST API.

It covers:

- Create employee
- Get employee by ID
- Get all employees
- Update employee
- Delete employee
- Use DTOs for API request/response
- Use H2 in-memory database
- Test APIs using Swagger UI

Spring Data JPA simplifies database access by providing a repository abstraction.

It uses ready-made repository interfaces like `JpaRepository`, which provide common database operations without writing SQL manually.

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Hibernate
- H2 Database
- Lombok
- Maven
- Springdoc OpenAPI / Swagger UI

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
```

---

## 🧱 Layer Summary

### Controller

Handles HTTP requests and responses.

Main responsibilities:

- Receive API requests
- Read request parameters
- Read request body
- Call the service layer
- Return DTO responses

---

### Service

Contains the application logic.

Main responsibilities:

- Call the repository layer
- Convert DTO to Entity
- Convert Entity to DTO
- Keep the controller clean
- Handle business logic

---

### Repository

Handles database operations using Spring Data JPA.

Example:

```java
public interface EmpRepo extends JpaRepository<Employee, Integer> {
}
```

`JpaRepository` provides ready-made methods such as:

- `findAll()`
- `findById(id)`
- `save(entity)`
- `deleteById(id)`

---

### Entity

Represents the database table structure.

Example:

```java
@Entity
@Table(name = "employees")
public class Employee {
}
```

---

### DTO

DTO is used to control the data received from or returned to the API.

This helps avoid exposing the database entity directly through the API.

---

## 🗄️ Database

This project uses **H2 in-memory database** for development and testing.

H2 runs inside the application and does not require installing an external database.

---

## ⚙️ Example `application.properties`

```properties
spring.datasource.url=jdbc:h2:mem:hr_db
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.defer-datasource-initialization=true

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## 🧪 H2 Database Console

After running the application, open:

```text
http://localhost:8080/h2-console
```

Use:

```text
JDBC URL: jdbc:h2:mem:hr_db
Username: sa
Password: leave empty
```

---

## 📘 Swagger UI

Springdoc OpenAPI provides a Swagger UI interface to test the API from the browser.

Open Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI JSON:

```text
http://localhost:8080/v3/api-docs
```

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/employees` | Get all employees |
| GET | `/employees/get-emp?id=1` | Get employee by ID |
| POST | `/employees/save-emp` | Create new employee |
| POST | `/employees/update-emp` | Update existing employee |
| DELETE | `/employees/delete-emp?id=1` | Delete employee by ID |

---

## 🧾 Example Request Body

### Create Employee

```json
{
  "firstName": "Ahmed",
  "lastName": "Essam",
  "salary": 9000
}
```

### Update Employee

```json
{
  "id": 1,
  "firstName": "Abdalla",
  "lastName": "Fadl",
  "salary": 20000
}
```

---

## 🧠 Concepts Practiced

This project helped practice and understand:

- Spring Boot project structure
- Maven dependencies
- `@Entity`
- `@Table`
- `@Id`
- `@GeneratedValue`
- `GenerationType.IDENTITY`
- `@Column`
- Lombok annotations:
  - `@Data`
  - `@Builder`
  - `@NoArgsConstructor`
  - `@AllArgsConstructor`
- Spring annotations:
  - `@RestController`
  - `@Service`
  - `@Autowired`
- Spring Data JPA repositories
- `JpaRepository`
- CRUD operations
- DTO mapping
- `Optional`
- Java Stream API
- `@RequestParam`
- `@RequestBody`
- `@GetMapping`
- `@PostMapping`
- `@DeleteMapping`
- H2 database
- Swagger UI testing

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Abdalla2030/spring-data-jpa-crud.git
```

### 2. Open the project

Open the project in IntelliJ IDEA, VS Code, or any Java IDE.

### 3. Run the application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main class:

```text
SpringDataApplication.java
```

### 4. Open Swagger UI

```text
http://localhost:8080/swagger-ui/index.html
```

### 5. Open H2 Console

```text
http://localhost:8080/h2-console
```

---

## 📌 Notes

This is a learning project and not production-ready.

The purpose is to practice Spring Boot and Spring Data JPA fundamentals.

Main flow:

```text
HTTP Request
→ Controller
→ Service
→ Repository
→ Database
```

---

## ✅ Current Status

Completed:

- Basic Spring Boot setup
- H2 database configuration
- Employee entity
- Employee repository
- Employee service
- Employee controller
- CRUD APIs
- DTO mapping
- Swagger UI integration

---

## 👨‍💻 Author

Abdalla Fadl
