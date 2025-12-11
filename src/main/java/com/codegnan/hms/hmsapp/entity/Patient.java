package com.codegnan.hms.hmsapp.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Patient extends Person{
	
	private Date regDate;
	private int age;
	
	public Patient() {}

	public Patient(int id, String name, String email, String mobile, String gender, Date regDate, int age) {
		super(id, name, email, mobile, gender);
		this.regDate = regDate;
		this.age = age;
	}

	public Patient(String name, String email, String mobile, String gender, Date regDate, int age) {
		super(name, email, mobile, gender);
		this.regDate = regDate;
		this.age = age;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [regDate=" + regDate + ", age=" + age + "]";
	}
	
	
}
