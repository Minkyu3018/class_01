-- subquery_exam1

-- 43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.
select e.ename, e.empno ,(select job from emp m where e.job = m.job) "m.job"
from emp e
where empno = '7788';


select ename, empno, job
from emp
where empno='7788';
