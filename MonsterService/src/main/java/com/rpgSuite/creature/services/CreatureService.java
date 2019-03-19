package com.rpgSuite.creature.services;

import java.util.Set;

import com.rpgSuite.creature.beans.Creature;

public interface CreatureService {
	public Creature saveCreature(Creature monster);
	public Creature getCreatureById(int id);
	public Set<Creature> getAllCreatures();
	public Set<Creature> searchByName(String name);
	public void deleteCreature(Creature monster);
}
