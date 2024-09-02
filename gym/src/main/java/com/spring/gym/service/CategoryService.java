package com.spring.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gym.model.Category;
import com.spring.gym.repository.CategoryRepository;

@Service
public class CategoryService implements ICategoryService{
	
	@Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void create(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> listCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public void delete(Integer idCategory) {
        categoryRepository.deleteById(idCategory);
    }

    @Override
    public Category read(Integer idCategory) {
        return categoryRepository.findById(idCategory).orElse(null);
    }

    @Override
    public void update(Integer idCategory, Category category) {
        // Implementation here
    }

}
