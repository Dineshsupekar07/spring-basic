package com.example.ApSpring29.task.service;

import com.example.ApSpring29.task.dto.BloodGroupDto;
import com.example.ApSpring29.task.entity.BloodGroup;

public interface BloodGroupService {

    BloodGroup saveBloodGroup(BloodGroupDto bloodGroupDto);
}
