package com.yuen.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yuen.domain.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

    List<Account> findByUserUserEmail(String q);
    List<Account> findByAccountPassword(String accountPassword);

}