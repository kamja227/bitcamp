-- �й�(number), �̸�(15), ����(3), ����, ����
create table student (
	num number,
	name varchar2(15),
	kor number(3),
	eng number(3),
	math number(3)
);
delete from student;
--dummy data
insert into student values(1, '�׽���1', 90, 80, 70);
insert into student values(2, '�׽���2', 92, 84, 93);
insert into student values(3, '�׽���3', 70, 81, 83);
insert into student values(4, '�׽���4', 87, 60, 88);
insert into student values(5, '�׽���5', 85, 73, 78);
exit;