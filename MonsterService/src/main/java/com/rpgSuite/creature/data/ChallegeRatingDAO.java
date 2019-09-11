package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.Challenge_Rating;

@Component
public interface ChallegeRatingDAO extends CrudRepository<Challenge_Rating, Integer> {
	Set<Challenge_Rating> findAll();
}
