-- not null : null 허용 안함
-- unique : 중복 허용 안함. 단, null은 허용

--  create table Ex17 (
-- 	num number unique not null,
--	name varchar2(15) not null
-- );
--
drop table Ex17;
--
-- primary key:unique and not null
-- 단, oracle의 경우 : 한 테이블 당 하나만 부여 가능
--
create table Ex17 (
	num number primary key,
	name varchar2(15) not null
);