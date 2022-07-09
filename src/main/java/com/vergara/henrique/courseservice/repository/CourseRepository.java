package com.vergara.henrique.courseservice.repository;

import com.vergara.henrique.courseservice.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findAllByNameContainingOrDescriptionContaining(String name, String description);
}
