package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {

    @Id   //sql code behind the scene
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Column(columnDefinition = "Date")
    private LocalDate birthDate;
    @Column(columnDefinition = "Time")
    private LocalTime birthTime;
    @Column(columnDefinition = "TimeStamp")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Transient
    private String city;

}
