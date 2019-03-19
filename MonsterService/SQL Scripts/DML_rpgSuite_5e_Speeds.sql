--************************************************************************
-- Speed
--************************************************************************
create table speeds(
    id number(20) primary key,
    speed varchar2(10),
    description VARCHAR2(1000)
);
--************************************************************************
-- Creatures with a movement speed and distance
--************************************************************************
create table creature_speed(
    id number (20) primary key,
    monsters_id number(20),
    speed_id number(20),
    distance number(3),
    constraint fk_speeds_monsters foreign key (monsters_id) references monsters(id),
    constraint fk_speeds_speed foreign key (speed_id) references speeds(id)
);
create sequence speedid_seq start with 6;
create sequence creature_speed_seq start with 1;
--**********************************************************
--Base movement speeds in 5e
--**********************************************************
insert into SPEEDS (ID,SPEED,DESCRIPTION) values (1,'Speed','All creatures have a walking speed, simply called the monster’s speed.');
insert into SPEEDS (ID,SPEED,DESCRIPTION) values (2,'Burrow
','A monster that has a burrowing speed can use that speed to move through sand,
earth, mud, or ice. A monster can''t burrow through solid rock unless it has a special trait that allows it to do so.');
insert into SPEEDS (ID,SPEED,DESCRIPTION) values (3,'Climb','A monster that has a climbing speed can use all or part of 
its movement to move on vertical surfaces. The monster doesn''t need to spend extra movement to climb.');
insert into SPEEDS (ID,SPEED,DESCRIPTION) values (4,'Fly','A monster that has a flying speed can use all or part of its 
movement to fly. Some monsters have the ability to hover, which makes them hard to knock out of the air. Such a monster stops hovering when it dies.');
insert into SPEEDS (ID,SPEED,DESCRIPTION) values (5,'Swim','A monster that has a swimming speed doesn''t need to spend extra movement to swim.');

commit;