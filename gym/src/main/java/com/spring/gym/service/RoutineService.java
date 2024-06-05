package com.spring.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gym.model.Routine;
import com.spring.gym.repository.RoutineRepository;

@Service
public class RoutineService implements IRuotineService{

	@Autowired
	private RoutineRepository routineRepository;

	@Override
	public void create(Routine routine) {
		routineRepository.save(routine);
	}

	@Override
	public List<Routine> listRotine() {
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
}
