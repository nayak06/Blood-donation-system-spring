package com.example.blood.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.blood.model.bloodmodel;

public interface availablebloodRepo extends CrudRepository<bloodmodel, Integer> {

	
}
