package com.rpgSuite.creature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpgSuite.creature.beans.Alignment;
import com.rpgSuite.creature.data.AlignmentDAO;

@Service
public class AlignmentImpl implements AlignmentService {
	@Autowired
	private AlignmentDAO dao;
	
	@Override
	public Set<Alignment> getAllAlignments() {
		return dao.findAll();
	}

}
