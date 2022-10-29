package com.cydeo;

import com.cydeo.entity.AccountDetails;
import com.cydeo.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestQueries implements CommandLineRunner {

    private final AccountRepository accountRepository;

    public TestQueries(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(accountRepository.retrieveAllAccounts());



    }
}
