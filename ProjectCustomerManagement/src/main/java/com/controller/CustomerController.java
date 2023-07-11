package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {
	
@Autowired
	CustomerService customerservice;

@PostMapping("/save")  // for create value
	 Customer SaveCustomer(@RequestBody Customer c)
	{
		return customerservice.addcustomer(c);
	}
	/*@GetMapping("/getone/{id}")      // for get value
	public Customer getcustomer(@PathVariable("id") int id) {
		return customerservice.getcustomerById(id);
	}*/

	/*@GetMapping("/getAll")   // for get value
	public List<Customer>getallCustomer(){
		return customerservice.getallCustomer();
	}*/

 @DeleteMapping("/deleteone/{id}")      // for delete value
 public Customer getcustomer(@PathVariable("id") int id) {
	return customerservice.getcustomerById(id);
}
 @GetMapping("/deleteAll")   // for delete value
	public List<Customer>getallCustomer(){
		return customerservice.getallCustomer();
}
}