package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.DamageType;
import com.rpgSuite.creature.services.DamageTypeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/damage_type")
public class DamageTypeController {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private DamageTypeService dtService;
	
	@GetMapping
	public Set<DamageType> getAllAlignments(){
		return dtService.getAllDamageTypes();
	}
}
