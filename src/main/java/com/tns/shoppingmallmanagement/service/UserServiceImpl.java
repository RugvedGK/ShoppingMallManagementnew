package com.tns.shoppingmallmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmallmanagement.dao.UserDao;
import com.tns.shoppingmallmanagement.entities.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao dao;
	
	List<User> list;
	
	public UserServiceImpl() {

	}

	@Override
	public List<User> getUser() {
		return dao.findAll();
	}

	@Override
	public User addUser(User user) {

		dao.save(user);
	return user;	
	}

	@Override
	public User updateUser(User user) {
		 dao.save(user);
		 return user;
	}

	@Override
	public User deleteUser(Integer parseInt) {
	Optional<User> entity = dao.findById(parseInt);
	if (entity.isPresent()) {
	    dao.delete(entity.get());
	}
	return null;
	}

	@Override
	public User getUser(int userId) {
		return dao.findById(userId).orElse(null);
	}
}
