package com.spring.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.gym.model.Customer;
import com.spring.gym.service.CustomerService;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
    @PostMapping
	public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
	  customerService.create(customer);
	   return new ResponseEntity<>(customer, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Customer>listCustomer(){
		return customerService.listCustomer();
	}
	
	@GetMapping("/{idCustomer}")
    public Customer get(@PathVariable("idCustomer") Integer idCustomer){
       return customerService.read(idCustomer);
    }
   
	@DeleteMapping("/{idCustomer}")
	void borrar(@PathVariable Integer idCustomer){
		customerService.delete(idCustomer);
	}
  
	@PutMapping
	public void update(@RequestBody Customer customer){
		customerService.update(customer);
	 }
	
}