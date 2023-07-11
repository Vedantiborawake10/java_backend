package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.dao.CustomerRepository;
import com.model.Customer;

@Service
 public class CustomerServiceImplement implements CustomerService {
@Autowired
	CustomerRepository customerrepo;

@Override
public Customer addcustomer(Customer c) {
	// TODO Auto-generated method stub
	return customerrepo.save(c);
}


@Override
public Customer getcustomerById(int id) {
	// TODO Auto-generated method stub
	return customerrepo.findById(id).orElse(null);
}

@Override
public List<Customer> getallCustomer() {
	// TODO Auto-generated method stub
	return customerrepo.findAll();
}


}
