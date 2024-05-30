package com.example.ApSpring29.task.service;

import com.example.ApSpring29.task.dto.PatientDto;
import com.example.ApSpring29.task.entity.Patient;

public interface PatientService {
    public Patient savePatient(PatientDto patient);
}
