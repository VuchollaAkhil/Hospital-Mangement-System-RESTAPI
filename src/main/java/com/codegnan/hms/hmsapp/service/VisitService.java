package com.codegnan.hms.hmsapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codegnan.hms.hmsapp.entity.Doctor;
import com.codegnan.hms.hmsapp.entity.Patient;
import com.codegnan.hms.hmsapp.entity.Visit;
import com.codegnan.hms.hmsapp.exception.InvalidVisitIdExcepton;
import com.codegnan.hms.hmsapp.repository.VisitRepository;

@Service
public class VisitService {

	private VisitRepository repo;

	public VisitService(VisitRepository repo) {
		this.repo = repo;
	}

	public Visit saveVisit(Visit v) {
		Visit v1 = repo.save(v);
		return v1;
	}

	public List<Visit> findVisitsByPatient(Patient p) {
		return repo.findAllByPatient(p);
	}

	public List<Visit> findVisitsByDoctor(Doctor d) {
		return repo.findAllByDoctor(d);
	}
	
	//this might throw an exception
	public Visit findVisitById(int id) throws InvalidVisitIdExcepton
	{
		Optional<Visit> v=repo.findById(id);
		if(v.isEmpty())
		{
			throw new InvalidVisitIdExcepton("Visit ID"+id+"is Not Valid");
		}
		return v.get();
	}
	
	public Visit editVisit(Visit v) throws InvalidVisitIdExcepton
	{
		//findVisitById(v.getId());
		return repo.save(v);
	}
	
	public Visit deleteVisit(int id) throws InvalidVisitIdExcepton
	{
		Visit v=findVisitById(id);
		repo.deleteById(id);
		return v;
		
	}
}
