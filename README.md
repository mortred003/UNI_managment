# University Management System - Spring Boot

A Spring Boot application for managing a university system, including students, courses, and professors.

## Dependencies

- **Java 8+**: Ensure Java is installed.
- **Maven**: For building the project.
- **MySQL**: A relational database like MySQL is required. Create a database:

  ```sql
  CREATE DATABASE university_management;

Update the application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/university_management
spring.datasource.username=root
spring.datasource.password=yourpassword

Running the Application

    Clone the repository:

git clone https://github.com/mortred003/UNI_Managment.git
cd UNI_Managment

Build the project:

mvn clean install

Run the application:

    mvn spring-boot:run

    Access it at http://localhost:8080.

API Endpoints
1. Create a Student (POST)
   
curl -X POST http://localhost:8080/students \
    -H "Content-Type: application/json" \
    -d '{"name": "John Doe", "email": "john.doe@example.com", "course": "Computer Science"}'

2. Get All Students (GET)

curl http://localhost:8080/students

3. Get Student by ID (GET)

curl http://localhost:8080/students/1

4. Update Student (PUT)

curl -X PUT http://localhost:8080/students/1 \
    -H "Content-Type: application/json" \
    -d '{"name": "John Doe Updated", "email": "john.updated@example.com", "course": "Mathematics"}'

5. Delete Student (DELETE)

curl -X DELETE http://localhost:8080/students/1

6. Create a Course (POST)

curl -X POST http://localhost:8080/courses \
    -H "Content-Type: application/json" \
    -d '{"name": "Computer Science 101", "department": "Computer Science"}'

7. Get All Courses (GET)

curl http://localhost:8080/courses

8. Get Course by ID (GET)

curl http://localhost:8080/courses/1

9. Update Course (PUT)

curl -X PUT http://localhost:8080/courses/1 \
    -H "Content-Type: application/json" \
    -d '{"name": "Computer Science 102", "department": "Computer Science"}'

10. Delete Course (DELETE)

curl -X DELETE http://localhost:8080/courses/1

11. Create a Professor (POST)

curl -X POST http://localhost:8080/professors \
    -H "Content-Type: application/json" \
    -d '{"name": "Dr. Smith", "email": "dr.smith@example.com", "department": "Computer Science"}'

12. Get All Professors (GET)

curl http://localhost:8080/professors

13. Get Professor by ID (GET)

curl http://localhost:8080/professors/1

14. Update Professor (PUT)

curl -X PUT http://localhost:8080/professors/1 \
    -H "Content-Type: application/json" \
    -d '{"name": "Dr. Smith Updated", "email": "dr.smith.updated@example.com", "department": "Mathematics"}'

15. Delete Professor (DELETE)

curl -X DELETE http://localhost:8080/professors/1
