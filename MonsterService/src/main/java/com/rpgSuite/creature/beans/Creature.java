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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="monsters")
public class Creature {
	@Id
	@SequenceGenerator(name="monster", sequenceName="monsterid_seq", allocationSize=1)
	@GeneratedValue(generator="monster", strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private Integer strength;
	private Integer dexterity;
	private Integer constitution;
	private Integer intelligence;
	private Integer wisdom;
	private Integer charisma;
	private Integer armor_class;
	private Integer hit_points;
	private String hit_dice;
	//SAVING THROW PROF
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="monster_id")
	private Set<SavingThrow> savingThrows = new HashSet<>();
	//CR
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="challenge_rating")
	private Challenge_Rating challenge_rating;
	//TYPE
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CREATURE_TYPE")
	private CreatureType creature_type;
	//ALIGNMENT
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ALIGNMENT")
	private Alignment alignment;
	//SIZE
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CREATURE_SIZE")
	private CreatureSize creature_size;
	//LANGUAGES
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="CREATURE_LANGUAGES", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="language_id"))
	private Set<Language> languages = new HashSet<>();
	//TRAITS
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="CREATURE_TRAITS", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="trait_id"))
	private Set<CreatureTrait> traits = new HashSet<CreatureTrait>();
	//ACTIONS
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="CREATURE_ACTIONS", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="action_id"))
	private Set<CreatureAction> actions = new HashSet<>();
	//REACTIONS
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="CREATURE_REACTIONS", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="reaction_id"))
	private Set<CreatureReaction> reactions = new HashSet<>();
	//LEGENDARY ACTIONS
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="CREATURE_LEGENDARY", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="LEGENDARY_ID"))
	private Set<CreatureLegendary> legendaryActions = new HashSet<>();
	//ENVIRONMENTS
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="CREATURE_ENVIRONMENTS", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="ENVIRONMENT_ID"))
	private Set<Environment> environments = new HashSet<>();
	//DAMAGE VULN
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="DAMAGE_vulnerability", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="damage_type_ID"))
	private Set<DamageType> damageVulnerability = new HashSet<>();
	//DAMAGE RESIST
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="DAMAGE_RESISTANCE", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="damage_type_ID"))
	private Set<DamageType> damageResistance = new HashSet<>();
	//DAMAGE IMMUNITY
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="DAMAGE_IMMUNITY", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="damage_type_ID"))
	private Set<DamageType> damageImmunity = new HashSet<>();
	//CONDITION IMMUNITY
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="CONDITION_IMMUNITY", joinColumns= @JoinColumn(name="monsters_id"), 
	inverseJoinColumns=@JoinColumn(name="CONDITION_ID"))
	private Set<Condition> conditionImmunity = new HashSet<>();
	//SENSES
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="monsters_id")
	private Set<CreatureSense> senses = new HashSet<>();
	//SPEEDS
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="monsters_id")
	private Set<CreatureSpeed> speeds = new HashSet<>();
	//SKILLS PROFS
