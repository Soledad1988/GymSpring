package com.spring.gym.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.gym.model.Routine;
import com.spring.gym.service.RoutineService;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/routine")
public class RoutineController {
	
	@Autowired
	private RoutineService routineService;
	
	
    @PostMapping
	public ResponseEntity<Routine> createRoutine(@Valid @RequestBody Routine routine) {
    	routineService.create(routine);
	   return new ResponseEntity<>(routine, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Routine>listRoutine(){
		return routineService.listRoutine();
	}
	
	@GetMapping("/{idRoutine}")
    public Routine get(@PathVariable("idRoutine") Integer idRoutine){
       return routineService.read(idRoutine);
    }
   
	@DeleteMapping("/{idRoutine}")
	void borrar(@PathVariable Integer idRoutine){
		routineService.delete(idRoutine);
	}
  
	@PutMapping
	public void update(@RequestBody Routine routine){
		routineService.update(routine);
	}
	
	@PostMapping("/assign/{idCategory}")
	public ResponseEntity<Routine> assignCategoryToRoutine(@PathVariable Integer idCategory, @Valid @RequestBody Routine routine) {
	     Routine assignedCategory = routineService.assignCategoryToRoutine(idCategory, routine);
	     return new ResponseEntity<>(assignedCategory, HttpStatus.CREATED);
	}

}
