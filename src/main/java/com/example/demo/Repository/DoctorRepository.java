package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{
	Doctor findByName(String name);
	
	
}
