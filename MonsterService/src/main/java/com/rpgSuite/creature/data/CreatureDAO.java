package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.Creature;

@Component
public interface CreatureDAO extends CrudRepository<Creature, Integer> {
	Set<Creature> findAll();
	Set<Creature> findByNameIgnoreCaseContainingOrderByNameAsc(String name);
}
