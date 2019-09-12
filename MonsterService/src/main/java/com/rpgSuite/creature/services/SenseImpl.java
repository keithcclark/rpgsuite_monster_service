package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.Sense;
import com.rpgSuite.creature.data.SenseDAO;

@Service
public class SenseImpl implements SenseService{
	@Autowired
	private SenseDAO dao;
	
	@Override
	public Set<Sense> getAllSenses() {
		return dao.findAll();
	}
	
}
