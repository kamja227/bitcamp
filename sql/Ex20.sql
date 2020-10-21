--create table Ex20(
--	sabun number primary key,
--	name varchar2(15) not null,
--	num number,
--	constraint Ex20_num_fk foreign key(num) references Ex21(num)
--);
create table Ex21(
	num number primary key,
	job varchar2(15) not null
);
create table Ex20(
	sabun number primary key,
	name varchar2(15),
	num number
);
alter table Ex20 add constraint Ex20_num_fk foreign key(num) references Ex21(num);

