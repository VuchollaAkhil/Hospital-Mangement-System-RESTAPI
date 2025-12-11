package com.codegnan.hms.hmsapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.hms.hmsapp.entity.Doctor;
import com.codegnan.hms.hmsapp.entity.Visit;
import com.codegnan.hms.hmsapp.exception.InvalidDoctorIdException;
import com.codegnan.hms.hmsapp.service.DoctorService;
import com.codegnan.hms.hmsapp.service.VisitService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	// REQUire the objects of DoctorService,VisitService
	private final DoctorService docser;
	private final VisitService visitser;

	public DoctorController(DoctorService docser, VisitService visitser) {
		this.docser = docser;
		this.visitser = visitser;
	}

	// Get visits by doctor
	@GetMapping("/{id}/visits")
	public ResponseEntity<List<Visit>> getVisitsByDoctor(@PathVariable int id) throws InvalidDoctorIdException {
		Doctor d = docser.findDoctorById(id);
		List<Visit> v = visitser.findVisitsByDoctor(d);

		return ResponseEntity.ok(v);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Doctor> getById(@PathVariable int id) throws InvalidDoctorIdException
	{
		return ResponseEntity.ok(docser.findDoctorById(id));
	}
	@GetMapping
	public ResponseEntity<List<Doctor>> getAllDoctors()
	{
		return ResponseEntity.ok(docser.getAll());
	}
	@PostMapping
	public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor d)
	{
		return ResponseEntity.ok(docser.hireDoctor(d));
	}
	@PutMapping
	public ResponseEntity<Doctor> update(@RequestBody Doctor d)
	{
		return ResponseEntity.ok(docser.update(d));
	}
	//http://localhost:8080/doctor/
	//@postMapping("") call horeDoctor from Doctorservice
	
	// put to update a doctors information by id
	//@
}
