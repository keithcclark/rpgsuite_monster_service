package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.rpgSuite.creature.beans.Language;

public interface LanguageDAO extends CrudRepository<Language, Integer> {
	Set<Language> findAll();
}
