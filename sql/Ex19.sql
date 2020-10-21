-- 제약조건명 지정
-- 지정방식 : 테이블명_컬럼명_조건
-- 조건 :
--	primart key - pk
-- 	unique - up
-- 	not null - nn
-- 	foreign key - fk
--	
--create table Ex19(
--	num number,
--	constraint Ex19_num_pk primary key,
--	name varchar2(15)
--	
--);
create table Ex19(
	num number,
	name varchar2(15),
	constraint Ex19_num_pk primary key(num)
);