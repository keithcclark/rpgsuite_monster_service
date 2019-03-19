package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SKILLS")
public class Skill {
	@Id
	@SequenceGenerator(name = "skill", sequenceName="skillid_seq", allocationSize=1)
	@GeneratedValue(generator = "skill", strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private String main_stat;
	private String description;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(Integer id, String name, String main_stat, String description) {
		super();
		this.id = id;
		this.name = name;
		this.main_stat = main_stat;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMain_stat() {
		return main_stat;
	}
	public void setMain_stat(String main_stat) {
		this.main_stat = main_stat;
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
		result = prime * result + ((main_stat == null) ? 0 : main_stat.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Skill other = (Skill) obj;
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
		if (main_stat == null) {
			if (other.main_stat != null)
				return false;
		} else if (!main_stat.equals(other.main_stat))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", main_stat=" + main_stat + ", description=" + description + "]";
	}
	

}
