package com.yuen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuen.domain.Account;
import com.yuen.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
    private AccountRepository accountRepository;

    @Override
    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public List<Account> search(String q) {
        return accountRepository.findByUserUserEmail(q);
    }

    @Override
    public Account findOne(int id) {
        return accountRepository.findOne(id);
    }

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void delete(int id) {
        accountRepository.delete(id);
    }
    
    @Override
    public List<Account> searchAccountPassword(String accountPassword) {
    	return accountRepository.findByAccountPassword(accountPassword);
    }

}