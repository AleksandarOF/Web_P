package edu.fra.uas.conversation.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import edu.fra.uas.model.Barchart;
import edu.fra.uas.repository.BarchartRepository;

@RestController 
@RequestMapping(value= "/api/barchart")//Hier finden wir alle gegeben Dateien in der JSON
public class ApiController {
	
	@Autowired
	private BarchartRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Barchart>> getAll(){
		return new ResponseEntity<>(this.repository.findAll(),HttpStatus.OK);
		
	}
	
	/*
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveBarchart(@RequestBody Barchart barchart){
		this.repository.save(barchart);
		return new ResponseEntity<>("Barchart is saved", HttpStatus.CREATED);
	}
	*/
	@PostMapping()		//Long
	public ResponseEntity<String> saveBarchart(@RequestBody Barchart barchart){
		this.repository.save(barchart);
		//return new ResponseEntity<>(barchart.getId(),HttpStatus.CREATED);
		return new ResponseEntity<>("Barchart is saved", HttpStatus.ACCEPTED);
	}
	
	
	
}
