package com.cydeo.repository;

import com.cydeo.entity.AccountDetails;
import com.cydeo.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state
    List<AccountDetails> findByCountryOrState(String country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<AccountDetails> findByAgeLessThanEqual(int age);

    //Write a derived query to list all accounts with a specific role
    List<AccountDetails> findByRoleContains(String name);

    //Write a derived query to list all accounts between a range of ages
    List<AccountDetails> findByAgeBetween(int age1, int age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<AccountDetails> findByAddressStartingWith(String pattern);

    //Write a derived query to sort the list of accounts with age
    List<AccountDetails> findByAgeOrderByAge(int age);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
    @Query("select a from AccountDetails a")
    List<AccountDetails> retrieveAllAccounts();

    //Write a JPQL query to list all admin accounts
    @Query("select a from AccountDetails a where a.role = ?1")
    List<AccountDetails> retrieveALLAdminAccounts(String role);


    //Write a JPQL query to sort all accounts with age
    @Query("select a from AccountDetails a order by a.age")
    List<AccountDetails>sortAllAccountsWithAge();

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "select * from employees where age <= ?1", nativeQuery = true)
    List<AccountDetails> retrieveAllAccountsAgeLessThan(int value);

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    @Query(value = "select * from accountDetailss where name, address, country, state, city = value ", nativeQuery = true)
    List<AccountDetails>retrieveAllAccountsContainsValue(String value);

    //Write a native query to read all accounts with an age higher than a specific value
    @Query(value = "select * from accountdetailss where age >= value", nativeQuery = true)
    List<AccountDetails> retrieveAllAccountsAgeGreaterThan(int value);


}