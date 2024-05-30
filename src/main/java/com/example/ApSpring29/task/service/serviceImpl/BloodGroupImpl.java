package com.example.ApSpring29.task.service.serviceImpl;

import com.example.ApSpring29.task.dto.BloodGroupDto;
import com.example.ApSpring29.task.entity.BloodGroup;
import com.example.ApSpring29.task.repository.BloodGroupRepo;
import com.example.ApSpring29.task.service.BloodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class BloodGroupImpl implements BloodGroupService {

    @Autowired
    private BloodGroupRepo bloodGroupRepo;

    @Override
    public BloodGroup saveBloodGroup(BloodGroupDto bloodGroupDto) {
        BloodGroup bg = new BloodGroup();
        bg.setBloodGroup( bloodGroupDto.getBloodGroup());
        return bloodGroupRepo.save(bg);
    }
}


