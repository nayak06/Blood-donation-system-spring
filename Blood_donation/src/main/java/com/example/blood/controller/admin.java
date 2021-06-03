package com.example.blood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blood.model.blooddetails;
import com.example.blood.repo.blooddetailsRepo;

@RestController
@RequestMapping("/admin")
public class admin {

	@Autowired
	blooddetailsRepo repo;
	
	@PostMapping("/addDetails")
	public String addDetails(@RequestBody blooddetails md)
	{
		try
		{
			repo.save(md);
			return "Add Successfully";
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			return "Something Went Wrong";
		}
		
		
	}
}
