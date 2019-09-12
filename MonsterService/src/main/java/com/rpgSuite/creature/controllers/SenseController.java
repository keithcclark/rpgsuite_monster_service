package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.Sense;
import com.rpgSuite.creature.services.SenseService;

@RestController
@CrossOrigin
@RequestMapping(value = "/sense")
public class SenseController {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private SenseService senseService;
	
	@GetMapping
	public Set<Sense> getAllsense(){
		return senseService.getAllSenses();
	}

}
