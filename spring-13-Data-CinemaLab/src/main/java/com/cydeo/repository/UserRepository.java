package com.cydeo.repository;

import com.cydeo.entity.Account;
import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a user with an email?
    List<User> getUserByEmail(String email);

    //Write a derived query to read a user with a username?
    List<User> getUserByUsername(String userName);

    //Write a derived query to list all users that contain a specific name?
     List<User> getUsersByAccountContains(String name);

    //Write a derived query to list all users that contain a specific name in the ignore case mode?
    List<User> getUsersByAccountContainsIgnoreCase(String name);

    //Write a derived query to list all users with an age greater than a specified age?
    List<User> getUsersByAccountAgeIsGreaterThan(int age);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns a user read by email?
    @Query("select u from User u where u.email = ?1")
    List<User> retrieveUserByEmail(String email);

    //Write a JPQL query that returns a user read by username?
    @Query("select u from User u where u.username = ?1")
    List<User> retrieveUserByUserName(String userName);

    //Write a JPQL query that returns all users?


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns all users that contain a specific name?


    //Write a native query that returns all users?


    //Write a native query that returns all users in the range of ages?


    //Write a native query to read a user by email?


}