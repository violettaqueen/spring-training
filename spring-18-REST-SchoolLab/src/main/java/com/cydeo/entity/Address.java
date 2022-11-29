package com.cydeo.entity;

import com.cydeo.enums.AddressType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address extends BaseEntity {

    private String street;
    private String country;
    private String state;
    private String city;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    @OneToOne(mappedBy = "address")
    private Student student;

    @OneToOne(mappedBy = "address")
    private Parent parent;

    @OneToOne(mappedBy = "address")
    private Teacher teacher;

}