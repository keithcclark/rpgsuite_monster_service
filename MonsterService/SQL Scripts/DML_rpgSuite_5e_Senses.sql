--************************************************************************
--Senses
--************************************************************************
create table senses(
 id number(20) primary key,
 sense varchar2(20),
 description VARCHAR2(1000)
);
--************************************************************************
--Creatures with senses and distances
--************************************************************************
create table creature_senses(
    id number(20) primary key,
    monsters_id number(20),
    sense_id number(20),
    distance number(5),
    constraint fk_senses_monsters foreign key (monsters_id) references monsters(id),
    constraint fk_senses_sense foreign key (sense_id) references senses(id)
);
create sequence senseid_seq start with 6;
create sequence creature_senses_seq start with 1;
--**********************************************************
--Base movement speeds in 5e
--**********************************************************
insert into SENSES (ID,SENSE,DESCRIPTION) values (1, 'Passive Perception','');
insert into SENSES (ID,SENSE,DESCRIPTION) values (2, 'Blindsight','
A monster with blindsight can perceive its surroundings without relying on sight, within a specific radius.');
insert into SENSES (ID,SENSE,DESCRIPTION) values (3, 'Darkvision','A monster with darkvision can see in the dark within a specific radius. 
The monster can see in dim light within the radius as if it were bright light, and in darkness as if it were dim light. The monster 
can''t discern color in darkness, only shades of gray.');
insert into SENSES (ID,SENSE,DESCRIPTION) values (4, 'Tremorsense','A monster with tremorsense can detect and pinpoint the origin of vibrations within a specific radius, 
provided that the monster and the source of the vibrations are in contact with the same ground or substance. 
Tremorsense can''t be used to detect flying or incorporeal creatures. Many burrowing creatures, such as ankhegs, have this special sense.');
insert into SENSES (ID,SENSE,DESCRIPTION) values (5, 'Truesight','A monster with truesight can, out to a specific range, see in normal and magical darkness, 
see invisible creatures and objects, automatically detect visual illusions and succeed on saving throws against them, and perceive the original form of a shapechanger or a creature 
that is transformed by magic. Furthermore, the monster can see into the Ethereal Plane within the same range.');

commit;