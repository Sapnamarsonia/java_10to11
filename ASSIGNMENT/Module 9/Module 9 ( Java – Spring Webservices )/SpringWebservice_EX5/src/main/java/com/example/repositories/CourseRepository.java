package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {}
