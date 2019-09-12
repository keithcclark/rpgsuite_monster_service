package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.Condition;

@Component
public interface ConditionDAO extends CrudRepository<Condition, Integer>{
	Set<Condition> findAll();

}
