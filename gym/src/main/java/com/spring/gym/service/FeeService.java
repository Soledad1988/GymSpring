package com.spring.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gym.model.Customer;
import com.spring.gym.model.Fee;
import com.spring.gym.repository.CustomerRepository;
import com.spring.gym.repository.FeeRepository;

@Service
public class FeeService implements IFeeService{
	
	@Autowired
	private FeeRepository feeRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void create(Fee fee) {
		feeRepository.save(fee);
	}

	@Override
	public List<Fee> listFee() {
		return feeRepository.findAll();
	}

	// Método para asignar cuota a un cliente
    public Fee assignFeeToCustomer(Integer customerId, Fee fee) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        fee.setCustomer(customer);
        return feeRepository.save(fee);
    }

}
