package com.stream.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "videos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Videos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String videoId;

    private String videoTitle;

    private String videoDescription;

    private String contentType;

    private String filePath;

    @ManyToOne
    private Courses course;
}
