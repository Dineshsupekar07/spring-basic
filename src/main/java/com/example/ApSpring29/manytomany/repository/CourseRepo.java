package com.example.ApSpring29.manytomany.repository;

import com.example.ApSpring29.manytomany.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepo extends JpaRepository<Courses,Long> {
}
