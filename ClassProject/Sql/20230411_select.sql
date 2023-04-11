
-- 2023.04.11
-- select

-- 로그인 한 사용자가 소유하고 있는 테이블의 정보
SELECT * from tab;

-- 테이블 정보 확인
DESCRIBE emp;
DESCRIBE dept;

-- 데이터 추출하는 질의어
-- select 컬럼이름, 컬럼이름, 컬럼이름 /// from 테이블이름 (view 사용가능)
-- select * from 컬럼이름

SELECT * from dept;
SELECT * from DEPT;

-- 특정 컬럼의 데이터만 검색
SELECT  dname --, deptno, loc
from dept;



-- select 구문의 프레젠테이션 영역에 테이블이 가지는 컬럼 뿐 아니라 연산(함수)의 결과를
-- 새로운 컬럼으로 출력

select sal, sal+100, sal-100, sal*100, sal/2 from emp;
select sal + 100 from emp;
select sal - 100 from emp;
select sal * 100 from emp;
select sal / 2 from emp;

-- 사원테이블에서 사원의 이름과 급여, 연봉 계산 결과를 출력해보자. 연봉의 계산은 월급여*12

SELECT ename, sal, sal*12, sal*12+(sal*12*0.5)
from emp;


-- 상여금 계산 => sal*12+comm

SELECT ename, sal, comm, sal*12+comm from emp;

SELECT ename, sal, nvl(comm,0), sal*12+nvl(comm,0)
from emp;


-- 컬럼의 이름에 별칭 부여
-- 컬럼 뒤에 as 키워드를 쓰고 별칭을 작성
SELECT ename, sal, nvl(comm,0) as comm1, sal*12+nvl(comm,0) as yearSel
from emp;

-- 문자열의 연산 : 문자열을 붙혀준다 => 문자열 || 문자열
SELECT ename || ' is a ' || job
FROM emp;

-- select [distinct] from ...
-- => 중복 값을 제거하고 값을 하나만 출력
select deptno from emp;
select distinct deptno from emp;
select distinct job from emp;


-- 원하는 행 검색
-- WHERE 절을 사용한다
-- SELECT ... FROM ... WHERE 조건식;
-- SELECT * FROM emp WHERE sal >= 3000;
-- 급여가 3000 이상인 사원의 정보 리스트
SELECT * FROM emp WHERE sal >= 3000;

-- 컬럼의 데이터를 같다 비교
-- 10번 부서에 소속된 사원들의 정보를 출력
SELECT * FROM emp WHERE deptno = 10;

-- 범위값을 검색 ( 조건식 + BETWEEN a AND B;)
SELECT * FROM emp WHERE sal BETWEEN 1000 AND 2000;

-- 조건을 검색 IN(a,b,c);
SELECT * FROM emp WHERE sal in(1000,2000,3000);

-- 이름이 FORD인 사원의 사원번호(EMPNO)과 사원이름(ENAME)과 급여(SAL)을 출력
-- 문자열 비교 => 작은 따옴표 사용
SELECT * FROM emp
WHERE ENAME = 'FORD'
;

-- 날짜를 비교할때도 작은 따옴표를 사용해준다.
SELECT *
FROM emp
WHERE hiredate < '81/12/03';

-- 논리연산자 : AND, OR, NOT
-- 10번 부서의 매니저가 누구인지 찾아보자

SELECT *
FROM emp
WHERE deptno=10 and job='MANAGER';

SELECT ename, deptno, job
FROM emp
WHERE deptno=10 and job='MANAGER';

---------------------------------------

SELECT *
FROM emp
WHERE deptno=10 or job='MANAGER';

---- 같은 결과값----
SELECT *
FROM emp
WHERE deptno=20 or deptno=30 or deptno=40 ; 

SELECT * FROM emp WHERE deptno != 10; 
SELECT * FROM emp WHERE deptno <> 10; 
SELECT * FROM emp WHERE not deptno = 10; 
------------------

-- 2000에서 3000 사이의 급여를 받는 사원

select * from emp where sal >= 2000 and sal<=3000;
-- 범위 연산자 between A and B => A이상 B이하
select * from emp where sal between 2000 and 3000;
--------------------------------------------------
-- 범위 연산은 날짜도 가능하다. 작은 따옴표 사용!
select * from emp where hiredate BETWEEN '81/01/01' and '81/12/31';

-- 사원중에 10,20,30번 부서에 소속한 사원의 정보를 출력
select * from emp where deptno = 10 or deptno = 20 or deptno = 30;
select * from emp where deptno in(10,20,30);

-- 커미션이 300 이거나 500 이거나 1400 인 사원을 검색
select * from emp where comm in(300,500,1400);

-- 패턴 검색 : 문자열의 패턴 / 컬럼 LIKE '패턴' / 
-- 패턴형식 : _한자리  , __두자리, ___세자리 -> '__ACE' 앞 두자리는 어떤문자가 와도 상관없음
-- LIKE 연산자와 와일드카드 ( % or _ ) %=문자가 없거나 하나 이상의 문자/ _ = 하나의 문자 모든 가능
-- EX ) 'A%' , '%A' , '%A%'

-- F로 시작하는 이름 사원 리스트
select * from emp where ename like 'F%';
select * from emp where ename like 'S%';

-- 이름에 A를 포함하는 사원 리스트 : '%A%'
select * from emp where ename like '%A%';

-- 이름에 N으로 끝나는 사원 리스트 : '%N'
select * from emp where ename like '%N';

-- A로시작하는 5글자 이름
select * from emp where ename like 'A____';

-- 두 번째 이름 글자가 A인 사원
select * from emp where ename like '_A%';
-- 세 번째 이름 글자가 A인 사원
select * from emp where ename like '__A%';


-- 이름에 A를 포함하지 않는 사원 리스트 : '%A%'
select * from emp where ename not like '%A%';
-- 연산자 앞에 NOT을 하게 되면 제외한 나머지 값만 출력
select * from emp where deptno not in(10,20);

-- NULL 여부를 판단하는 is null, is not null
--  IS NULL 연산자를 사용하여 커미션이 등록되어있지 않은 사원을 검색
select * from emp where comm is null;
-- 커미션이 등록되어 있는 사원 리스트 => is not null
select * from emp where comm is not null;
-- 커미션을 받지 않는 사원 (0과 null)
select * from emp where comm = 0 or comm is null;
select * from emp where not(comm = 0 or comm is null);
select * from emp where comm = 0 and comm is not null;
------------------------------------------------------------------

-- select의 출력 결과의 정렬 : 오름차순 asc, 내림차순 desc
-- select ...from ...where ...order by 컬럼이름 (asc,desc) asc 생략가능 defult
-- 급여순(오름차순) 으로 사원 리스트를 출력
select * from emp order by sal;
select * from emp order by sal asc;
select * from emp order by sal desc;

-- 문자정렬 (이름순)
select * from emp order by ename;
select * from emp order by ename desc;

-- 날짜 ( 입사일 빠른 순서대로)
select *from emp order by hiredate;
-- 날짜 ( 입사일 최근 순서대로)
select *from emp order by hiredate desc;

-- 급여순으로 정렬
select * from emp order by sal;
-- 금여순, 이름순으로 정렬
select * from emp order by sal, ename desc;

