package com.yuen.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yuen.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByUserEmail(String email);
}