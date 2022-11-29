package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course extends BaseEntity {

    private String courseName;

    @Column(columnDefinition = "text")
    private String description;

}