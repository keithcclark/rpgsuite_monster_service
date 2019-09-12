package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.Sense;

@Component
public interface SenseDAO extends CrudRepository<Sense, Integer> {
	Set<Sense> findAll();
}
