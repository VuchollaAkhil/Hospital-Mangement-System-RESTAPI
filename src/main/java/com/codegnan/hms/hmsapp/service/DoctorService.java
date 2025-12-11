package com.codegnan.hms.hmsapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codegnan.hms.hmsapp.entity.Doctor;
import com.codegnan.hms.hmsapp.exception.InvalidDoctorIdException;
import com.codegnan.hms.hmsapp.repository.DoctorRepository;

@Service
public class DoctorService {
	private DoctorRepository repo;
	
	public DoctorService(DoctorRepository repo)
	{
		this.repo=repo;
	}
	
	public Doctor hireDoctor(Doctor doctor)
	{
		return repo.save(doctor);
	}
	
	public Doctor findDoctorById(int id) throws InvalidDoctorIdException
	{
		Optional<Doctor>doctor=repo.findById(id);
		if(doctor.isEmpty())
		{
			throw new InvalidDoctorIdException("Doctro No present With id"+id);
		}
		return doctor.get();
	}
	public List<Doctor> getAll()
	{
		return repo.findAll();
	}
	public Doctor update(Doctor d)
	{
		return repo.save(d);
	}
	
}
