--************************************************************************
--Languages 
--************************************************************************
create table Languages(
    id number(20) primary key,
    name varchar2(20)
);
--************************************************************************
-- Languages that a creature speaks
--************************************************************************
create table creature_languages(
    monsters_id number(20),
    language_id number(20),
    constraint pk_creature_languages primary key (monsters_id,language_id),
    constraint fk_language_creature foreign key (monsters_id) references monsters(id),
    constraint fk_language_language foreign key (language_id) references Languages(id)
);

create sequence languageid_seq start with 24;
--**********************************************************
--Base languages in 5e
--**********************************************************
insert into LANGUAGES (id, name) values (1,'Common');
insert into LANGUAGES (id, name) values (2,'Dwarvish');
insert into LANGUAGES (id, name) values (3,'Elvish');
insert into LANGUAGES (id, name) values (4,'Giant');
insert into LANGUAGES (id, name) values (5,'Gnomish');
insert into LANGUAGES (id, name) values (6,'Goblin');
insert into LANGUAGES (id, name) values (7,'Halfling');
insert into LANGUAGES (id, name) values (8,'Orc');
insert into LANGUAGES (id, name) values (9,'Abyssal');
insert into LANGUAGES (id, name) values (10,'Celestial');
insert into LANGUAGES (id, name) values (11,'Draconic');
insert into LANGUAGES (id, name) values (12,'Deep Speech');
insert into LANGUAGES (id, name) values (13,'Infernal');
insert into LANGUAGES (id, name) values (14,'Auran');
insert into LANGUAGES (id, name) values (15,'Ignan');
insert into LANGUAGES (id, name) values (16,'Terran');
insert into LANGUAGES (id, name) values (17,'Sylvan');
insert into LANGUAGES (id, name) values (18,'Aarakocra');
insert into LANGUAGES (id, name) values (19,'Druidic');
insert into LANGUAGES (id, name) values (20,'Gith');
insert into LANGUAGES (id, name) values (21,'Theieves Can''t');
insert into LANGUAGES (id, name) values (22,'Telepathy');
insert into LANGUAGES (id, name) values (23,'Aquan');
