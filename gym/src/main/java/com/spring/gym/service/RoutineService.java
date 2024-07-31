package com.spring.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gym.model.Category;
import com.spring.gym.model.Customer;
import com.spring.gym.model.Fee;
import com.spring.gym.model.Routine;
import com.spring.gym.repository.CategoryRepository;
import com.spring.gym.repository.RoutineRepository;

@Service
public class RoutineService implements IRuotineService{

	  @Autowired
	    private RoutineRepository routineRepository;
	  
	  @Autowired
	    private CategoryRepository categoryRepository;

	    @Override
	    public void create(Routine routine) {
	        routineRepository.save(routine);
	    }

	    @Override
	    public List<Routine> listRoutine() {
	        return routineRepository.findAll();
	    }

	    @Override
	    public void delete(Integer idRoutine) {
	        routineRepository.deleteById(idRoutine);
	    }

	    @Override
	    public Routine read(Integer idRoutine) {
	        return routineRepository.findById(idRoutine).orElse(null);
	    }

	    @Override
	    public void update(Routine routine) {
	        routineRepository.save(routine);
	    }
	    
	 // Método para asignar categoria a una rutina
	    @Override
	    public Routine assignCategoryToRoutine(Integer idCategory, Routine routine) {
	        Category category = categoryRepository.findById(idCategory)
	                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
	        routine.setCategory(category);
	        return routineRepository.save(routine);
	    }


	    @Override
	    public List<Routine> getRoutinesByCategoryId(Integer idCategory) {
	        return routineRepository.findByCategoryIdCategory(idCategory);
	    }
	    
}
