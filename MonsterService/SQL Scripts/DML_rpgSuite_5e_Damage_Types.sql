--************************************************************************
-- Differnt damage types
--************************************************************************
create table Damage_types(
    id number(20) primary key,
    name varchar2(20),
    description varchar2(1000)
);
--************************************************************************
-- Creatures with vulnerabilities to certain damage types
--************************************************************************
create table Damage_vulnerability(
    monsters_id number(20),
    damage_type_id number(20),
    constraint pk_dmg_vulnerability primary key (monsters_id,damage_type_id),
    constraint fk_dmg_vulnerability_monsters foreign key (monsters_id) references monsters(id),
    constraint fk_dmg_vulnerability_type foreign key (damage_type_id) references damage_types(id)
);
--************************************************************************
-- Creatures with resistance to certain damage types
--************************************************************************
create table Damage_Resistance(
    monsters_id number(20),
    damage_type_id number(20),
    constraint pk_dmg_resistance primary key (monsters_id,damage_type_id),
    constraint fk_dmg_resistance_monsters foreign key (monsters_id) references monsters(id),
    constraint fk_dmg_resistance_type foreign key (damage_type_id) references damage_types(id)
);
--************************************************************************
--Creatures with imminities to certain damage types
--************************************************************************
create table Damage_immunity(
    monsters_id number(20),
    damage_type_id number(20),
    constraint pk_dmg_immunity primary key (monsters_id,damage_type_id),
    constraint fk_dmg_immunity_monsters foreign key (monsters_id) references monsters(id),
    constraint fk_dmg_immunity_type foreign key (damage_type_id) references damage_types(id)
);
create sequence damage_typeid_seq start with 14;
--**********************************************************
--Base damage types in 5e
--**********************************************************
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (1,'Acid','The corrosive spray of an adult black dragon''s breath and the dissolving enzymes secreted by a black pudding deal acid damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (2,'Bludgeoning','Blunt force attacks — hammers, falling, constriction, and the like — deal bludgeoning damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (3,'Cold','The infernal chill radiating from an ice devil''s spear and the frigid blast of a young white dragon''s breath deal cold damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (4,'Fire','Ancient red dragons breathe fire, and many spells conjure flames to deal fire damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (5,'Force','Force is pure magical energy focused into a damaging form. Most effects that deal force damage are spells, including magic missile and spiritual weapon.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (6,'Lightning','A lightning bolt spell and a blue dragon wyrmling''s breath deal lightning damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (7,'Necrotic',' Necrotic damage, dealt by certain undead and a spell such as chill touch, withers matter and even the soul.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (8,'Piercing','Puncturing and impaling attacks, including spears and monsters'' bites, deal piercing damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (9,'Poison','Venomous stings and the toxic gas of an adult green dragon''s breath deal poison damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (10,'Psychic','Mental abilities such as a psionic blast deal psychic damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (11,'Radiant','Radiant damage, dealt by a cleric''s flame strike spell or an angel''s smiting weapon, sears the flesh like fire and overloads the spirit with power.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (12,'Slashing','Swords, axes, and monsters'' claws deal slashing damage.');
insert into DAMAGE_TYPES (ID,NAME,DESCRIPTION) values (13,'Thunder','A concussive burst of sound, such as the effect of the thunderwave spell, deals thunder damage.');

commit;