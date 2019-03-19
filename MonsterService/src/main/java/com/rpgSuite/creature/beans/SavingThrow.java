package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SAVING_THROWS")
public class SavingThrow {
	@Id
	@SequenceGenerator(name = "saves", sequenceName = "saveid_seq", allocationSize = 1)
	@GeneratedValue(generator = "saves", strategy = GenerationType.SEQUENCE)
	private Integer id;
	private Integer monster_id;
	private String stat;
	private Integer modifier;
	public SavingThrow() {
		super();
	}
	public SavingThrow(Integer id, Integer monster_id, String stat, Integer modifier) {
		super();
		this.id = id;
		this.monster_id = monster_id;
		this.stat = stat;
		this.modifier = modifier;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMonster_id() {
		return monster_id;
	}
	public void setMonster_id(Integer monster_id) {
		this.monster_id = monster_id;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public Integer getModifier() {
		return modifier;
	}
	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modifier == null) ? 0 : modifier.hashCode());
		result = prime * result + ((monster_id == null) ? 0 : monster_id.hashCode());
		result = prime * result + ((stat == null) ? 0 : stat.hashCode());
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
		SavingThrow other = (SavingThrow) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modifier == null) {
			if (other.modifier != null)
				return false;
		} else if (!modifier.equals(other.modifier))
			return false;
		if (monster_id == null) {
			if (other.monster_id != null)
				return false;
		} else if (!monster_id.equals(other.monster_id))
			return false;
		if (stat == null) {
			if (other.stat != null)
				return false;
		} else if (!stat.equals(other.stat))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Saving_Throw [id=" + id + ", monster_id=" + monster_id + ", stat=" + stat + ", modifier=" + modifier
				+ "]";
	}
	
	
}