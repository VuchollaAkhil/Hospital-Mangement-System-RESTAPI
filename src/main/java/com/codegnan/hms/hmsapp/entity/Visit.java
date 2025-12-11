package com.codegnan.hms.hmsapp.entity;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class Visit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@ManyToOne
	@JoinColumn(name="p_id")
	Patient patient;
	
	@ManyToOne
	@JoinColumn(name="d-id")
	Doctor Doctor;
	
	Date date;
	
	String disease;
	double weight;
	double temperature;
	double bp;
	String modeOfPayement;
	
	public Visit()
	{
		
	}

	public Visit(  Date date, String disease,
			double weight, double temperature, double bp, String modeOfPayement) {
		super();
		this.date = date;
		this.disease = disease;
		this.weight = weight;
		this.temperature = temperature;
		this.bp = bp;
		this.modeOfPayement = modeOfPayement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return Doctor;
	}

	public void setDoctor(Doctor doctor) {
		Doctor = doctor;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getBp() {
		return bp;
	}

	public void setBp(double bp) {
		this.bp = bp;
	}

	public String getModeOfPayement() {
		return modeOfPayement;
	}

	public void setModeOfPayement(String modeOfPayement) {
		this.modeOfPayement = modeOfPayement;
	}
	
	
	
}
