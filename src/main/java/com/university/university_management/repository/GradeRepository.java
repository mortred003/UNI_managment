package com.university.university_management.repository;


import com.university.university_management.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Repository interface for Grade entity
public interface GradeRepository extends JpaRepository<Grade, Long> {

    // Custom query method to find grades by student ID
    List<Grade> findByStudentId(Long studentId);

    // Custom query method to find grades by subject ID
    List<Grade> findBySubjectId(Long subjectId);
}
