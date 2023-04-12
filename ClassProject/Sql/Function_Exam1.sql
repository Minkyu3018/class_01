-- 

-- 16. SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.
select hiredate , substr(hiredate, 1, 5)
from emp;

-- 17. SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오.
select ename, hiredate from emp where substr(hiredate,5,1)='4';

-- 18. MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
select ename, empno from emp where mod(empno,2)='0';

-- 19. 입사일을 년도는 2자리(YY), 월은 숫자(MM)로 표시하고 요일은 약어 (DY)로 지정하여 출력하시오.
select hiredate, to_char(hiredate, 'YY.MM.DY') from emp;

-- 20. 올해 몇 칠이 지났는지 출력하시오. 현재날짜에서 올해 1월 1일을 뺀 결과를 출력하고 
-- TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.
select to_date(sysdate) - to_date('2023/01/01') FROM dual;




