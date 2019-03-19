package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SKILL_PROFICIENCIES")
public class SkillProf {
	@Id
	@SequenceGenerator(name = "skillProf", sequenceName="skill_prof_seq", allocationSize=1)
	@GeneratedValue(generator = "skillProf", strategy = GenerationType.SEQUENCE)
	private Integer id;
	@OneToOne
	private Skill skill;
	private Integer bonus;
	public SkillProf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SkillProf(Integer id, Skill skills, Integer bonus) {
		super();
		this.id = id;
		this.skill = skills;
		this.bonus = bonus;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Skill getSkills() {
		return skill;
	}
	public void setSkills(Skill skills) {
		this.skill = skills;
	}
	public Integer getBonus() {
		return bonus;
	}
	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bonus == null) ? 0 : bonus.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((skill == null) ? 0 : skill.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkillProf other = (SkillProf) obj;
		if (bonus == null) {
			if (other.bonus != null)
				return false;
		} else if (!bonus.equals(other.bonus))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (skill == null) {
			if (other.skill != null)
				return false;
		} else if (!skill.equals(other.skill))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SkillProf [id=" + id + ", skills=" + skill + ", bonus=" + bonus + "]";
	}

	
}
