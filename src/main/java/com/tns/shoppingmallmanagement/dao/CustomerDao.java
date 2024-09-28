package com.tns.shoppingmallmanagement.dao;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmallmanagement.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Id>{

	Optional<Customer> findById(int customerId);

}
