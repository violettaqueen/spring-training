package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department extends BaseEntity{

    private String departmentName;
    private String division;

}
