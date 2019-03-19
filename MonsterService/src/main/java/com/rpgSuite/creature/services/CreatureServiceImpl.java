package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.Creature;
import com.rpgSuite.creature.data.CreatureDAO;


@Service
public class CreatureServiceImpl implements CreatureService {
	@Autowired
	private CreatureDAO dao;

	@Override
	public Creature saveCreature(Creature monster) {
		monster = dao.save(monster);
		return monster;
	}

	@Override
	public Creature getCreatureById(int id) {
		Creature monster = dao.findOne(id);
		return monster;
	}
	
	@Override
	public Set<Creature> getAllCreatures() {
		return dao.findAll();
	}
	
	@Override
	public Set<Creature> searchByName(String name) {
		return dao.findByNameIgnoreCaseContainingOrderByNameAsc(name);
	}


	@Override
	public void deleteCreature(Creature monster) {
		dao.delete(monster);
		
	}

	
	


}
