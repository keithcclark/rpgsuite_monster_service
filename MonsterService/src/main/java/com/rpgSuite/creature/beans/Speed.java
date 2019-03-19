package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="speeds")
public class Speed {
	@Id
	@SequenceGenerator(name = "speed", sequenceName = "speedid_seq", allocationSize = 1)
	@GeneratedValue(generator = "speed", strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String speed;
	private String description;
	public Speed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Speed(Integer id, String speed, String description) {
		super();
		this.id = id;
		this.speed = speed;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
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
		Speed other = (Speed) obj;
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
		if (speed == null) {
			if (other.speed != null)
				return false;
		} else if (!speed.equals(other.speed))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Speed [id=" + id + ", speed=" + speed + ", description=" + description + "]";
	}
	

}
