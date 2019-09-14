package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.CreatureType;

@Component
public interface TypeDAO extends CrudRepository<CreatureType, Integer> {
	Set<CreatureType> findAll();

}
