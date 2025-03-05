package com.university.university_management.controller;

import com.university.university_management.dto.GradeRequest;
import com.university.university_management.model.Grade;
import com.university.university_management.model.Student;
import com.university.university_management.model.Subject;
import com.university.university_management.repository.GradeRepository;
import com.university.university_management.repository.StudentRepository;
import com.university.university_management.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grades")
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    // Endpoint to create a new grade
    @PostMapping
    public ResponseEntity<Grade> createGrade(@RequestBody GradeRequest gradeRequest) {
        // Find the student and subject by ID
        Student student = studentRepository.findById(gradeRequest.getStudentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));
        Subject subject = subjectRepository.findById(gradeRequest.getSubjectId())
                .orElseThrow(() -> new RuntimeException("Subject not found"));

        // Create a new Grade object and set the student, subject, and grade
        Grade grade = new Grade();
        grade.setStudent(student);
        grade.setSubject(subject);
        grade.setGrade(gradeRequest.getGrade());

        // Save the grade
        Grade savedGrade = gradeRepository.save(grade);

        return ResponseEntity.ok(savedGrade);
    }
}