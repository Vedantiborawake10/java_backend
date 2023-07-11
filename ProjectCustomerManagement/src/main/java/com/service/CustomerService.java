package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {

	Customer addcustomer(Customer c);
	Customer getcustomerById(int id);
	List<Customer> getallCustomer();
	
	
 
}
