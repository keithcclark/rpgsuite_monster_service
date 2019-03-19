package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ACTIONS")
public class CreatureAction {
	@Id
	@SequenceGenerator(name="action", sequenceName="actionid_seq", allocationSize=1)
	@GeneratedValue(generator="action", strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private String description;
	private Integer attackBonus;
	private String damageDice;
	private Integer damageBonus;
	public CreatureAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreatureAction(Integer id, String name, String description, Integer attackBonus, String damageDice,
			Integer damageBonus) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.attackBonus = attackBonus;
		this.damageDice = damageDice;
		this.damageBonus = damageBonus;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAttackBonus() {
		return attackBonus;
	}
	public void setAttackBonus(Integer attackBonus) {
		this.attackBonus = attackBonus;
	}
	public String getDamageDice() {
		return damageDice;
	}
	public void setDamageDice(String damageDice) {
		this.damageDice = damageDice;
	}
	public Integer getDamageBonus() {
		return damageBonus;
	}
	public void setDamageBonus(Integer damageBonus) {
		this.damageBonus = damageBonus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attackBonus == null) ? 0 : attackBonus.hashCode());
		result = prime * result + ((damageBonus == null) ? 0 : damageBonus.hashCode());
		result = prime * result + ((damageDice == null) ? 0 : damageDice.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CreatureAction other = (CreatureAction) obj;
		if (attackBonus == null) {
			if (other.attackBonus != null)
				return false;
		} else if (!attackBonus.equals(other.attackBonus))
			return false;
		if (damageBonus == null) {
			if (other.damageBonus != null)
				return false;
		} else if (!damageBonus.equals(other.damageBonus))
			return false;
		if (damageDice == null) {
			if (other.damageDice != null)
				return false;
		} else if (!damageDice.equals(other.damageDice))
			return false;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CreatureAction [id=" + id + ", name=" + name + ", description=" + description + ", attackBonus="
				+ attackBonus + ", damageDice=" + damageDice + ", damageBonus=" + damageBonus + "]";
	}
	
}
