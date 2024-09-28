package com.tns.shoppingmallmanagement.service;

import java.util.List;

import com.tns.shoppingmallmanagement.entities.User;

public interface UserService {

	public List<User> getUser();

	public User getUser(int userId);

	public User addUser(User user);

	public User updateUser(User user);

	public User deleteUser(Integer parseInt);
}
