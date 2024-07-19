package com.spring.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.gym.model.Category;
import com.spring.gym.model.Customer;
import com.spring.gym.model.Routine;
import com.spring.gym.service.CategoryService;
import com.spring.gym.service.RoutineService;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
    private CategoryService categoryService;

    @Autowired
    private RoutineService routineService;

    @PostMapping
    public ResponseEntity<Category> createCategory(@Valid @RequestBody Category category) {
        categoryService.create(category);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Category>> listCategory() {
        List<Category> categories = categoryService.listCategory();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("/{categoryId}/routines")
    public ResponseEntity<Routine> addRoutineToCategory(
        @PathVariable Integer categoryId, @Valid @RequestBody Routine routine) {
        
        Category category = categoryService.read(categoryId);
        if (category == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        routine.setCategory(category);
        routineService.create(routine);

        return new ResponseEntity<>(routine, HttpStatus.CREATED);
    }
}
