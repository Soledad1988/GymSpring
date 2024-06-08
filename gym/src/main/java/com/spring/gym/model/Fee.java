package com.spring.gym.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="Fee")
@Table(name="fee")
public class Fee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFee;
	private Date datePayment;
	private Double fee;
	
	@ManyToOne
    @JoinColumn(name = "idCustomer")
    private Customer customer;
	
	public Fee() {
		
	}


	public Fee(Integer idFee, Date datePayment, Double fee, Customer customer) {
		super();
		this.idFee = idFee;
		this.datePayment = datePayment;
		this.fee = fee;
		this.customer = customer;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Integer getIdFee() {
		return idFee;
	}

	public void setIdFee(Integer idFee) {
		this.idFee = idFee;
	}

	public Date getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(Date datePayment) {
		this.datePayment = datePayment;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
	
}
