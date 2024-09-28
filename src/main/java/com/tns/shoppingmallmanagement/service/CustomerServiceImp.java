package com.tns.shoppingmallmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmallmanagement.dao.CustomerDao;
import com.tns.shoppingmallmanagement.entities.Customer;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerDao dao;
	
	
	List<Customer> list;

	@Override
	public List<Customer> getCustomer() {
		return dao.findAll();	}

	@Override
	public Customer addCuatomer(Customer customer) {
		dao.save(customer);
		return customer;
	}

	@Override
	public Customer getCustomer(int customerId) {
		return dao.findById(customerId).orElse(null);
	}

	
	
}
