package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.Speed;

@Component
public interface SpeedDAO extends CrudRepository<Speed, Integer> {
	Set<Speed> findAll();
}
