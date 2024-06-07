package com.spring.gym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "upper_bodies")
@PrimaryKeyJoinColumn(name = "idRoutine")
public class UpperBody extends Routine{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUpperBody;
	private String ejercicio1;
	private String ejercicio2;
	private String ejercicio3;
	private String ejercicio4;
	private String ejercicio5;
	
	public UpperBody(Integer idUpperBody, String ejercicio1, String ejercicio2, String ejercicio3, String ejercicio4,
			String ejercicio5) {
		super();
		this.idUpperBody = idUpperBody;
		this.ejercicio1 = ejercicio1;
		this.ejercicio2 = ejercicio2;
		this.ejercicio3 = ejercicio3;
		this.ejercicio4 = ejercicio4;
		this.ejercicio5 = ejercicio5;
	}

	public Integer getIdUpperBody() {
		return idUpperBody;
	}

	public void setIdUpperBody(Integer idUpperBody) {
		this.idUpperBody = idUpperBody;
	}

	public String getEjercicio1() {
		return ejercicio1;
	}

	public void setEjercicio1(String ejercicio1) {
		this.ejercicio1 = ejercicio1;
	}

	public String getEjercicio2() {
		return ejercicio2;
	}

	public void setEjercicio2(String ejercicio2) {
		this.ejercicio2 = ejercicio2;
	}

	public String getEjercicio3() {
		return ejercicio3;
	}

	public void setEjercicio3(String ejercicio3) {
		this.ejercicio3 = ejercicio3;
	}

	public String getEjercicio4() {
		return ejercicio4;
	}

	public void setEjercicio4(String ejercicio4) {
		this.ejercicio4 = ejercicio4;
	}

	public String getEjercicio5() {
		return ejercicio5;
	}

	public void setEjercicio5(String ejercicio5) {
		this.ejercicio5 = ejercicio5;
	}
	
	
}
