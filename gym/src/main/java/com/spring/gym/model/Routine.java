package com.spring.gym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Routine")
@Table(name="routnes")
public class Routine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idRoutine;
	String day;

	public Routine() {
		
	}
	
	public Routine(Integer idRoutine, String day) {
		super();
		this.idRoutine = idRoutine;
		this.day = day;
	}

	public Integer getIdRoutine() {
		return idRoutine;
	}

	public void setIdRoutine(Integer idRoutine) {
		this.idRoutine = idRoutine;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	
}
