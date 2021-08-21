package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Resident;
import com.example.demo.service.ResidentService;

@RestController
public class ResidentController {

	//Post the resident data
	@Autowired
	private ResidentService residentService ;
	@RequestMapping(value = "/resident" , method = RequestMethod.POST)
	public ResponseEntity<Resident> addResident(@RequestBody Resident resident) {
		Resident residentpojo = new Resident();
		residentpojo = residentService.addResidentServiceMethod(resident);
		return new ResponseEntity<Resident>(residentpojo,HttpStatus.CREATED) ;
	}
	
	
	//Get the resident data
	@RequestMapping(value = "/residents" , method = RequestMethod.GET)

	public ResponseEntity<List <Resident> > getAllResidents() {
		
		
		
		List <Resident> residentpojolist = new ArrayList<>();
		residentpojolist = residentService.getAllResidentsDetails();
		return new ResponseEntity<List <Resident>>(residentpojolist,HttpStatus.OK) ;
	}
	
	//Get the resident data by id 
	@RequestMapping(value = "/resident/{id}" , method = RequestMethod.GET)
	public ResponseEntity<Resident> getResidentById(@PathVariable("id") Long id) {
		Optional<Resident> residentpojo = Optional.ofNullable(new Resident());
		residentpojo = residentService.findByResidentId(id);
		return new ResponseEntity<Resident>(residentpojo.get(),HttpStatus.OK) ;
	}
	
	//Delete the resident data by id 
		@RequestMapping(value = "/resident/{id}" , method = RequestMethod.DELETE)
		public ResponseEntity<Integer> deleteResidentById(@PathVariable("id") Long id) {
			Resident residentpojo = new Resident();
			 residentService.removeByResidentId(id);
			return new ResponseEntity<Integer>(1,HttpStatus.OK) ;
		}
		
		
		//Update the resident data by id 
				@RequestMapping(value = "/resident/{id}" , method = RequestMethod.PUT)
				public ResponseEntity<Resident> updateResidentById(@RequestBody Resident resident,@PathVariable("id") Long id) {
					Optional<Resident> residentpojo = residentService.findByResidentId(id);
					residentpojo.get().setResidentName(resident.getResidentName());
					residentpojo.get().setVaccinationcentreId(resident.getVaccinationcentreId());
					Resident i = residentService.updateByResidentId(residentpojo.get());
					return new ResponseEntity<Resident>(i,HttpStatus.OK) ;
				}
			
	
}
