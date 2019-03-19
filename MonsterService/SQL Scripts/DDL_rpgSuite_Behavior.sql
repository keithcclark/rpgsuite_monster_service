--************************************************************************
--monsters traits i.e Innate Spellcasting
--************************************************************************

create table traits(
    id number(20) primary key,
    name varchar2(75),
    description varchar2(2000)
);
--************************************************************************
-- Traits that a creature has
--************************************************************************
create table creature_traits(
    monsters_id number(20),
    trait_id number(20),
    constraint pk_creature_traits primary key (monsters_id,trait_id),
    constraint fk_traits_creature foreign key (monsters_id) references monsters(id),
    constraint fk_traits_trait foreign key (trait_id) references traits(id)
);
--************************************************************************
-- Actions i.e attacks
--************************************************************************
create table actions(
    id number(20) primary key,
    name varchar2(75),
    description varchar2(2000),
    damage_bonus number(3),
    damage_dice varchar2(20),
    attack_bonus number(3)
);
--************************************************************************
-- which actions belong to which creature
--************************************************************************
create table creature_actions(
    monsters_id number(20),
    action_id number(20),
    constraint pk_creature_action primary key (monsters_id,action_id),
    constraint fk_creature_action_creature foreign key (monsters_id) references monsters(id),
    constraint fk_creature_action_action foreign key (action_id) references actions(id)
);
--************************************************************************
-- Reactions a creature can take
--************************************************************************
create table reactions(
    id number(20) primary key,
    name varchar2(75),
    description varchar2(2000)
);
--************************************************************************
-- which reactions belong to which creature
--************************************************************************
create table creature_reactions(
    monsters_id number(20),
    reaction_id number(20),
    constraint pk_creature_reaction primary key (monsters_id,reaction_id),
    constraint fk_creature_reaction_creature foreign key (monsters_id) references monsters(id),
    constraint fk_creature_reaction_action foreign key (reaction_id) references reactions(id)
);
--************************************************************************
--Legendary Actions a creature can take
--************************************************************************
create table legendary_actions(
    id number(30) primary key,
    name varchar2(75),
    description varchar2(2000),
    cost number(2)
);
--************************************************************************
--Bridge table creature and legendary actions
--************************************************************************
create table creature_legendary(
    monsters_id number(20),
    legendary_id number(20),
    constraint pk_legendary_action primary key (monsters_id,legendary_id),
    constraint fk_legendary_monsters foreign key (monsters_id) references monsters(id),
    constraint fk_legendary_action foreign key (legendary_id) references legendary_actions(id)
);

create sequence  traitid_seq start with 1;
create sequence actionid_seq start with 1;
create sequence reactionid_seq start with 1;
create sequence legendaryid_seq start with 1;