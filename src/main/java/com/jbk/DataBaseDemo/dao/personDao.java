package com.jbk.DataBaseDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.DataBaseDemo.entity.Person;

@Repository
public class personDao {
     @Autowired
	SessionFactory factory;
	public void addperson(Person p) {
		
	
	Session session =factory.openSession();
	session.beginTransaction();
	
	session.persist(p);
	
	session.getTransaction().commit();
	session.close();
	
	
	
	
		
		
	}
	public void updatePerson(int id, Person p) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		
		session.beginTransaction();
	   Person person=	session.get(Person.class,  id);
	   
	   person.setEmailId(p.getEmailId());
	   person.setName(p.getName());
	   person.setPhonenumber(p.getPhonenumber());
	   
	   session.merge(person);
	   
	   session.getTransaction().commit();
	   
	   session.close();
	   
	   
	   
		
		
		
	}
	public void deleteRecord(int id) {
		// TODO Auto-generated method stub
		
		Session session =factory.openSession();
		session.beginTransaction();
		 
		 Person person = session.get(Person.class, id);
	       
		 session.remove(person);
	       session.getTransaction().commit();
	       session.close();
		
	}
	public List<Person> getAllRecord() {
		// TODO Auto-generated method stub

		String HQLQuery = "from Person";
		Session session = factory.openSession();
		session.beginTransaction();

		Query<Person> query = session.createQuery(HQLQuery, Person.class);
		List<Person> list = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return list;
		
		
		
	}
}
