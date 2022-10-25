package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user accounts")
@NoArgsConstructor
@Data
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String userName;

    @ManyToMany
    private List<AccountDetails> accountDetailsList;

    public UserAccount(String email, String password, String userName) {
        this.email = email;
        this.password = password;
        this.userName = userName;
    }
}
