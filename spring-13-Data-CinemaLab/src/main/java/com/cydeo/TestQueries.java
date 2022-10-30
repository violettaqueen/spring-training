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

        //System.out.println(ticketRepository.countTicketsByUserAccountContains("bernard@email.com"));
        //System.out.println(ticketRepository.countTicketsByMovieCinemaContains());
        //System.out.println(ticketRepository.getTicketsByDateTimeBetween(2020-12-05 20:00:00),(2020-12-08 19:00:00));
        //System.out.println(ticketRepository.getTicketsByUserAccountContains());sout
        //System.out.println(ticketRepository.retrieveTicketsUserContains("bernard@email.com"));
        //System.out.println(ticketRepository.retrieveAllTicketsDatesBetween());
        //System.out.println(ticketRepository.retrieveTicketsByMovieName("The Gentleman"));
        //System.out.println(ticketRepository.countTicketsByNumberUserBought("bernard@email.com"));
        //System.out.println(ticketRepository.retrieveAllTickets());
        //System.out.println("**********USER REPOSITORY**********");
        //System.out.println(userRepository.getUserByEmail("bernard@email.com"));
        //System.out.println(userRepository.getUserByUsername("bernard"));
        //System.out.println(userRepository.getUsersByAccountContains("Bernard"));
        //System.out.println(userRepository.getUsersByAccountAgeIsGreaterThan(35));
        //System.out.println(userRepository.retrieveUserByEmail("bernard@email.com"));
        //System.out.println(userRepository.retrieveUserByUserName("bernard"));
    }

}
