package com.spring.gym.service;

import java.util.List;

import com.spring.gym.model.Category;

public interface ICategoryService {

	public void create(Category category);
    public List<Category> listCategory();
    public void delete(Integer idCategory);
    public Category read(Integer idCategory);
    public void update(Integer idCategory, Category category);
}
