Employee Management System - REST API
📌 Project Overview
Developed as part of the Hewlett Packard Enterprise (HPE) Software Engineering Job Simulation. This project demonstrates the ability to design and implement a RESTful web service for managing employee data records using Java Spring Boot 3.

🛠️ Technical Stack

Framework: Spring Boot 3 (Web, DevTools).


Testing Suite: JUnit 5, Mockito (for Unit Testing and Mocking).


Language: Java (OOPs, Collections).


Build Tool: Maven.


API Tools: Postman (for Endpoint Validation).

🚀 Key Features
Employee Management: Full support for GET and POST requests to retrieve and add employees.


JSON Processing: Accepts and responds with JSON data for seamless integration.

Layered Architecture: Clear package separation (Entity, Employee, EmployeeManager, EmployeeController) to ensure maintainability.

Data Integrity: Uses a static list to manage state across the application lifecycle.

🧪 Testing Strategy (QA Focus)
As an SDET, I prioritized testing to ensure application reliability:


Unit Testing: Implemented tests in EmployeeManagerTest.java to verify business logic.

Mocking: Used Mockito to isolate components during the testing phase.


Validation: Verified status codes and JSON response bodies using Postman.

📂 Project Structure
Plaintext
src/main/java
 └── com.employee.emp
     ├── Entity (Employee POJO)
     ├── Employee (List Wrapper)
     ├── EmployeeManager (Repository/Logic)
     └── EmployeeController (REST Controller)
src/test/java
 └── com.employee.emp.EmployeeManager (JUnit Tests)  
