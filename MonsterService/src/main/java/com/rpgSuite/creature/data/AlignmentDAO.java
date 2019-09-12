package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.Alignment;

@Component
public interface AlignmentDAO extends CrudRepository<Alignment, Integer> {
	Set<Alignment> findAll();

}
