package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.Condition;
import com.rpgSuite.creature.services.ConditionService;

@RestController
@CrossOrigin
@RequestMapping(value = "/condition")
public class ConditionControlller {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private ConditionService conditionService;
	
	@GetMapping
	public Set<Condition> getAllAlignments(){
		return conditionService.getAllConditions();
	}
}
