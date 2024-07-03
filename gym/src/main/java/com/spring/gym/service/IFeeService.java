package com.spring.gym.service;

import java.util.List;

import com.spring.gym.model.Fee;

public interface IFeeService {

	public void create(Fee fee);
    public List<Fee> listFee();
    public Fee assignFeeToCustomer(Integer customerId, Fee fee);
    List<Fee> getFeesByCustomerId(Integer idCustomer);
}
