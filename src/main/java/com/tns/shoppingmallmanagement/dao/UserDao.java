package com.tns.shoppingmallmanagement.dao;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmallmanagement.entities.User;

public interface UserDao extends JpaRepository<User, Id>{

	Optional<User> findById(Integer userId);
	
}
