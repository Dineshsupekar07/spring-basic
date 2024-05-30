package com.example.ApSpring29.onetoone.repository;

import com.example.ApSpring29.onetoone.entity.Person;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository< Person,Long> {

}
