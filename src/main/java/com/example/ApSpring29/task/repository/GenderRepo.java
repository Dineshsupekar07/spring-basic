package com.example.ApSpring29.task.repository;

import com.example.ApSpring29.task.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender,Long> {
}
