package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "parent")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parent extends BaseEntity {

    private String firstName;
    private String lastName;
    private String profession;
    private String phoneNumber;

    private String email;
    private String username;
    private String password;

    @Column(columnDefinition = "DATE")
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

}