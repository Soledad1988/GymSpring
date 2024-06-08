package com.spring.gym.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity(name="Customer")
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idCustomer;
	@NotBlank(message="add name")
	String name;
	@NotBlank(message="add last name")
	String lastName;
	@NotBlank(message="add DNI")
	String dni;
	@NotBlank(message="add telefon number")
	String telefonNumber;
	String address;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Fee> fees;
	
	public Customer() {
		
	}
	

	public Customer(Integer idCustomer, @NotBlank(message = "add name") String name,
			@NotBlank(message = "add last name") String lastName, @NotBlank(message = "add DNI") String dni,
			@NotBlank(message = "add telefon number") String telefonNumber, String address, List<Fee> fees) {
		super();
		this.idCustomer = idCustomer;
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.telefonNumber = telefonNumber;
		this.address = address;
		this.fees = fees;
	}


	public List<Fee> getFees() {
		return fees;
	}


	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}


	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefonNumber() {
		return telefonNumber;
	}

	public void setTelefonNumber(String telefonNumber) {
		this.telefonNumber = telefonNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
