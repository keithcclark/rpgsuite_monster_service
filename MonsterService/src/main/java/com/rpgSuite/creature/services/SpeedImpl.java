package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.Speed;
import com.rpgSuite.creature.data.SpeedDAO;

@Service
public class SpeedImpl implements SpeedService{
	@Autowired
	private SpeedDAO dao;
	
	@Override
	public Set<Speed> getAllSpeeds() {
		return dao.findAll();
	}
}
