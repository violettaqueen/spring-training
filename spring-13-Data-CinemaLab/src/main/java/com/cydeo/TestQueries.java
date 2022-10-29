package com.cydeo;

import com.cydeo.repository.AccountRepository;
import com.cydeo.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestQueries implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final MovieRepository movieRepository;

    public TestQueries(AccountRepository accountRepository, MovieRepository movieRepository) {
        this.accountRepository = accountRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println();



    }
}
