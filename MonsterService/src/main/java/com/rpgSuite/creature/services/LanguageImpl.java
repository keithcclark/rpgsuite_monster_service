package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.Language;
import com.rpgSuite.creature.beans.Speed;
import com.rpgSuite.creature.data.LanguageDAO;
import com.rpgSuite.creature.data.SpeedDAO;

@Service
public class LanguageImpl implements LanguageService {
	@Autowired
	private LanguageDAO dao;
	
	@Override
	public Set<Language> getAllLanguages() {
		return dao.findAll();
	}
}
