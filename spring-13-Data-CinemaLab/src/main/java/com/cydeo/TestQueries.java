package com.cydeo;

import com.cydeo.repository.AccountRepository;
import com.cydeo.repository.MovieRepository;
import com.cydeo.repository.TicketRepository;
import com.cydeo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestQueries implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final MovieRepository movieRepository;
    private final TicketRepository ticketRepository;
    private final UserRepository userRepository;

    public TestQueries(AccountRepository accountRepository, MovieRepository movieRepository, TicketRepository ticketRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.movieRepository = movieRepository;
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("**********USER REPOSITORY**********");

        System.out.println(userRepository.getUserByEmail("bernard@email.com"));
        System.out.println(userRepository.getUserByUsername("bernard"));
        System.out.println(userRepository.getUsersByAccountNameContains("Bernard"));
        System.out.println(userRepository.getUsersByAccountAgeIsGreaterThan(35));
        System.out.println(userRepository.retrieveUserByEmail("bernard@email.com"));
        System.out.println(userRepository.retrieveUserByUserName("bernard"));
        System.out.println(userRepository.retrieveAllUsersContainsName("bernard"));
        System.out.println(userRepository.retrieveAllUsers());
        System.out.println(userRepository.retrieveAllUsersAgeBetween(20, 70));
        System.out.println(userRepository.retrieveAllUsersJPQL());
        System.out.println(userRepository.retrieveUserEmail("lawrence.f@email.com"));

        System.out.println("**********USER REPOSITORY**********");


        System.out.println(ticketRepository.countTicketsByUserAccountEmail("bernard@email.com"));
        System.out.println(ticketRepository.getTicketsByUserAccountEmail("lawrence.f@email.com"));
        System.out.println(ticketRepository.countTicketsByMovieCinemaMovieNameContains("The Gentleman"));
        //System.out.println(ticketRepository.getTicketsByDateTimeBetween();
        //System.out.println(ticketRepository.getTicketsByUserAccountContains());
        System.out.println(ticketRepository.retrieveTicketsUserContains("bernard@email.com"));
        //System.out.println(ticketRepository.retrieveAllTicketsDatesBetween(2020-12-05T20:00, 2020-12-05T20:00);
        //System.out.println(ticketRepository.retrieveTicketsByMovieName("The Gentleman"));
        System.out.println(ticketRepository.countTicketsByNumberUserBought("bernard@email.com"));
        //System.out.println(ticketRepository.retrieveAllTickets());
        //System.out.println("NATIVE:" + ticketRepository.retrieveNumberOfTicketsByUserBoughtDatesBetween());
        System.out.println("Native : " + ticketRepository.retrieveAllTickets());
        //System.out.println("Native: " + ticketRepository.retrieveAllTicketsByUserNameOrAccountNameOrMovieName("josieStory", "josie_story@email.com", "The Gentleman"));

        System.out.println("**********ACCOUNT REPOSITORY**********");


    }


}
