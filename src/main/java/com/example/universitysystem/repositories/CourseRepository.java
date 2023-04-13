package com.example.universitysystem.repositories;

import com.example.universitysystem.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
