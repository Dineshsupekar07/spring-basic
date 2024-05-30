package com.example.ApSpring29.task.Controller;

import com.example.ApSpring29.task.dto.PatientDto;
import com.example.ApSpring29.task.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("save")
    public String createPatient( @RequestBody PatientDto patientdto){

         patientService.savePatient(patientdto);
         return "Patiend added successfully...";

    }

}
