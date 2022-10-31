package com.cydeo.repository;

import com.cydeo.entity.Movie;
import com.cydeo.entity.MovieCinema;
import com.cydeo.entity.Ticket;
import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to count how many tickets a user bought
    List<Integer> countTicketsByUserAccountEmail(String email);

    //Write a derived query to list all tickets by specific email
    List<Ticket> getTicketsByUserAccountEmail(String email);

    //Write a derived query to count how many tickets are sold for a specific movie
    List<Integer> countTicketsByMovieCinemaMovieNameContains(String movieName);


    //Write a derived query to list all tickets between a range of dates
    //List<Ticket> getTicketsByDateTimeBetween(LocalDateTime dateTime, LocalDateTime dateTime2);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all tickets are bought from a specific user
    @Query("select t from Ticket t where t.userAccount.email = ?1")
    List<Ticket> retrieveTicketsUserContains(String email);

    //Write a JPQL query that returns all tickets between a range of dates
    @Query("select t from Ticket t where t.dateTime between ?1 and ?1")
    List<Ticket> retrieveAllTicketsDatesBetween(LocalDateTime date, LocalDateTime date2);

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count the number of tickets a user bought
    @Query(value = "select count(*) from ticket, user_account  where user_account.email = ?1", nativeQuery = true)
    List<Integer> countTicketsByNumberUserBought(String email);

    //Write a native query to count the number of tickets a user bought in a specific range of dates
    @Query(value = "select count (*) from ticket, user_account where date_time between ?1 and ?2", nativeQuery = true)
    List<Integer> retrieveNumberOfTicketsByUserBoughtDatesBetween(LocalDateTime date1, LocalDateTime date2);


    //Write a native query to distinct all tickets by movie name
    //@Query(value = "select distinct movie_cinema_id from tickets where movie.name = ?1)", nativeQuery = true)
    //List<Ticket> retrieveTicketsByMovieName(String movieName);

    //Write a native query to find all tickets by user email
    //@Query(value = "select * from tickets where ")
    //List<Ticket> retrieveAllTicketsByUserEmail(String email);

    //Write a native query that returns all tickets
    @Query(value = "select * from ticket", nativeQuery = true)
    List<Ticket> retrieveAllTickets();

    //Write a native query to list all tickets where a specific value should be containable in the username or account name or movie name
    //@Query(value = "select * from ticket, user_account, account_details, movie_cinema where userName = ?1 , accountName = ?2 , movieName = ?3", nativeQuery = true)
    //List<Ticket> retrieveAllTicketsByUserNameOrAccountNameOrMovieName(String userName, String AccountName, String MovieName);

}