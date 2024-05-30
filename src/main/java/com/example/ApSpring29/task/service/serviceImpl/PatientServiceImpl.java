package com.example.ApSpring29.task.service.serviceImpl;

import com.example.ApSpring29.task.dto.PatientDto;
import com.example.ApSpring29.task.entity.Patient;
import com.example.ApSpring29.task.repository.PatientRepo;
import com.example.ApSpring29.task.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepo patientRepo;
    @Override
    public Patient savePatient(PatientDto patientdto) {
        Patient pt=new Patient();
        pt.setFirstName(patientdto.getFirstName());
        pt.setLastName(patientdto.getLastName());
        pt.setEmail(patientdto.getEmail());
        pt.setGender(patientdto.getGender());
        pt.setPhone(patientdto.getPhone());
        pt.setAge(patientdto.getAge());
        pt.setRegistrationDate(patientdto.getRegistrationDate());
        pt.setBloodGroup(patientdto.getBloodGroup());
        pt.setMaritalStatus(patientdto.getMaritalStatus());
        pt.setNationality(patientdto.getNationality());
        return patientRepo.save(pt);


    }
}
