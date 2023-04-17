-- join Test01

select e.ename, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno and ename ='SCOTT'
;

-- 33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 
-- 지역 명을 출력하시오.

select e.ename, d.dname, d.loc
from emp e inner join dept d
on e.deptno = d.deptno
;

-- 36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
and ename like '%A%'
;

-- 37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 
-- 이름, 업무, 부서번호 및 부서명을 출력하시오.

select e.ename, e.job, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno
and d.loc = 'NEW YORK'
;

-- 38. SELF JOIN을 사용하여 사원의 이름 및 사원번호, 관리자 이름을 출력하시오.
select m.ename, m.empno, e.ename
from emp e, emp m
where m.mgr = e.empno
;

-- 39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 
-- 사원번호를 기준으로 내림차순 정렬하여 출력하시오.
select e.ename, e.empno, m.empno
from emp e left outer join emp m
on e.mgr = m.empno
order by e.empno desc
;
