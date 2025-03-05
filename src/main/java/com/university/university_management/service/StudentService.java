package com.university.university_management.service;

import com.university.university_management.model.Student;
import com.university.university_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Save a new student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get a student by id
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Delete a student by id
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
