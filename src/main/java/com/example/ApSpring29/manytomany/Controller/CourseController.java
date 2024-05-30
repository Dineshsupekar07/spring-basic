package com.example.ApSpring29.manytomany.Controller;

import com.example.ApSpring29.manytomany.entity.Courses;
import com.example.ApSpring29.manytomany.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
     private CourseRepo courseRepo;

    @PostMapping("save")
    public  String saveCourse(@RequestBody Courses courses) {

        courseRepo.save(courses);
        return "course saved.";
    }



}
