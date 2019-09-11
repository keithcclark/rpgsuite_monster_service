package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.Challenge_Rating;
import com.rpgSuite.creature.data.ChallegeRatingDAO;

@Service 
public class ChallengeRatingImpl implements ChallengeRatingService{
	@Autowired
	private ChallegeRatingDAO dao;

	@Override
	public Set<Challenge_Rating> getAllChallengeRatings() {
		return dao.findAll();
	}
	
}
