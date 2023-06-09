package com.example.universitysystem.entities;

import lombok.Data;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "COURSE")
public class Course {

    @Id
    @Column(name = "courseCode")
    private String courseCode;
    @Column(name = "courseName")
    private String courseName;
    @Column(name = "courseCredits")
    private int courseCredits;
    // Other course properties, getters, and setters
    @Column(name = "courseCapacity")
    private Long courseCapacity;
    @Column(name = "usedCapacity")
    private Long usedCapacity;


}


