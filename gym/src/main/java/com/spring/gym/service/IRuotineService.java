package com.spring.gym.service;

import java.util.List;

import com.spring.gym.model.Routine;


public interface IRuotineService {

	 public void create(Routine routine);
	    public List<Routine> listRotine();
	    public void delete(Integer idRoutine);
	    public Routine read(Integer idRoutine);
	    public void update(Routine routine);
}
