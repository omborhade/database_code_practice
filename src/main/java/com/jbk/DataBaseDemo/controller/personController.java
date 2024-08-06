package com.jbk.DataBaseDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.DataBaseDemo.entity.Person;
import com.jbk.DataBaseDemo.service.personService;



@RestController
@RequestMapping("person")
public class personController {
     @Autowired
	personService pservice;
	
	@PostMapping("addperson")
	public String addperson(@RequestBody Person p) {
	       String msg =	pservice.addperson(p);
	       return msg;
		
	}
	
	
	@PutMapping("updateperson/{id}")
	public String updateRecord(@PathVariable int id , @RequestBody Person p) {
		 
		String msg =pservice.updatePerson(id, p);
		
		return msg;
		
		
		
	}
	
	@DeleteMapping("deleteperson/{id}")
	public String deleteRecord( @PathVariable int id) {
		String msg =pservice.deleteRecord(id);
		
		return msg;
	}
	
	@GetMapping("getperson")
	public List<Person> getAllRecord() {
		
		List<Person> list=	pservice.getAllRecord();
		return list;
		
	}
}
