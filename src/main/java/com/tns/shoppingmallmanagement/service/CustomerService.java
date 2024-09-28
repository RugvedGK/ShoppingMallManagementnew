package com.tns.shoppingmallmanagement.service;

import java.util.List;

import com.tns.shoppingmallmanagement.entities.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();

	public Customer addCuatomer(Customer customer);

	public Customer getCustomer(int customerId);
}
