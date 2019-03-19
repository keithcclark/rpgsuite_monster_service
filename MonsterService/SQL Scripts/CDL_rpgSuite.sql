-- We want a fresh start. Drop the user.
drop user admin cascade;
--create a user in the database
create user admin
-- with a password
identified by St4rF31ld
-- on a tablespace
default tablespace users
-- add a temporary space
temporary tablespace temp
-- with this size
quota 10m on users;

-- We need to be able to connect to another user
grant connect to admin;
-- the ability to create types
grant resource to admin;
-- the ability to alter and destroy types
--the ability to create a session for transactions
grant create session to admin;
grant create table to admin;
grant create view to admin;