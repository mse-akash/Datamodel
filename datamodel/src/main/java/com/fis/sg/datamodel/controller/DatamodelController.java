package com.fis.sg.datamodel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.sg.datamodel.entity.Datamodel;
import com.fis.sg.datamodel.repository.DatamodelRepository;


@CrossOrigin
@RestController
@RequestMapping("/datamodel")
public class DatamodelController {
	
	@Autowired
	DatamodelRepository datamodelRepository;
	
	@GetMapping("/result")
	public List<Datamodel> getAllProducts() {
		List<Datamodel> results = datamodelRepository.findAll();
		return results;

	}
	
}
