package com.example.universitysystem.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Course {

    @Id
    private Long courseId;
    private String courseName;
    private Long courseGrade;
    private Long courseCapacity;
    private Long usedCapacity;
}
