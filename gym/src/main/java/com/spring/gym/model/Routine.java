package com.spring.gym.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="Routine")
@Table(name="routines")
public class Routine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idRoutine;
	String description;
	
	@ManyToOne
    @JoinColumn(name = "category_id")
	@JsonBackReference
    private Category category;
	

	public Routine() {
		
	}


	public Routine(Integer idRoutine, String description, Category category) {
		super();
		this.idRoutine = idRoutine;
		this.description = description;
		this.category = category;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Integer getIdRoutine() {
		return idRoutine;
	}

	public void setIdRoutine(Integer idRoutine) {
		this.idRoutine = idRoutine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
