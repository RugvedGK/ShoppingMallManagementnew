package com.tns.shoppingmallmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.shoppingmallmanagement.entities.Customer;
import com.tns.shoppingmallmanagement.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping
	public List<Customer> getCustomer() {
		return this.service.getCustomer();
	}
	
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCuatomer(customer);
	}
	
	@GetMapping("/{customerId}")
	public Customer getCustomer(@PathVariable String customerId) {
		return this.service.getCustomer(Integer.parseInt(customerId));
	}
	
}
