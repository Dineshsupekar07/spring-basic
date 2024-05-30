package com.example.ApSpring29.task.service;

import com.example.ApSpring29.task.dto.GenderDto;
import com.example.ApSpring29.task.entity.Gender;

public interface GenderService {

    Gender saveGender(GenderDto genderDto);
}
