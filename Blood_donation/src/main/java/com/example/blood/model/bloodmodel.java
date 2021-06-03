package com.example.blood.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class bloodmodel {


	private String blood_grp;
	private String location;
	private int unit_no;
	
	
	
	
	public bloodmodel() {
		super();
	}
	
	
	
}
