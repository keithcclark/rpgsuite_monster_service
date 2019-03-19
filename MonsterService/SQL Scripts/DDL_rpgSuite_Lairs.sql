--************************************************************************
-- lairs
--************************************************************************
create table lairs(
    id number(20) primary key,
    monster_id number(20),
    name varchar2(20),
    lair_description VARCHAR2(1000),
    effect_description VARCHAR2(1000),
    CONSTRAINT fk_monsterid FOREIGN KEY (monster_id)
        REFERENCES monsters(id)
);
--************************************************************************
-- lairs actions
--************************************************************************
create table lair_actions(
    id number(20) primary key,
    description VARCHAR2(1000)
);
--************************************************************************
-- regional effects
--************************************************************************
create table regional_effects(
    id number(20) primary key,
    description VARCHAR2(1000)
);
--************************************************************************
-- actions a lair can take
--************************************************************************
create table lair_attached_actions(
    lair_id number(20),
    action_id number(20),
    constraint pk_lair_action primary key (lair_id,action_id),
    constraint fk_lairs_lair foreign key (lair_id) references lairs(id),
    constraint fk_lairs_action foreign key (action_id) references lair_actions(id)
);
--************************************************************************
-- regional effects that a lair has
--************************************************************************
create table lair_attached_effects(
    lair_id number(20),
    effect_id number(20),
    constraint pk_lair_effect primary key (lair_id,effect_id),
    constraint fk_effects_lair foreign key (lair_id) references lairs(id),
    constraint fk_effects_effect foreign key (effect_id) references regional_effects(id)
);

create sequence lair_seq start with 1;
create sequence lair_action_seq start with 1;
create sequence lair_effect_seq start with 1;