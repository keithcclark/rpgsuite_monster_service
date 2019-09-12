package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.Language;
import com.rpgSuite.creature.services.LanguageService;

@RestController
@CrossOrigin
@RequestMapping(value = "/language")
public class LanguageController {

	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private LanguageService languageService;
	
	@GetMapping
	public Set<Language> getAllAlignments(){
		return languageService.getAllLanguages();
	}
}
