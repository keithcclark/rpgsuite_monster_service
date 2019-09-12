package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.DamageType;
import com.rpgSuite.creature.data.DamageTypeDAO;

@Service
public class DamageTypeImpl implements DamageTypeService{
	@Autowired
	private DamageTypeDAO dao;
	
	@Override
	public Set<DamageType> getAllDamageTypes() {
		return dao.findAll();
	}

}
