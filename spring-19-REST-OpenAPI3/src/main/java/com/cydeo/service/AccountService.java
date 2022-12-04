package com.cydeo.service;

import com.cydeo.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    List<AccountDTO> getAccounts();

    AccountDTO getById(Long id) throws Exception;

}
