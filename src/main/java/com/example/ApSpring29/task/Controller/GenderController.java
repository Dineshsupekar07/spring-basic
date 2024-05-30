package com.example.ApSpring29.task.Controller;

import com.example.ApSpring29.task.dto.GenderDto;
import com.example.ApSpring29.task.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenderController {
    @Autowired
   private GenderService genderService;
    @PostMapping("gender")
     public String saveGenderService(@RequestBody GenderDto genderDto) {
        genderService.saveGender( genderDto);
        return "Gender saved";
    }
}
