package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SENSES")
public class Sense {
	@Id
	@SequenceGenerator(name = "sense", sequenceName = "senseid_seq", allocationSize = 1)
	@GeneratedValue(generator = "sense", strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String sense;
	private String description;
	public Sense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sense(Integer id, String sense, String description) {
		super();
		this.id = id;
		this.sense = sense;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSense() {
		return sense;
	}
	public void setSense(String sense) {
		this.sense = sense;
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
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sense == null) ? 0 : sense.hashCode());
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
		Sense other = (Sense) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sense == null) {
			if (other.sense != null)
				return false;
		} else if (!sense.equals(other.sense))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sense [id=" + id + ", sense=" + sense + ", description=" + description + "]";
	}
	
}
