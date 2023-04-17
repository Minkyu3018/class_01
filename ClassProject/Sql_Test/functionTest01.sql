-- function Test1

select ename, substr(hiredate,1,5)
from emp
;

select ename, hiredate
from emp
where substr(hiredate,5,1)='4'
;

select ename, empno
from emp
where mod(empno,2)=0
;

select ename, to_char(hiredate, 'YY.MM.DY')
from emp
;

select to_date(sysdate) - to_date('2023.01.01')
from dual
;

select ename, nvl(mgr,0)
from emp
;

select ename, sal,
nvl(decode (job,
        'ANALYST', sal+200,
        'SALESMAN', sal+180,
        'MANAGER', sal+150,
        'CLERK', sal+100),sal) as upSAL
from emp
;

select max(sal), min(sal), sum(sal), round(avg(sal))
from emp
;

select job, max(sal), min(sal), sum(sal), round(avg(sal))
from emp
group by job
;

select job, count(*)
from emp
group by job
;

select count(mgr)
from emp
;

select max(sal) - min(sal)
from emp
;

select job, min(sal)
from emp
where sal > 2000 and mgr is not null
group by job
;

select deptno,
decode(deptno,
        10, 'ACCOUNTING',
        20, 'RESEARCH',
        30, 'SALES',
        40, 'OPERATIONS'),
decode(deptno,
        10, 'NEWYORK',
        20, 'DALLAS',
        30, 'CHICAGO',
        40, 'BOSTON'), count(*), round(avg(sal))
from emp
group by deptno
order by deptno
;

------------------------------------------------------------
select custid, sum(saleprice)
from orders
where custid = 1
group by custid
;

select custid, count(*)
from orders
where custid =1
group by custid
;

select count(*)
from book
;

select count(distinct publisher)
from book
;
