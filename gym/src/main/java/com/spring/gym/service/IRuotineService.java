package com.spring.gym.service;

import java.util.List;

import com.spring.gym.model.Routine;


public interface IRuotineService {

	 public void create(Routine routine);
	    public List<Routine> listRoutine();
	    public void delete(Integer idRoutine);
	    public Routine read(Integer idRoutine);
	    public void update(Routine routine);
	    public Routine assignCategoryToRoutine(Integer idCategory, Routine routine);
	    List<Routine> getRoutinesByCategoryId(Integer idCategory);
}
