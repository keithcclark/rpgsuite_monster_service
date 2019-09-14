package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.CreatureType;
import com.rpgSuite.creature.services.TypeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/type")
public class TypeController {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private TypeService typeService;
	
	@GetMapping
	public Set<CreatureType> getAllTypes(){
		return typeService.getAllTypes();
	}

}