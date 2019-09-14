package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.CreatureType;
import com.rpgSuite.creature.data.TypeDAO;

@Service
public class TypeImpl implements TypeService{
	@Autowired
	private TypeDAO dao;
	
	@Override
	public Set<CreatureType> getAllTypes() {
		return dao.findAll();
	}
}
