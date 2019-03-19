package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/*
 * 
 */
@Entity
@Table(name="ALIGNMENTS")
public class Alignment {
	@Id
	@SequenceGenerator(name="alignment", sequenceName="alignmentid_seq", allocationSize=1)
	@GeneratedValue(generator="alignment", strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String alignment;
	private String description;
	public Alignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alignment(int id, String alignment, String description) {
		super();
		this.id = id;
		this.alignment = alignment;
		this.description = description;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
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
		result = prime * result + ((alignment == null) ? 0 : alignment.hashCode());
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
		Alignment other = (Alignment) obj;
		if (alignment == null) {
			if (other.alignment != null)
				return false;
		} else if (!alignment.equals(other.alignment))
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
		return "Alignment [id=" + id + ", alignment=" + alignment + ", description=" + description + "]";
	}
	
	

}
