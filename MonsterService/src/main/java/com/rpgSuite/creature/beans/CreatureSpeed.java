package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CREATURE_SPEED")
public class CreatureSpeed {
	@Id
	@SequenceGenerator(name ="creatureSpeed", sequenceName = "creature_senses_seq", allocationSize = 1)
	@GeneratedValue(generator = "creatureSpeed", strategy = GenerationType.SEQUENCE)
	private Integer id;
	@OneToOne
	private Speed speed;
	private Integer distance;
	public CreatureSpeed() {
		super();
	}
	public CreatureSpeed(Integer id, Speed speed, Integer distance) {
		super();
		this.id = id;
		this.speed = speed;
		this.distance = distance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Speed getSpeed() {
		return speed;
	}
	public void setSpeed(Speed speed) {
		this.speed = speed;
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
		result = prime * result + ((speed == null) ? 0 : speed.hashCode());
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
		CreatureSpeed other = (CreatureSpeed) obj;
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
		if (speed == null) {
			if (other.speed != null)
				return false;
		} else if (!speed.equals(other.speed))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CreatureSpeed [id=" + id + ", speed=" + speed + ", distance=" + distance + "]";
	}

}
