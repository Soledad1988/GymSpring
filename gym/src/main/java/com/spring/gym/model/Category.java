package com.spring.gym.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name="Category")
@Table(name="categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idCategory;
	String type;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
    private List<Routine> routine;
	

	public Category() {
		
	}
	
	public Category(Integer idCategory, String type, List<Routine> routine) {
		super();
		this.idCategory = idCategory;
		this.type = type;
		this.routine = routine;
	}

	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Routine> getRoutine() {
		return routine;
	}

	public void setRoutine(List<Routine> routine) {
		this.routine = routine;
	}
	
	
}
