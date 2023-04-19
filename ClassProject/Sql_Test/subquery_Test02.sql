-- subquery test02


-- (43)
select job from emp where empno=7788;

select ename, job
from emp
where job = (select job from emp where empno=7788);

-- (44)
select sal from emp where empno = 7499;

select ename, job
from emp
where sal > (select sal from emp where empno = 7499);

-- (45)
select min(sal) from emp;

select ename, job, sal
from emp
where sal in(select min(sal) from emp);

-- (46)
select min(avg(sal)) from emp group by job;

select job, avg(sal)
from emp
having avg(sal) = (select min(avg(sal)) from emp group by job)
group by job
;

select deptno, min(sal) from emp group by deptno;

select ename, sal, deptno
from emp
where deptno in (select deptno, min(sal) from emp group by deptno)
;


select deptno, min(sal) from emp group by deptno ;

select e.ename, e.sal, e.deptno
from emp e, (select deptno, min(sal) as minsal
            from emp
            group by deptno) m
where e.deptno = m.deptno and e.sal = m.minsal
;