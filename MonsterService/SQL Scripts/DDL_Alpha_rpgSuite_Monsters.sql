select 'drop table ' || table_name || ' cascade CONSTRAINTS;' from user_tables;
--************************************************************************
--drop tables to reset the data base
--************************************************************************
drop table MONSTERS cascade CONSTRAINTS;
drop table CHALLENGE_RATINGS cascade CONSTRAINTS;
drop table CREATURE_TYPES cascade CONSTRAINTS;
drop table CREATURE_SUBTYPES cascade CONSTRAINTS;
drop table TYPE_SUBTYPE cascade CONSTRAINTS;
drop table SUBTYPE_CREATURE cascade CONSTRAINTS;
drop table ALIGNMENTS cascade CONSTRAINTS;
drop table CREATURE_SIZES cascade CONSTRAINTS;
drop table SAVING_THROWS cascade CONSTRAINTS;
drop table TRAITS cascade CONSTRAINTS;
drop table CREATURE_TRAITS cascade CONSTRAINTS;
drop table ACTIONS cascade CONSTRAINTS;
drop table CREATURE_ACTIONS cascade CONSTRAINTS;
drop table REACTIONS cascade CONSTRAINTS;
drop table CREATURE_REACTIONS cascade CONSTRAINTS;
drop table LEGENDARY_ACTIONS cascade CONSTRAINTS;
drop table CREATURE_LEGENDARY cascade CONSTRAINTS;
drop table LAIRS cascade CONSTRAINTS;
drop table LAIR_ACTIONS cascade CONSTRAINTS;
drop table REGIONAL_EFFECTS cascade CONSTRAINTS;
drop table LAIR_ATTACHED_ACTIONS cascade CONSTRAINTS;
drop table LAIR_ATTACHED_EFFECTS cascade CONSTRAINTS;
drop table CONDITIONS cascade CONSTRAINTS;
drop table CONDITION_IMMUNITY cascade CONSTRAINTS;
drop table DAMAGE_TYPES cascade CONSTRAINTS;
drop table DAMAGE_VULNERABILITY cascade CONSTRAINTS;
drop table DAMAGE_RESISTANCE cascade CONSTRAINTS;
drop table DAMAGE_IMMUNITY cascade CONSTRAINTS;
drop table ENVIRONMENTS cascade CONSTRAINTS;
drop table CREATURE_ENVIRONMENTS cascade CONSTRAINTS;
drop table LANGUAGES cascade CONSTRAINTS;
drop table CREATURE_LANGUAGES cascade CONSTRAINTS;
drop table SENSES cascade CONSTRAINTS;
drop table CREATURE_SENSES cascade CONSTRAINTS;
drop table SKILLS cascade CONSTRAINTS;
drop table SKILL_PROFICIENCIES cascade CONSTRAINTS;
drop table SPEEDS cascade CONSTRAINTS;
drop table CREATURE_SPEED cascade CONSTRAINTS;
select 'drop sequence ' || sequence_name || ';' from user_sequences;
--************************************************************************
--clear all the sequences
--************************************************************************
drop sequence ACTIONID_SEQ;
drop sequence ALIGNMENTID_SEQ;
drop sequence CHALLENGEID_SEQ;
drop sequence CONDITIONID_SEQ;
drop sequence CREATURE_SENSES_SEQ;
drop sequence CREATURE_SPEED_SEQ;
drop sequence DAMAGE_TYPEID_SEQ;
drop sequence ENVRONMENTID_SEQ;
drop sequence LAIR_ACTION_SEQ;
drop sequence LAIR_EFFECT_SEQ;
drop sequence LAIR_SEQ;
drop sequence LANGUAGEID_SEQ;
drop sequence LEGENDARYID_SEQ;
drop sequence MONSTERID_SEQ;
drop sequence REACTIONID_SEQ;
drop sequence SAVEID_SEQ;
drop sequence SENSEID_SEQ;
drop sequence SIZEID_SEQ;
drop sequence SKILLID_SEQ;
drop sequence SKILL_PROF_SEQ;
drop sequence SPEEDID_SEQ;
drop sequence SUBTYPEID_SEQ;
drop sequence TRAITID_SEQ;
drop sequence TYPEID_SEQ;
--************************************************************************
--primary attributes of a monsters
--************************************************************************
create table monsters (
    
    id number(20) primary key,
    name varchar2(30) unique not null,
    strength number(5),
    dexterity number(5),
    constitution number(5),
    intelligence number(5),
    wisdom number(5),
    charisma number(5),
    armor_class number(10),
    hit_points number (10),
    hit_dice varchar2(20),
    --secondary
    armor_class_type number(20),
    challenge_rating varchar2(20),
    creature_type number(20),
    alignment number(20),
    creature_size number(20),
    image blob
);
--************************************************************************
-- Challenge Rating and XP value
--************************************************************************
create table challenge_ratings(
    --id number(20) PRIMARY KEY,
    cr varchar2(10) PRIMARY KEY,
    xp number(10)
);
--************************************************************************
-- Creatures types
--************************************************************************
create table creature_types(
    id number(20) primary key,
    type varchar2(20),
    description VARCHAR2(1000)
);
--************************************************************************
-- Creatures sub types
--************************************************************************
create table creature_subtypes(
    id number(20) primary key,
    type varchar2(20),
    description VARCHAR2(1000)
);
--************************************************************************
-- What sub types belong to what types
--************************************************************************
create table type_subtype(
    type_id number(20),
    sub_id number(20),
    constraint pk_type_subtype primary key (type_id,sub_id),
    constraint fk_types_type foreign key (type_id) references creature_types(id),
    constraint fk_types_sub foreign key (sub_id) references creature_subtypes(id)
);

