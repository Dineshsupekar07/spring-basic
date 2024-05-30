package com.example.ApSpring29.task.service.serviceImpl;

import com.example.ApSpring29.task.dto.MaritalStatusDto;
import com.example.ApSpring29.task.entity.MaritalStatus;
import com.example.ApSpring29.task.repository.MaritalStatusRepo;
import com.example.ApSpring29.task.service.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaritalStatusImpl implements MaritalStatusService {

    @Autowired
    private MaritalStatusRepo   maritalStatusRepo;

    @Override
    public MaritalStatus saveMaritalStatus(MaritalStatusDto maritalStatusDto) {

          MaritalStatus ms = new MaritalStatus();
          ms.setMaritalStatus(maritalStatusDto.getMaritalStatus());
        return  maritalStatusRepo.save(ms);
    }
}
