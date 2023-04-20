
-- 2023.04.19

-- VIEW : 가상 테이블
-- view 객체는 spl 가진다! => sqp 실행결과를 가상의 테이블로 사용

select empno, ename, deptno
from emp
where deptno = 30
;
-------------------------------------------

-- view 객체생성-----------------------------
-- create or replace view 뷰이름 as 서브쿼리

create or replace view emp_view30 
as 
select empno, ename, deptno
from emp
where deptno = 30
;

select * from emp_view30;
-------------------------------------------

-- 주문정보 : orders, book, customer
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate
from orders o ,book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
;

-- view 생성
create or replace view order_info
as
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate
from orders o ,book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
;

-- 실행
select * from order_info;
select name, bookname from order_info;
select bookname from order_info where name='박지성';

-- phone 번호 추가 (추가하고 명령문 실행하면 업데이트 됨)
create or replace view order_info
as
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate, c.phone
from orders o ,book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
;

select view_name, text from user_views ;
---------------------------------------------

-- view 삭제하기
drop view emp_view30;
---------------------------------

-- rownum과 order by 사용하여 정렬 확인------------------

select rownum, ename, hiredate from emp order by hiredate;

-- 인라인 이용하여 rownum, hiredate 순으로 재정렬
select rownum, ename, hiredate
from (select rownum, ename, hiredate from emp order by hiredate)
order by hiredate
;

select rownum, ename, hiredate
from (select rownum, ename, hiredate from emp order by hiredate)
where rownum <= 3
order by hiredate
;

create or replace view emp_hiredate_view
as
select ename, hiredate from emp order by hiredate
;

select rownum, ename, hiredate from emp_hiredate_view where rownum <=3;

-- 안됨
select rownum, ename, hiredate from emp_hiredate_view 
where rownum >=3 and rownum <=5; 

------------------------------------------------------------------------

select to_char(hiredate, 'YYYY') from emp;


create or replace view vemp_01
as
select ename, hiredate from emp order by hiredate
;

drop view vemp_01;

select * from vemp_01;

commit;