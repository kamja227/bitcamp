--create table Ex18 (
--	num number,
--	name varchar2(15),
--	primary key(num)
--);

drop table Ex18;
create table Ex18 (
	num number,
	name varchar2(15)
);
alter table Ex18 modify (name varchar2(15) not null);
--alter table Ex18 modify (num number primary key);
alter table Ex18 add primary key(num);