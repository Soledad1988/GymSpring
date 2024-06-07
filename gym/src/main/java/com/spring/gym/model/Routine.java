package com.spring.gym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.persistence.InheritanceType;

@Entity(name="Routine")
@Table(name="routnes")
@Inheritance(strategy = InheritanceType.JOINED)/*Herencia*/
public class Routine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idRoutine;
	String description;

	public Routine() {
		
	}
	
	public Routine(Integer idRoutine, String description) {
		super();
		this.idRoutine = idRoutine;
		this.description = description;
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
