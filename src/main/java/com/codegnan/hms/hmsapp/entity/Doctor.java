package com.codegnan.hms.hmsapp.entity;

import jakarta.persistence.*;

@Entity
public class Doctor extends Person{
	String specialization;
	int experience;
	String degree;
	double salary;
	public Doctor() {
	}
	public Doctor(int id, String name, String email, String mobile, String gender, String specialization,
			int experience, String degree, double salary) {
		super(id, name, email, mobile, gender);
		this.specialization = specialization;
		this.experience = experience;
		this.degree = degree;
		this.salary = salary;
	}
	public Doctor(String name, String email, String mobile, String gender, String specialization, int experience,
			String degree, double salary) {
		super(name, email, mobile, gender);
		this.specialization = specialization;
		this.experience = experience;
		this.degree = degree;
		this.salary = salary;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Doctor [specialization=" + specialization + ", experience=" + experience + ", degree=" + degree
				+ ", salary=" + salary + "]";
	}
	
	
	
}
