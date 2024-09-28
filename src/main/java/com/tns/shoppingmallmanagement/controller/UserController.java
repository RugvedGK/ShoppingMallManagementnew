package com.tns.shoppingmallmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.shoppingmallmanagement.entities.User;
import com.tns.shoppingmallmanagement.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/user")
	public List<User> getUser(){
		return this.service.getUser();
	}
	
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable String userId) {
		return this.service.getUser(Integer.parseInt(userId));
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return this.service.updateUser(user);
	}
	
	@DeleteMapping("user/{userId}")
	public User deleteUser(@PathVariable String userId) {
		return this.service.deleteUser(Integer.parseInt(userId));
	}
}
