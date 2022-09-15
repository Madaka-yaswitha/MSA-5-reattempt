package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Doctor;
import com.example.demo.Repository.DoctorRepository;



@RestController
public class DoctorController {
	@Autowired
	private DoctorRepository doctorrepository;
	
	@PostMapping("/adddoctor")
	public String saveDoctor(@RequestBody Doctor emp) {
		doctorrepository.save(emp);
		return "Doctor added sucessfully:: "+emp.getId();
	}
	
	@GetMapping("/Doctor")
	public List<Doctor>getAllDoctor() {
		return doctorrepository.findAll();
	}
	
	
	@GetMapping("/findDoctor/{id}")
	public Optional<Doctor> getDoctor(@PathVariable Integer id) {
		return doctorrepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctor(@PathVariable int id) {
		doctorrepository.deleteById(id);
		return "Deleted Doctor sucessfully";
	
	}
}

	
