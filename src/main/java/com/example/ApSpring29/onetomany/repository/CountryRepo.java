package com.example.ApSpring29.onetomany.repository;


import com.example.ApSpring29.onetomany.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,Long> {
}
