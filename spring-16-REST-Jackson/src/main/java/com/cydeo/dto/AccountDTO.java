package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;
    private UserDTO user;

}
