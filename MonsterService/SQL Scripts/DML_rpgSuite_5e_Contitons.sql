--************************************************************************
-- Conditions that my be applied to a creature
--************************************************************************
create table conditions(
 id number(20) primary key,
 name varchar2(15),
 description VARCHAR2(1000) 
);
--************************************************************************
-- Creatures that immunities to certain conditions
--************************************************************************
create table condition_immunity(
    monsters_id number(20),
    condition_id number(20),
    constraint pk_condition_immunity primary key (monsters_id,condition_id),
    constraint fk_cond_immunity_monsters foreign key (monsters_id) references monsters(id),
    constraint fk_cond_immunity_condition foreign key (condition_id) references conditions(id)
);
create sequence conditionid_seq start with 16;
--***********************************************************
--Standard conditions for 5e
--***********************************************************
insert into conditions (ID, NAME, DESCRIPTION) values (1,'Blinded','A blinded creature can''t see and automatically fails any ability check that requires sight.
Attack rolls against the creature have advantage, and the creature''s attack rolls have disadvantage.');
insert into conditions (ID, NAME, DESCRIPTION) values (2,'Charmed','A charmed creature can''t attack the charmer or target the charmer with harmful abilities or magical effects.
The charmer has advantage on any ability check to interact socially with the creature.');
insert into conditions (ID, NAME, DESCRIPTION) values (3,'Deafened', 'A deafened creature can''t hear and automatically fails any ability check that requires hearing.');
insert into conditions (ID, NAME, DESCRIPTION) values (4,'Exhaustion', 'Pending');
insert into conditions (ID, NAME, DESCRIPTION) values (5,'Frightened', 'A frightened creature has disadvantage on ability checks and attack rolls while the source of its fear is within line of sight.
The creature can''t willingly move closer to the source of its fear.');
insert into conditions (ID, NAME, DESCRIPTION) values (6,'Grappled', 'A grappled creature''s speed becomes 0, and it can''t benefit from any bonus to its speed.
The condition ends if the grappler is incapacitated. The condition also ends if an effect removes the grappled creature from the reach of the grappler or grappling effect, such as when a creature is hurled away by the thunderwave spell.');
insert into conditions (ID, NAME, DESCRIPTION) values (7,'Incapacitated', 'An incapacitated creature can''t take actions or reactions.');
insert into conditions (ID, NAME, DESCRIPTION) values (8,'Invisible', 'An invisible creature is impossible to see without the aid of magic or a special sense. For the purpose of hiding, the creature is heavily obscured. The creature''s location can be detected by any noise it makes or any tracks it leaves.
Attack rolls against the creature have disadvantage, and the creature''s attack rolls have advantage.');
insert into conditions (ID, NAME, DESCRIPTION) values (9,'Paralyzed','A paralyzed creature is incapacitated and can''t move or speak. 
The creature automatically fails Strength and Dexterity saving throws. Attack rolls against the creature have advantage. Any attack that 
hits the creature is a critical hit if the attacker is within 5 feet of the creature.');
insert into conditions (ID, NAME, DESCRIPTION) values (10,'Petrified', 'A petrified creature is transformed, along with any nonmagical object it is wearing or carrying, into a solid inanimate substance (usually stone). Its weight increases by a factor of ten, and it ceases aging.
The creature is incapacitated, can''t move or speak, and is unaware of its surroundings. Attack rolls against the creature have advantage.
The creature automatically fails Strength and Dexterity saving throws. The creature has resistance to all damage.
The creature is immune to poison and disease, although a poison or disease already in its system is suspended, not neutralized.');
insert into conditions (ID, NAME, DESCRIPTION) values (11,'Poisoned', 'A poisoned creature has disadvantage on attack rolls and ability checks.');
insert into conditions (ID, NAME, DESCRIPTION) values (12,'Prone', 'A prone creature''s only movement option is to crawl, unless it stands up and thereby ends the condition.
The creature has disadvantage on attack rolls. An attack roll against the creature has advantage if the attacker is within 5 feet of the creature. Otherwise, the attack roll has disadvantage.');
insert into conditions (ID, NAME, DESCRIPTION) values (13,'Restrained', 'A restrained creature''s speed becomes 0, and it can''t benefit from any bonus to its speed.
Attack rolls against the creature have advantage, and the creature''s attack rolls have disadvantage.
The creature has disadvantage on Dexterity saving throws.');
insert into conditions (ID, NAME, DESCRIPTION) values (14,'Stunned', 'A stunned creature is incapacitated, can''t move, and can speak only falteringly.
The creature automatically fails Strength and Dexterity saving throws.
Attack rolls against the creature have advantage.');
insert into conditions (ID, NAME, DESCRIPTION) values (15,'Unconscious', 'An unconscious creature is incapacitated, can''t move or speak, and is unaware of its surroundings
The creature drops whatever it''s holding and falls prone.
The creature automatically fails Strength and Dexterity saving throws.
Attack rolls against the creature have advantage.
Any attack that hits the creature is a critical hit if the attacker is within 5 feet of the creature.');

commit;
