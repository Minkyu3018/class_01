
-- 2023.04.12
-- 함수

desc dual;
select * from dual;

-- 단일 행 함수 / 집합(그룹)함수
-- 단일 행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수...

-- 숫자 함수
select 10, -10 from dual;

-- 절대값 abs
select 10, -10, abs(-10), abs(10) from dual;

-- floor : 소숫점 절사
select 2.12345 from dual;
select 2.12345, floor(2.12345) from dual;

-- round : 지정 위치에서 반올림
select 1234.567 from dual;
select 1234.567, round(1234.567), round(1234.567,1), round(1231,-1) from dual;

-- trunc : 특정 자릿수 아래를 절사
select 1234.567, trunc(1234.567), trunc(1234.567, 1), trunc(1234.567, -1) from dual;

-- mod : 나머지 연산
select mod(1,3) from dual;
select mod(1,3), mod(2,3), mod(0,3), mod(3,0) from dual;
----------------------------------------------------------------------------------
--------------------- 문자처리 함수 --------------------------------------
select 'SCOTT' from dual;
-- 소문자로 변환
select 'SCOTT', lower('SCOTT') from dual;
select dname, lower(dname) from dept;
-- 대문자로 변환
select 'scott', upper('scott') from dual;
-- 첫글자만 대문자, 나머지 소문자
select 'scott', initcap('scott') from dual;

-- 문자열을 추출 : substr(원본, 시작위치), substr(원본, 시작위치, 반환할 문자의 개수)
select '안녕하세요. 손흥민입니다.' , 
        substr('안녕하세요. 손흥민입니다.', 5),
        substr('안녕하세요. 손흥민입니다.', 8, 7)
from dual;

-- 문자열의 개수 : length(원본문자열)
select length('안녕하세요.!!!!') from dual;

-- 문자열에서 특정 자리수가 지정하고 자리에 데이터가 없을때 패턴을 입력
-- 00010
select '10', lpad('10', 5, '0') from dual;
select '10', rpad('10', 5, 'A') from dual;

select deptno, lpad(deptno, 5, '0') from dept;

-- trim() : 공백 제거
select '     ABC     ' 
        , trim('     ABC     ')
        , trim('ABC     ')
        , trim('     ABC')
from dual;

-- replace : 특정 문자를 변경
select 'Steven King',
        replace('Steven King', 'Steven','S.'),
        replace('Steven King', 'Steven','')
from dual;
-----------------------------------------------------------------------------
---------------------------날짜 함수---------------------------
select sysdate from dual;

-- months_between : 두 날짜 사이의 차이(개월) 반환
select sysdate, months_between('23/12/15', sysdate)  from dual;

-- add_months : 특정 날짜에 개월 수를 더한다
select add_months(sysdate, 8) from dual;
select add_months(sysdate, -1) from dual;
select add_months(sysdate, -2) from dual;

-- next_day : 최초로 도래하는 인자로 받은 요일의 날짜를 반환
select next_day(sysdate, 2) from dual;

-- last_day : 해당 달의 마지막 날짜를 반환한다.
select last_day(sysdate) from dual;

-- round : 날짜를 특정 기준으로 반올림한다.
select round(sysdate) from dual;
-- trunc : 날짜를 특정 기준으로 버림
select trunc(sysdate) from dual;

----------------------------------------------------------------------------
-------------------형 변환 함수-------------------
-- DATE -> CHAR
-- to_char(원본, '패턴')
select sysdate, to_char(sysdate, 'YYYY-MM-DD'), 
                to_char(sysdate, 'YYYY.MM.DD.'),
                to_char(sysdate, 'YYYY.MM.DD.DAY'),
                to_char(sysdate, 'yyyy,mm.dd. hh24:mi:ss')
from dual;

-- number -> char
select 123456789 ,to_char(123456789, '000000000000')
                ,to_char(123456789, '000,000,000,000')
                ,to_char(123456789, '999999999999')
                ,to_char(123456789, '999,999,999,999')
                ,to_char(123456789, 'L999,999,999,999')
                ,to_char(123456789, '999,999')
from dual;

select ename, sal, to_char(sal*1300, 'L999,999,999') as wonSAL
from emp;

-- char -> Date
-- to_date('문자열','패턴')
select * 
from emp
where hiredate = to_date('19810220', 'YYYYMMDD')
;

insert into emp values(9999, 'SON', 'MANAGER', 7782, '2023-04-12', 4000, null, 10);

select * from emp;

rollback;  -- 마지막 커밋 시점으로 돌아간다.

-- char -> number
-- to _number('문자열')
select '20000' - '10000' -- 자동 형변환
from dual;

