package com.jbk.DataBaseDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String phonenumber;
	@Column(unique = true)
	String emailId;
	
	Person(){
		
	}

	public Person(String name, String phonenumber, String emailId) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", emailId=" + emailId + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
