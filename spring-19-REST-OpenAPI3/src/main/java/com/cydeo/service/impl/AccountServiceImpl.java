package com.cydeo.service.impl;

import com.cydeo.dto.AccountDTO;
import com.cydeo.repository.AccountRepository;
import com.cydeo.service.AccountService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final MapperUtil mapperUtil;

    public AccountServiceImpl(AccountRepository accountRepository, MapperUtil mapperUtil) {
        this.accountRepository = accountRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<AccountDTO> getAccounts() {
        return accountRepository.findAll().stream().map(account -> mapperUtil.convert(account, new AccountDTO())).collect(Collectors.toList());
    }

    @Override
    public AccountDTO getById(Long id) throws Exception {
        return mapperUtil.convert(accountRepository.findById(id).orElseThrow(() -> new Exception("Account not found")), new AccountDTO());
    }

}
