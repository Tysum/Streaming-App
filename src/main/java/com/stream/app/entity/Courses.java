package com.stream.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String courseId;

    private String courseName;

    @OneToMany(mappedBy = "courses")
    private List<Videos> videos;
}
