/**
 * 
 */
package com.rpgSuite.creature.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgSuite.creature.beans.Challenge_Rating;
import com.rpgSuite.creature.services.ChallengeRatingService;

@RestController
@CrossOrigin
@RequestMapping(value = "/challenge_rating")
public class ChallengeRatingController {
	Logger log = LoggerFactory.getLogger(CreatureController.class);
	@Autowired
	private ChallengeRatingService crService;
	
	@GetMapping
	public Set<Challenge_Rating> getAllChallengeRatings(){
		return crService.getAllChallengeRatings();
	}

}
