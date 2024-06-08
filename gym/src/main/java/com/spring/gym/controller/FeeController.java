package com.spring.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.gym.model.Fee;
import com.spring.gym.service.FeeService;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/fee")
public class FeeController {
	
	@Autowired
	private FeeService feeService;
	
    @PostMapping
	public ResponseEntity<Fee> createFee(@Valid @RequestBody Fee fee) {
    	feeService.create(fee);
	   return new ResponseEntity<>(fee, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Fee>listCustomer(){
		return feeService.listFee();
	}
	
	@PostMapping("/assign/{customerId}")
	public Fee assignFeeToCustomer(@PathVariable Integer customerId, @RequestBody Fee fee) {
	    return feeService.assignFeeToCustomer(customerId, fee);
	}

}
