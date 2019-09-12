package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.CreatureSize;
import com.rpgSuite.creature.services.SizeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/size")
public class SizeController {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private SizeService sizeService;
	
	@GetMapping
	public Set<CreatureSize> getAllAlignments(){
		return sizeService.getAllSpeeds();
	}

}
