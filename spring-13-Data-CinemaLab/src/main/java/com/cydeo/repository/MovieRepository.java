package com.cydeo.repository;

import com.cydeo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a movie with a name
    List<Movie> readAllByOrderByName();


    //Write a derived query to list all movies between a range of prices
    List<Movie> getByPriceBetween(BigDecimal value1, BigDecimal value2);

    //Write a derived query to list all movies where duration exists in the specific list of duration
    //List<Movie> getByDurationExists(List<Duration> durations);

    //Write a derived query to list all movies with higher than a specific release date
    List<Movie> getByReleaseDateGreaterThan(LocalDate releaseDate);

    //Write a derived query to list all movies with a specific state and type
    List<Movie> getByStateContainsAndTypeContains(String state, String type);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movies between a range of prices
    @Query("select m from Movie m where m.price between ?1 and ?2")
    List<Movie> retrieveAllMoviesPriceBetween(BigDecimal price1, BigDecimal price2);

    //Write a JPQL query that returns all movie names
    @Query("select m from Movie m ORDER BY m.name")
    List<Movie> retrieveAllMoviesOrderByName();

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns a movie by name
    @Query(value = "select * from movies where name = ?1", nativeQuery = true)
    List<Movie> retrieveMovieByName(String name);

    //Write a native query that return the list of movies in a specific range of prices
    @Query(value = "select * from movies where price between ?1 and ?2", nativeQuery = true)
    List<Movie> retrieveMoviesPriceBetween(BigDecimal priceFrom, BigDecimal priceTo);


    //Write a native query to return all movies where duration exists in the range of duration
    @Query(value = "select * from movies where duration between ?1 and ?2", nativeQuery = true)
    List<Movie> retrieveAllMoviesDurationExistsBetween(int duration1, int duration2);

    //Write a native query to list the top 5 most expensive movies
    //@Query(value = "select distinct from movies")
    //List<Movie> retrieveTop5ByOrderByPrice();

}