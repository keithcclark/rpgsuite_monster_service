package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.CreatureSize;
import com.rpgSuite.creature.data.SizeDAO;

@Service
public class SizeImpl implements SizeService {
	@Autowired
	private SizeDAO dao;
	
	@Override
	public Set<CreatureSize> getAllSpeeds() {
		return dao.findAll();
	}
}
