package com.codegnan.hms.hmsapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegnan.hms.hmsapp.entity.Doctor;
import com.codegnan.hms.hmsapp.entity.Patient;
import com.codegnan.hms.hmsapp.entity.Visit;
@Repository
public interface VisitRepository extends JpaRepository<Visit,Integer>{

	public List<Visit> findAllByPatient(Patient p);
	
	public  List<Visit> findAllByDoctor(Doctor d);
}
