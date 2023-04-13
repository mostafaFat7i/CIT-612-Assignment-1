package com.example.universitysystem.services;

import com.example.universitysystem.entities.Enrollment;
import com.example.universitysystem.entities.EnrollmentId;

import java.util.List;

public interface EnrollmentService {
    Enrollment saveEnrollment(Enrollment enrollment);

    List<Enrollment> fetchEnrollments();

    List<Enrollment> fetchEnrollmentsByStudentId(Long studentEnrolledId);

    void deleteEnrollment(Long studentId, Long courseId);

    Enrollment updateEnrollment(Long studentId, Long courseId, Enrollment enrollment);
}
