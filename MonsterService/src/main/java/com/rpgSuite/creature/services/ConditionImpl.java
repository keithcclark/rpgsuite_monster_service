package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.Condition;
import com.rpgSuite.creature.data.ConditionDAO;

@Service
public class ConditionImpl implements ConditionService{
	@Autowired
	private ConditionDAO dao;
	
	@Override
	public Set<Condition> getAllConditions() {
		return dao.findAll();
	}

}
