package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Resident;
import com.example.demo.repository.ResidentRespository;

@Service
public class ResidentService {
	
	@Autowired
	private ResidentRespository residentRespository ;

	public Resident addResidentServiceMethod(Resident resident) {
		return residentRespository.save(resident);
		
	}

	public List<Resident> getAllResidentsDetails() {
		// TODO Auto-generated method stub
		return residentRespository.findAll();
	}

	public Optional<Resident> findByResidentId(Long id) {
		// TODO Auto-generated method stub
		return residentRespository.findById(id);
	}

	public void removeByResidentId(Long id) {
		// TODO Auto-generated method stub
		residentRespository.deleteById(id);
	}

	public  Resident updateByResidentId(Resident residentpojo) {
		// TODO Auto-generated method stub
		return residentRespository.save(residentpojo);
	}

	

}
