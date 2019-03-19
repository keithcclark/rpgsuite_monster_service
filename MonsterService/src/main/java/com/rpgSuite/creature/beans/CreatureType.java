package com.rpgSuite.creature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="creature_types")
public class CreatureType {
	@Id
	@SequenceGenerator(name="type", sequenceName="typeid_seq", allocationSize=1)
	@GeneratedValue(generator="type", strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String type;
	private String description;
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="TYPE_SUBTYPE", joinColumns= @JoinColumn(name="type_id"), 
	inverseJoinColumns=@JoinColumn(name="sub_id"))
	private Set<CreatureSubtype> subtypes = new HashSet<>();
	
	public CreatureType() {
		super();
	}

	public CreatureType(int id, String type, String description, Set<CreatureSubtype> subtypes) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.subtypes = subtypes;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<CreatureSubtype> getSubtypes() {
		return subtypes;
	}

	public void setSubtypes(Set<CreatureSubtype> subtypes) {
		this.subtypes = subtypes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((subtypes == null) ? 0 : subtypes.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		CreatureType other = (CreatureType) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (subtypes == null) {
			if (other.subtypes != null)
				return false;
		} else if (!subtypes.equals(other.subtypes))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Creature_Type [id=" + id + ", type=" + type + ", description=" + description + ", subtypes=" + subtypes
				+ "]";
	}
	
	
	
	
}
