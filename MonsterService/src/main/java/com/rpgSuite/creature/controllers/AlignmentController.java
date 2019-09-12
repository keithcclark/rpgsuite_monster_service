package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.Alignment;
import com.rpgSuite.creature.services.AlignmentService;

@RestController
@CrossOrigin
@RequestMapping(value = "/alignment")
public class AlignmentController {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	
	@Autowired
	private AlignmentService alignmentService;
	
	@GetMapping
	public Set<Alignment> getAllAlignments(){
		return alignmentService.getAllAlignments();
	}
}
