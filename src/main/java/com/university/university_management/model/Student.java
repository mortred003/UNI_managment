package com.university.university_management.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Add grades to the student
    @OneToMany(mappedBy = "student")
    private List<Grade> grades;
    // Constructors
    public Student() {
    }

    public Student(String firstName, String lastName, String email, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

  //public List<StudentSubject> getStudentSubjects() {
  //      return studentSubjects;
   // }

   // public void setStudentSubjects(List<StudentSubject> studentSubjects) {
   //     this.studentSubjects = studentSubjects;
   // }
}

