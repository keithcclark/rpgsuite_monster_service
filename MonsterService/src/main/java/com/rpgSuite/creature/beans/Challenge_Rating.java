package com.rpgSuite.creature.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHALLENGE_RATINGS")
public class Challenge_Rating {

	// Commented out to test natural key
	// @SequenceGenerator(name="cr", sequenceName="challengeid_seq",
	// allocationSize=1)
	// @GeneratedValue(generator="cr", strategy=GenerationType.SEQUENCE)
	// private Integer id;
	@Id
	private String cr;
	private int xp;

	public Challenge_Rating() {
		super();

	}

	public Challenge_Rating(String cr, int xp) {
		super();
		this.cr = cr;
		this.xp = xp;
	}

	public Challenge_Rating(String cr) {
		super();
		this.cr = cr;
	}

	public String getCr() {
		return cr;
	}

	public void setCr(String cr) {
		this.cr = cr;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cr == null) ? 0 : cr.hashCode());
		result = prime * result + xp;
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
		Challenge_Rating other = (Challenge_Rating) obj;
		if (cr == null) {
			if (other.cr != null)
				return false;
		} else if (!cr.equals(other.cr))
			return false;
		if (xp != other.xp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Challenge_Rating [cr=" + cr + ", xp=" + xp + "]";
	}

}
