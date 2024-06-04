package com.spring.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.gym.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
