package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CREATURE_SENSES")
public class CreatureSense {
	@Id
	@SequenceGenerator(name = "creature_sense", sequenceName = "creature_senses_seq", allocationSize = 1)
	@GeneratedValue(generator = "creature_sense", strategy = GenerationType.SEQUENCE)
	private Integer id;
	@OneToOne
	private Sense sense;
	private Integer distance;
	public CreatureSense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreatureSense(Integer id, Sense sense, Integer distance) {
		super();
		this.id = id;
		this.sense = sense;
		this.distance = distance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Sense getSense() {
		return sense;
	}
	public void setSense(Sense sense) {
		this.sense = sense;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((distance == null) ? 0 : distance.hashCode());
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
		CreatureSense other = (CreatureSense) obj;
		if (distance == null) {
			if (other.distance != null)
				return false;
		} else if (!distance.equals(other.distance))
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
		return "CreatureSense [id=" + id + ", sense=" + sense + ", distance=" + distance + "]";
	}
	
}