//	@ManyToMany(fetch=FetchType.EAGER)
//	@JoinTable(name="SKILL_PROFICIENCIES", joinColumns= @JoinColumn(name="monsters_id"),
//	inverseJoinColumns=@JoinColumn(name="SKILL_ID"))
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="monsters_id")
	private Set<SkillProf> skills = new HashSet<>();
	public Creature() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Creature(Integer id, String name, Integer strength, Integer dexterity, Integer constitution,
			Integer intelligence, Integer wisdom, Integer charisma, Integer armor_class, Integer hit_points,
			String hit_dice, Set<SavingThrow> savingThrows, Challenge_Rating challenge_rating,
			CreatureType creature_type, Alignment alignment, CreatureSize creature_size, Set<Language> languages,
			Set<CreatureTrait> traits, Set<CreatureAction> actions, Set<CreatureReaction> reactions,
			Set<CreatureLegendary> legendaryActions, Set<Environment> environments, Set<DamageType> damageVulnerability,
			Set<DamageType> damageResistance, Set<DamageType> damageImmunity, Set<Condition> conditionImmunity,
			Set<CreatureSense> senses, Set<CreatureSpeed> speeds, Set<SkillProf> skills) {
		super();
		this.id = id;
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.armor_class = armor_class;
		this.hit_points = hit_points;
		this.hit_dice = hit_dice;
		this.savingThrows = savingThrows;
		this.challenge_rating = challenge_rating;
		this.creature_type = creature_type;
		this.alignment = alignment;
		this.creature_size = creature_size;
		this.languages = languages;
		this.traits = traits;
		this.actions = actions;
		this.reactions = reactions;
		this.legendaryActions = legendaryActions;
		this.environments = environments;
		this.damageVulnerability = damageVulnerability;
		this.damageResistance = damageResistance;
		this.damageImmunity = damageImmunity;
		this.conditionImmunity = conditionImmunity;
		this.senses = senses;
		this.speeds = speeds;
		this.skills = skills;
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
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getDexterity() {
		return dexterity;
	}
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	public Integer getConstitution() {
		return constitution;
	}
	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public Integer getWisdom() {
		return wisdom;
	}
	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}
	public Integer getCharisma() {
		return charisma;
	}
	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}
	public Integer getArmor_class() {
		return armor_class;
	}
	public void setArmor_class(Integer armor_class) {
		this.armor_class = armor_class;
	}
	public Integer getHit_points() {
		return hit_points;
	}
	public void setHit_points(Integer hit_points) {
		this.hit_points = hit_points;
	}
	public String getHit_dice() {
		return hit_dice;
	}
	public void setHit_dice(String hit_dice) {
		this.hit_dice = hit_dice;
	}
	public Set<SavingThrow> getSavingThrows() {
		return savingThrows;
	}
	public void setSavingThrows(Set<SavingThrow> savingThrows) {
		this.savingThrows = savingThrows;
	}
	public Challenge_Rating getChallenge_rating() {
		return challenge_rating;
	}
	public void setChallenge_rating(Challenge_Rating challenge_rating) {
		this.challenge_rating = challenge_rating;
	}
	public CreatureType getCreature_type() {
		return creature_type;
	}
	public void setCreature_type(CreatureType creature_type) {
		this.creature_type = creature_type;
	}
	public Alignment getAlignment() {
		return alignment;
	}
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}
	public CreatureSize getCreature_size() {
		return creature_size;
	}
	public void setCreature_size(CreatureSize creature_size) {
		this.creature_size = creature_size;
	}
	public Set<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}
	public Set<CreatureTrait> getTraits() {
		return traits;
	}
	public void setTraits(Set<CreatureTrait> traits) {
		this.traits = traits;
	}
	public Set<CreatureAction> getActions() {
		return actions;
	}
	public void setActions(Set<CreatureAction> actions) {
		this.actions = actions;
	}
	public Set<CreatureReaction> getReactions() {
		return reactions;
	}
	public void setReactions(Set<CreatureReaction> reactions) {
		this.reactions = reactions;
	}
	public Set<CreatureLegendary> getLegendaryActions() {
		return legendaryActions;
	}
	public void setLegendaryActions(Set<CreatureLegendary> legendaryActions) {
		this.legendaryActions = legendaryActions;
	}
	public Set<Environment> getEnvironments() {
		return environments;
	}
	public void setEnvironments(Set<Environment> environments) {
		this.environments = environments;
	}
	public Set<DamageType> getDamageVulnerability() {
		return damageVulnerability;
	}
	public void setDamageVulnerability(Set<DamageType> damageVulnerability) {
		this.damageVulnerability = damageVulnerability;
	}
	public Set<DamageType> getDamageResistance() {
		return damageResistance;
	}
	public void setDamageResistance(Set<DamageType> damageResistance) {
		this.damageResistance = damageResistance;
	}
	public Set<DamageType> getDamageImmunity() {
		return damageImmunity;
	}
	public void setDamageImmunity(Set<DamageType> damageImmunity) {
		this.damageImmunity = damageImmunity;
	}
	public Set<Condition> getConditionImmunity() {
		return conditionImmunity;
	}
	public void setConditionImmunity(Set<Condition> conditionImmunity) {
		this.conditionImmunity = conditionImmunity;
	}
	public Set<CreatureSense> getSenses() {
		return senses;
	}
	public void setSenses(Set<CreatureSense> senses) {
		this.senses = senses;
	}
	public Set<CreatureSpeed> getSpeeds() {
		return speeds;
	}
	public void setSpeeds(Set<CreatureSpeed> speeds) {
		this.speeds = speeds;
	}
	public Set<SkillProf> getSkills() {
		return skills;
	}
	public void setSkills(Set<SkillProf> skills) {
		this.skills = skills;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
		result = prime * result + ((alignment == null) ? 0 : alignment.hashCode());
		result = prime * result + ((armor_class == null) ? 0 : armor_class.hashCode());
		result = prime * result + ((challenge_rating == null) ? 0 : challenge_rating.hashCode());
		result = prime * result + ((charisma == null) ? 0 : charisma.hashCode());
		result = prime * result + ((conditionImmunity == null) ? 0 : conditionImmunity.hashCode());
		result = prime * result + ((constitution == null) ? 0 : constitution.hashCode());
		result = prime * result + ((creature_size == null) ? 0 : creature_size.hashCode());
		result = prime * result + ((creature_type == null) ? 0 : creature_type.hashCode());
		result = prime * result + ((damageImmunity == null) ? 0 : damageImmunity.hashCode());
		result = prime * result + ((damageResistance == null) ? 0 : damageResistance.hashCode());
		result = prime * result + ((damageVulnerability == null) ? 0 : damageVulnerability.hashCode());
		result = prime * result + ((dexterity == null) ? 0 : dexterity.hashCode());
		result = prime * result + ((environments == null) ? 0 : environments.hashCode());
		result = prime * result + ((hit_dice == null) ? 0 : hit_dice.hashCode());
		result = prime * result + ((hit_points == null) ? 0 : hit_points.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((intelligence == null) ? 0 : intelligence.hashCode());
		result = prime * result + ((languages == null) ? 0 : languages.hashCode());
		result = prime * result + ((legendaryActions == null) ? 0 : legendaryActions.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((reactions == null) ? 0 : reactions.hashCode());
		result = prime * result + ((savingThrows == null) ? 0 : savingThrows.hashCode());
		result = prime * result + ((senses == null) ? 0 : senses.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((speeds == null) ? 0 : speeds.hashCode());
		result = prime * result + ((strength == null) ? 0 : strength.hashCode());
		result = prime * result + ((traits == null) ? 0 : traits.hashCode());
		result = prime * result + ((wisdom == null) ? 0 : wisdom.hashCode());
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
		Creature other = (Creature) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		if (alignment == null) {
			if (other.alignment != null)
				return false;
		} else if (!alignment.equals(other.alignment))
			return false;
		if (armor_class == null) {
			if (other.armor_class != null)
				return false;
		} else if (!armor_class.equals(other.armor_class))
			return false;
		if (challenge_rating == null) {
			if (other.challenge_rating != null)
				return false;
		} else if (!challenge_rating.equals(other.challenge_rating))
			return false;
		if (charisma == null) {
			if (other.charisma != null)
				return false;
		} else if (!charisma.equals(other.charisma))
			return false;
		if (conditionImmunity == null) {
			if (other.conditionImmunity != null)
				return false;
		} else if (!conditionImmunity.equals(other.conditionImmunity))
			return false;
		if (constitution == null) {
			if (other.constitution != null)
				return false;
		} else if (!constitution.equals(other.constitution))
			return false;
		if (creature_size == null) {
			if (other.creature_size != null)
				return false;
		} else if (!creature_size.equals(other.creature_size))
			return false;
		if (creature_type == null) {
			if (other.creature_type != null)
				return false;
		} else if (!creature_type.equals(other.creature_type))
			return false;
		if (damageImmunity == null) {
			if (other.damageImmunity != null)
				return false;
		} else if (!damageImmunity.equals(other.damageImmunity))
			return false;
		if (damageResistance == null) {
			if (other.damageResistance != null)
				return false;
		} else if (!damageResistance.equals(other.damageResistance))
			return false;
		if (damageVulnerability == null) {
			if (other.damageVulnerability != null)
				return false;
		} else if (!damageVulnerability.equals(other.damageVulnerability))
			return false;
		if (dexterity == null) {
			if (other.dexterity != null)
				return false;
		} else if (!dexterity.equals(other.dexterity))
			return false;
		if (environments == null) {
			if (other.environments != null)
				return false;
		} else if (!environments.equals(other.environments))
			return false;
		if (hit_dice == null) {
			if (other.hit_dice != null)
				return false;
		} else if (!hit_dice.equals(other.hit_dice))
			return false;
		if (hit_points == null) {
			if (other.hit_points != null)
				return false;
		} else if (!hit_points.equals(other.hit_points))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (intelligence == null) {
			if (other.intelligence != null)
				return false;
		} else if (!intelligence.equals(other.intelligence))
			return false;
		if (languages == null) {
			if (other.languages != null)
				return false;
		} else if (!languages.equals(other.languages))
			return false;
		if (legendaryActions == null) {
			if (other.legendaryActions != null)
				return false;
		} else if (!legendaryActions.equals(other.legendaryActions))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (reactions == null) {
			if (other.reactions != null)
				return false;
		} else if (!reactions.equals(other.reactions))
			return false;
		if (savingThrows == null) {
			if (other.savingThrows != null)
				return false;
		} else if (!savingThrows.equals(other.savingThrows))
			return false;
		if (senses == null) {
			if (other.senses != null)
				return false;
		} else if (!senses.equals(other.senses))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (speeds == null) {
			if (other.speeds != null)
				return false;
		} else if (!speeds.equals(other.speeds))
			return false;
		if (strength == null) {
			if (other.strength != null)
				return false;
		} else if (!strength.equals(other.strength))
			return false;
		if (traits == null) {
			if (other.traits != null)
				return false;
		} else if (!traits.equals(other.traits))
			return false;
		if (wisdom == null) {
			if (other.wisdom != null)
				return false;
		} else if (!wisdom.equals(other.wisdom))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Creature [id=" + id + ", name=" + name + ", strength=" + strength + ", dexterity=" + dexterity
				+ ", constitution=" + constitution + ", intelligence=" + intelligence + ", wisdom=" + wisdom
				+ ", charisma=" + charisma + ", armor_class=" + armor_class + ", hit_points=" + hit_points
				+ ", hit_dice=" + hit_dice + ", savingThrows=" + savingThrows + ", challenge_rating=" + challenge_rating
				+ ", creature_type=" + creature_type + ", alignment=" + alignment + ", creature_size=" + creature_size
				+ ", languages=" + languages + ", traits=" + traits + ", actions=" + actions + ", reactions="
				+ reactions + ", legendaryActions=" + legendaryActions + ", environments=" + environments
				+ ", damageVulnerability=" + damageVulnerability + ", damageResistance=" + damageResistance
				+ ", damageImmunity=" + damageImmunity + ", conditionImmunity=" + conditionImmunity + ", senses="
				+ senses + ", speeds=" + speeds + ", skills=" + skills + "]";
	}
	
}
