package com.example.ApSpring29.task.service.serviceImpl;

import com.example.ApSpring29.task.dto.GenderDto;
import com.example.ApSpring29.task.entity.Gender;
import com.example.ApSpring29.task.repository.GenderRepo;
import com.example.ApSpring29.task.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderImpl implements GenderService {

    @Autowired
    private GenderRepo genderRepo;
    @Override
    public Gender saveGender(GenderDto  genderDto) {
        Gender ge=new Gender();
        ge.setGender(genderDto.getGender());
        return genderRepo.save(ge);
    }
}
