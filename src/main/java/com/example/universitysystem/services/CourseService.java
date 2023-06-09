package com.example.universitysystem.services;

import com.example.universitysystem.entities.Course;

import java.util.List;

public interface CourseService {

    public Course getCourseByCode(String code);

    public Course saveCourse(Course course);

    public List<Course> getAllCourse();

    public Course updateCourseByCode(String code, Course updatedCourse);

    public boolean deleteCourseByCode(String code);


}
