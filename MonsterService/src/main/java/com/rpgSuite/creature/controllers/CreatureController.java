package com.rpgSuite.creature.controllers;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.Creature;
import com.rpgSuite.creature.services.CreatureService;


@RestController
@CrossOrigin
@RequestMapping(value = "/creatures")
public class CreatureController {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private CreatureService creatureService;

	@GetMapping(value = "{id}")
	public Creature getCreatureById(@PathVariable("id") int id) {
		log.debug("Get monster:" + id);
		return creatureService.getCreatureById(id);
	}
	
	@GetMapping(value = "/name")
	public Set<Creature> searchByName(HttpServletRequest req) {
		return creatureService.searchByName(req.getParameter("name"));
	}

	@GetMapping
	public Set<Creature> getAllCreatures() {
		return creatureService.getAllCreatures();
	}


	@PostMapping
	public Creature saveCreature(@RequestBody Creature monster) {
		return creatureService.saveCreature(monster);

	}
}
