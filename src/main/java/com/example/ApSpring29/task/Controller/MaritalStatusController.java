package com.example.ApSpring29.task.Controller;

import com.example.ApSpring29.task.dto.MaritalStatusDto;
import com.example.ApSpring29.task.service.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaritalStatusController {

    @Autowired
    private MaritalStatusService maritalStatusService;
    @PostMapping("status")
    public String saveMaritalService(@RequestBody MaritalStatusDto maritalStatusDto){
        maritalStatusService.saveMaritalStatus(maritalStatusDto);
        return "MaritalStatus saved";
    }



}
