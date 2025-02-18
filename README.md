# Employee Management System

This is a simple fullstack project designed to manage employee information. The backend is built using **Spring Boot (Java)**, and the frontend is built using **AngularJS**.

---

## Features

- **Employee Management**:
  - Add new employees with details such as name, email, department, and job title.
  - View a list of all employees.
  - Update existing employee information.
  - Delete employees from the system.

- **User-Friendly Interface**:
  - A clean and responsive UI built with AngularJS.
  - Easy navigation and intuitive design.

- **RESTful API**:
  - The backend exposes RESTful endpoints for CRUD (Create, Read, Update, Delete) operations on employee data.

---

## Technologies Used

### Backend
- **Spring Boot**: A Java-based framework for building web applications and microservices.
- **Spring Data JPA**: For database operations and ORM (Object-Relational Mapping).
- **H2 Database**: An in-memory database for development and testing (can be replaced with MySQL, PostgreSQL, etc., for production).
- **Maven**: For dependency management and building the project.

### Frontend
- **AngularJS**: A JavaScript framework for building dynamic web applications.
- **Bootstrap**: For styling and responsive design.
- **HTML/CSS**: For structuring and styling the frontend.

---

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK) 8 or higher**
- **Node.js** (for AngularJS development)
- **Maven** (for building the Spring Boot project)
- **Angular CLI** (optional, for AngularJS development)

---

## Installation and Setup

### Backend (Spring Boot)

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management-system.git
   cd employee-management-system/backend
2. Build the project using Maven:
    ```bash
    mvn clean install
3. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
4. The backend will start at http://localhost:8080.

### Frontend (AngularJS)

1. Navigate to the frontend directory:
    ```bash
    cd ../frontend
2. Install dependencies:
    ```bash
    npm install
3. Start the AngularJS development server:
    ```bash
    npm start
4. The frontend will be available at http://localhost:4200.

## API Endpoints
The backend exposes the following RESTful endpoints:
- GET /api/employees: Fetch all employees.
- GET /api/employees/{id}: Fetch an employee by ID.
- POST /api/employees: Add a new employee.
- PUT /api/employees/{id}: Update an existing employee.
- DELETE /api/employees/{id}: Delete an employee.

## Author
Follow me on the following socials
- [LinkedIn](www.linkedin.com/in/mateus-neubarth)
- [Instagram](www.instagram.com/mateus_neubarth)