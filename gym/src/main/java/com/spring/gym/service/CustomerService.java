package com.spring.gym.service;

import java.util.List;
import java.util.Optional;

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
	    public void update(Integer idCustomer, Customer customer) {
	        Optional<Customer> optionalCustomer = customerRepository.findById(idCustomer);
	        if (optionalCustomer.isPresent()) {
	            Customer existingCustomer = optionalCustomer.get();
	            existingCustomer.setName(customer.getName());
	            existingCustomer.setLastName(customer.getLastName());
	            existingCustomer.setDni(customer.getDni());
	            existingCustomer.setTelefonNumber(customer.getTelefonNumber());
	            existingCustomer.setAddress(customer.getAddress());
	            customerRepository.save(existingCustomer);
	        } 
	    }
}
