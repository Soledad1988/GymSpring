package com.spring.gym.service;

import java.util.List;

import com.spring.gym.model.Customer;

public interface ICustomerService {

	   public void create(Customer customer);
	    public List<Customer> listCustomer();
	    public void delete(Integer idCustomer);
	    public Customer read(Integer idCustomer);
	    public void update(Integer idCustomer, Customer customer);
}
