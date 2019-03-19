--************************************************************************
-- environmentss creature can be found
--************************************************************************
create table environments(
    id number(20) primary key,
    name varchar2(10)
);
--************************************************************************
-- which environmentss belong to which creature
--************************************************************************
create table creature_environments(
    monsters_id number(20),
    environment_id number(20),
    constraint pk_creature_environments primary key (monsters_id,environment_id),
    constraint fk_environments_creature foreign key (monsters_id) references monsters(id),
    constraint fk_environments_environnment foreign key (environment_id) references environments(id)
);
create sequence envronmentid_seq start with 12;
--**********************************************************
--Base environmentss in 5e
--**********************************************************
insert into environments (id, name) values(1,'Arctic');
insert into environments (id, name) values(2,'Coastal');
insert into environments (id, name) values(3,'Desert');
insert into environments (id, name) values(4,'Forest');
insert into environments (id, name) values(5,'Grasslands');
insert into environments (id, name) values(6,'Hill');
insert into environments (id, name) values(7,'Mountain');
insert into environments (id, name) values(8,'Swamp');
insert into environments (id, name) values(9,'Underdark');
insert into environments (id, name) values(10,'Underwater');
insert into environments (id, name) values(11,'Urban');
