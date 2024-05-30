package com.example.ApSpring29.task.repository;


import com.example.ApSpring29.task.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository <Patient,Long> {

}
