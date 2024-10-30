package com.stream.app.repository;

import com.stream.app.entity.Videos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Videos, String> {
    Optional<Videos> findByTitle(String title);

}
