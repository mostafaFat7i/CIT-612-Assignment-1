package com.example.universitysystem.services.impl;

import com.example.universitysystem.entities.Enrollment;
import com.example.universitysystem.entities.EnrollmentId;
import com.example.universitysystem.repositories.EnrollmentRepository;
import com.example.universitysystem.services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public List<Enrollment> fetchEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Override
    public List<Enrollment> fetchEnrollmentsByStudentId(Long studentEnrolledId) {
        return enrollmentRepository.findByEnrollmentIdStudentEnrolledId(studentEnrolledId);
    }

    @Override
    public void deleteEnrollment(Long studentId, Long courseId) {
        enrollmentRepository.deleteById(new EnrollmentId(studentId, courseId));
    }

    @Override
    public Enrollment updateEnrollment(Long studentId, Long courseId, Enrollment enrollment) {
        Enrollment enrollmentDB = enrollmentRepository.findById(new EnrollmentId(studentId, courseId)).get();
//        enrollmentDB.getEnrollmentId().setCourseEnrolledId(enrollment.getEnrollmentId().getCourseEnrolledId());
//        enrollmentDB.getEnrollmentId().setStudentEnrolledId(enrollment.getEnrollmentId().getStudentEnrolledId());
        enrollmentDB.setEnrolledDate(enrollment.getEnrolledDate());

        return enrollmentRepository.save(enrollmentDB);
    }
}
