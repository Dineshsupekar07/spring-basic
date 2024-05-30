package com.example.ApSpring29.task.Controller;

import com.example.ApSpring29.task.dto.BloodGroupDto;
import com.example.ApSpring29.task.service.BloodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BloodGroupController {
    @Autowired
    private BloodGroupService bloodGroupService;
    @PostMapping("bloodgroup")
    public String saveBloodGroupService(@RequestBody BloodGroupDto bloodGroupDto){
    bloodGroupService.saveBloodGroup(bloodGroupDto);
    return "BloodGroup Saved";
    }



}



