select to_number('20,000', '999,999,999' ) - to_number ('10,000', '999,999,999')
from dual;

-- NULL을 0 또는 다른 값으로 변환하기 위해서 사용하는 함수
SELECT ENAME, SAL, job, COMM, SAL*12+COMM, 
NVL(COMM, 0), SAL*12+NVL(COMM, 0)
FROM EMP
ORDER BY JOB;


-- DECODE 함수 =>  = 비교 연산 후 결과 출력 하는 함수 switch~case
select ename, deptno,
    decode(deptno,
            10, 'ACCOUNTING',
            20, 'RESEARCH',
            30, 'SEALS',
            40, 'OPERATIONS')
            as dname
from emp
order by deptno;

-- 직급에 따라 급여를 인상하도록 하자. 직급이 'ANAlYST'인 사원은 5%, 'SALESMAN'인 사원은 10%, 
-- 'MANAGER'인 사원은 15%, 'CLERK'인 사원은 20%인 인상한다. 

select *from emp;

select ename, job, sal,
    decode(job,
            'ANALYST', sal*1.05,
            'SALESMAN', sal*1.1,
            'MANAGER', sal*1.15,
            'CLERK', sal*1.2
            ) as upSAL ,
            
    nvl (decode(job,
            'ANALYST', sal*1.05,
            'SALESMAN', sal*1.1,
            'MANAGER', sal*1.15,
            'CLERK', sal*1.2
            ),sal )as upSAL2
from emp;
-------------------------------------------------------------------------------
-- CASE 함수 ( case ~ when => then ~ else ~ end )

select ename, deptno,
    decode(deptno,
            10, 'ACCOUNTING',
            20, 'RESEARCH',
            30, 'SEALS',
            40, 'OPERATIONS')
            as dname,
            
            case when deptno=10 then 'ACCOUNTING'
                 when deptno=20 then 'RESEARCH'
                 when deptno=30 then 'SEALS'
                 else 'OPERATIONS'
            end as dname2
from emp
order by deptno;

-------------------------------------------------------------------------------
-- 그룹함수--
-- 급여 총액을 구해보자
select sum(sal), to_char(sum(sal), 'L999,999')
from emp;

-- 커미션의 총합 / Null값은 제외하고 계산한다.  count도 null은 제외.
select sum(comm), count(comm)
from emp;

select comm from emp where comm is not null;

-- 평균을 구한다 / Null값은 제외
select avg(sal), trunc(avg(sal)), round(avg(sal),2), avg(comm)
from emp;

-- 최대급여 max(), 최소급여 min()
select max(sal), min(sal)
from emp;

-- count() => row 개수
select count(*)
from emp;

-- 10번 부서의 사원의 수
select count(*) from emp where deptno = 10;
-- 부서의 개수
select count(*) from dept;
-- 업무의 개수 / distinct 사용해서 중복값 제거
select job from emp order by job;

select distinct job from emp order by job;

select count(distinct job) from emp order by job;
----------------------------------------------------------------
-----------------------Group by 절--------------------------------
select * from emp order by deptno;

-- group by => 행 단위로 그룹핑
select deptno, 
        count(*) as "사원의수", 
        sum(sal) as "총급여액",
        trunc(avg(sal)) as "평균급여액",
        max(sal) as "최고급여액",
        min(sal) as "최소급여액"
from emp
group by deptno
order by deptno;


select deptno, trunc(avg(sal),1)
from emp
group by deptno
order by deptno ;

select job, trunc(avg(sal),1)
from emp
group by job;

-- 부서별로 사원수와 커미션을 받는 사원 수
select deptno,
count(*),
count(comm)
from emp
group by deptno;

delete from emp where ename='SON';

------ HAVING----------
-- 그룹핑된 데이터의 집합 함수 결과를 조건식으로 만들떄
select deptno, 
        count(*) as "사원의수", 
        sum(sal) as "총급여액",
        trunc(avg(sal)) as "평균급여액",
        max(sal) as "최고급여액",
        min(sal) as "최소급여액"
from emp
group by deptno
having avg(sal) >=2000  -- 각 그룹의 평균값
order by deptno;

-- 총 급여액이 10000 넘어가는 그룹
select deptno, 
        count(*) as "사원의수", 
        sum(sal) as "총급여액",
        trunc(avg(sal)) as "평균급여액",
        max(sal) as "최고급여액",
        min(sal) as "최소급여액"
from emp
group by deptno
having sum(sal) >=10000 
order by deptno;


select job, count(*), trunc(avg(sal)), sum(sal), max(sal), min(sal)
from emp
group by job ;