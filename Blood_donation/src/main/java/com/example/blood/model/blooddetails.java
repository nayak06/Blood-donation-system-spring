package com.example.blood.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blood_details")
public class blooddetails {
	
	@Id
	@GeneratedValue
	private int slno;
	private String name;
	private int age;
	private String bloodgrp;
	private String location;
	private int contact;
	private String gender;
	
	
	
	
	public blooddetails() {
		super();
	}
	public blooddetails(String name, int age, String bloodgrp, String location, int contact, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.bloodgrp = bloodgrp;
		this.location = location;
		this.contact = contact;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodgrp() {
		return bloodgrp;
	}
	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
