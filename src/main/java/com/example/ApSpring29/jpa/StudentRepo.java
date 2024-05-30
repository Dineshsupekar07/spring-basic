//package com.example.ApSpring29.jpa;
//
////
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public interface StudentRepo  extends JpaRepository<Student,Long> {
//    Student findByNameAndAddressIgnoreCase(String name, String address);
//
//    List<Student> findByActiveFalse();
//
//    List<Student> findByAgeNotIn(List<Integer> age);
//
//    List<Student> findByNameNot(String name);
//
//    List<Student> findByDobBetween(LocalDate startDate, LocalDate toDate);
//
//    List<Student> findByAgeLessThan(Integer age);
//
//    List<Student> findByFirstnameStartingWith(String name);
//}
