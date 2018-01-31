package com.yuen.service;

import java.util.List;

import com.yuen.domain.Account;

public interface AccountService {

    Iterable<Account> findAll();

    List<Account> search(String q);

    Account findOne(int id);
    
    List<Account> searchAccountPassword(String accountpassword);

    void save(Account account);

    void delete(int id);

}