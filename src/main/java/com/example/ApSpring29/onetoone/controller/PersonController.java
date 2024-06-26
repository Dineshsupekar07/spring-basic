package com.example.ApSpring29.onetoone.controller;

 import com.example.ApSpring29.onetoone.entity.Aadhar;
 import com.example.ApSpring29.onetoone.entity.Person;
import com.example.ApSpring29.onetoone.repository.AadharRepository;
import com.example.ApSpring29.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private AadharRepository aadharRepository;

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("save")
    public String savePerson(@RequestBody Person person){

        personRepository.save(person);

        var adhar = new Aadhar();
        adhar.setNumber(person.getAadhar().getNumber());
        Aadhar aadhar = (Aadhar) aadharRepository.save(adhar);


        var person1 = new Person();
        person1.setAadhar(aadhar);
        person1.setName(person.getName());
        person1.setAddress(person.getAddress());
        personRepository.save(person1);

        return "person saved..";

    }
}