package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.CreatureSize;

@Component
public interface SizeDAO extends CrudRepository<CreatureSize, Integer>{
	Set<CreatureSize> findAll();
}
