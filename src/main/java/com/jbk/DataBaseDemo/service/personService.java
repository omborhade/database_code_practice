package com.jbk.DataBaseDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.DataBaseDemo.dao.personDao;
import com.jbk.DataBaseDemo.entity.Person;

@Service
public class personService {
     @Autowired
	personDao pdao;
	public String addperson(Person p) {
		
		pdao.addperson(p);
		
		return "data added succesfully";
	}
	public String updatePerson(int id, Person p) {
		// TODO Auto-generated method stub
		pdao.updatePerson(id, p);
		
		return"record updated succesfully";
		
	}
	public String deleteRecord(int id) {
		// TODO Auto-generated method stub
		
		pdao.deleteRecord(id);
		
		return"record deleted succesfully";
		
	}
	public List<Person> getAllRecord() {
		// TODO Auto-generated method stub
	    	List<Person> list =pdao.getAllRecord();
	    	
	    	return list;
		
	}
}
