select ename,
case when deptno = 10 then '����',
	when deptno = 20 then '�ѹ�',
	when deptno = 30 then 'ȸ��',
	when deptno = 40 then '�λ�',
end from emp
/
