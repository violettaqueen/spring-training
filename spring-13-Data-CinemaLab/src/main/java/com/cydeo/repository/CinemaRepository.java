package com.cydeo.repository;

import com.cydeo.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name
    List<Cinema> findByNameContains(String pattern);


    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name
    List<Cinema> findTop3ByNameContains(String pattern);


    //Write a derived query to list all cinemas in a specific country
    List<Cinema> findByLocationContains(String country);


    //Write a derived query to list all cinemas with a specific name or sponsored name
    List<Cinema> findByNameOrSponsoredName(String name1, String name2);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country


    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern


    //Write a native query to sort all cinemas by name


    //Write a native query to distinct all cinemas by sponsored name


}