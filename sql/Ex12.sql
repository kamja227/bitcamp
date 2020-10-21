select ename,
case when deptno = 10 then '영업',
	when deptno = 20 then '총무',
	when deptno = 30 then '회계',
	when deptno = 40 then '인사',
end from emp
/
