package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.Speed;
import com.rpgSuite.creature.services.SpeedService;

@RestController
@CrossOrigin
@RequestMapping(value = "/speed")
public class SpeedController {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private SpeedService speedService;
	
	@GetMapping
	public Set<Speed> getAllSpeeds(){
		return speedService.getAllSpeeds();
	}

}
