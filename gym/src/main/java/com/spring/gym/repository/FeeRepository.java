package com.spring.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.gym.model.Fee;

@Repository
public interface FeeRepository extends JpaRepository<Fee, Integer>{

}
