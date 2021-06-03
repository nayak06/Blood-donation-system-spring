package com.example.blood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blood.model.bloodmodel;
import com.example.blood.repo.availablebloodRepo;

@RestController
@RequestMapping("/home")
public class home {

	@Autowired
	availablebloodRepo repo;
	
	
	@GetMapping("/available-blood")
	public void getAvailable()
	{
		
	}
	@PostMapping("/add")
	public void addBlood(@RequestBody bloodmodel md)
	{
		repo.save(md);
	}
}
