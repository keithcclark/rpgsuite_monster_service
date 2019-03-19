package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CREATURE_SIZES")
public class CreatureSize {
	@Id
	@SequenceGenerator(name="size", sequenceName="sizeid_seq", allocationSize=1)
	@GeneratedValue(generator="size", strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String creature_size;
	private String description;
	public CreatureSize() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreatureSize(int id, String creature_size, String description) {
		super();
		this.id = id;
		this.creature_size = creature_size;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreature_size() {
		return creature_size;
	}
	public void setCreature_size(String creature_size) {
		this.creature_size = creature_size;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creature_size == null) ? 0 : creature_size.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
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
		CreatureSize other = (CreatureSize) obj;
		if (creature_size == null) {
			if (other.creature_size != null)
				return false;
		} else if (!creature_size.equals(other.creature_size))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Creature_Size [id=" + id + ", creature_size=" + creature_size + ", description=" + description + "]";
	}
	

}
