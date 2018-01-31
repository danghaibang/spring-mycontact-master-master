package com.yuen.service;

import java.util.List;

import com.yuen.domain.User;

public interface UserService {

    Iterable<User> findAll();

    List<User> search(String q);

    User findOne(int id);
    
    void save(User user);

    void delete(int id);

}