--************************************************************************
-- What sub types belong to what monster
--************************************************************************
create table subtype_creature(
    creature_id number(20),
    sub_id number(20),
    constraint pk_subtype_creature primary key (creature_id,sub_id),
    constraint fk_sub_creature foreign key (creature_id) references monsters(id),
    constraint fk_sub_sub foreign key (sub_id) references creature_subtypes(id)
);
--************************************************************************
-- Alignments
--************************************************************************
create table alignments(
    id number(20) primary key,
    alignment varchar2(20),
    description VARCHAR2(1000)
);
--************************************************************************
-- creature sizes
--************************************************************************

create table creature_sizes(
    id number(20) primary key,
    creature_size varchar2(20),
    description VARCHAR2(1000)
);
--************************************************************************
-- saving throws
--************************************************************************
create table saving_throws(
    id number(20) primary key,
    monster_id number(20),
    stat varchar2(20),
    modifier number(3),
    constraint fk_save_monster FOREIGN KEY (monster_id) 
        REFERENCES monsters(id)
);

alter table monsters
add foreign key (challenge_rating)
references challenge_ratings(cr);

alter table monsters
add foreign key (creature_type)
REFERENCES creature_types(id);

alter table monsters
add foreign key (alignment)
REFERENCES alignments(id); 

alter table monsters
add foreign key (creature_size)
REFERENCES creature_sizes(id);

create sequence monsterid_seq start with 1;
create sequence challengeid_seq start with 35;
create sequence typeid_seq start with  14;
create sequence subtypeid_seq start with 1;
create sequence alignmentid_seq start with 10;
create sequence sizeid_seq start with 7;
create sequence saveid_seq start with 1;

@DDL_rpgSuite_Behavior.sql;
@DDL_rpgSuite_Lairs.sql;
@DML_rpgSuite_5e_Alignment.sql;
@DML_rpgSuite_5e_Contitons.sql;
@DML_rpgSuite_5e_CR_Natural.sql;
@DML_rpgSuite_5e_Damage_Types.sql;
@DML_rpgSuite_5e_Environments.sql;
@DML_rpgSuite_5e_Languages.sql
@DML_rpgSuite_5e_MonsterTypes.sql;
@DML_rpgSuite_5e_Senses.sql;
@DML_rpgSuite_5e_Size.sql;
@DML_rpgSuite_5e_Skills.sql;
@DML_rpgSuite_5e_Speeds.sql;