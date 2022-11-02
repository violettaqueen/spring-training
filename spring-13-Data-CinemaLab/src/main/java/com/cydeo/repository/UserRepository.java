package com.cydeo.repository;

import com.cydeo.entity.Account;
import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a user with an email?
    List<User> findByEmail(String email);

    //Write a derived query to read a user with a username?
    List<User> findByUsername(String userName);

    //Write a derived query to list all users that contain a specific name?
     List<User> findAllByAccountNameContains(String name);

    //Write a derived query to list all users that contain a specific name in the ignore case mode?
    List<User> getUsersByAccountNameContainsIgnoreCase(String name);

    //Write a derived query to list all users with an age greater than a specified age?
    List<User> getUsersByAccountAgeGreaterThan(Integer age);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns a user read by email?
    @Query("select u from User u where u.email = ?1")
    List<User> retrieveUserByEmail(String email);

    //Write a JPQL query that returns a user read by username?
    @Query("select u from User u where u.username = ?1")
    List<User> retrieveUserByUserName(String userName);

    //Write a JPQL query that returns all users?
    @Query("select u from User u ")
    List<User> retrieveAllUsersJPQL();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns all users that contain a specific name?
    @Query(value = "select * from user_account u" +
            " join account_details ad on ad.id = u.account_details_id where ad.name ILIKE concat ('%', ?1, '%')", nativeQuery = true)
    List<User> retrieveAllUserName(@Param("name") String name);

    //Write a native query that returns all users?
    @Query(value = "select * from user_account", nativeQuery = true)
    List<User> retrieveAllUsers();

    //Write a native query that returns all users in the range of ages?
    @Query(value = "select * from user_account u"+
            "join account_details ad on ad.id = u.account_details_id where ad.age between ?1 and ?2", nativeQuery = true)
    List<User> retrieveAllUsersAgeBetween(@Param("age1") Integer age1, @Param("age2") Integer age2);

    //Write a native query to read a user by email?
    @Query(value = "select * from user_account where email = :email", nativeQuery = true)
    List<User> retrieveUserEmail(@Param("email")String email);

}