package com.spring.gym.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.gym.model.Category;
import com.spring.gym.model.Routine;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Integer>{
	
	List<Routine> findByCategoryIdCategory(Integer idCategory);

}
