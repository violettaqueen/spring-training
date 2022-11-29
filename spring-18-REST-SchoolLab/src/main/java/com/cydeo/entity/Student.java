package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseEntity {

    private String firstName;
    private String lastName;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Parent parent;

}