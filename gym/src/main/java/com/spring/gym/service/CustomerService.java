package com.spring.gym.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.gym.model.Customer;
import com.spring.gym.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public void create(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> listCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public void delete(Integer idCustomer) {
		customerRepository.deleteById(idCustomer);
	}

	@Override
	public Customer read(Integer idCustomer) {
		return customerRepository.findById(idCustomer).orElse(null);
	}

	@Override
	public void update(Customer customer) {
		customerRepository.save(customer);
	}
}
