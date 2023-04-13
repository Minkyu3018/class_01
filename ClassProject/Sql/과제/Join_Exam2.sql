-- Join & sub query Exam

-- (5) 박지성이구매한도서의출판사수
select c.name, count(publisher) as "출판사수"
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
and c.custid=1 
group by c.name
;

-- (6) 박지성이구매한도서의이름, 가격, 정가와 판매가격의차이 
select c.name, b.bookname, 
       b.price as "판매가격", 
       o.saleprice as "정가", 
       b.price - o.saleprice as "가격차이"
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
and c.custid=1
;

-- (7) 박지성이구매하지않은도서의이름  -- !!!!!!!!!!!!!!!!!!!!!!!!!!!!
select b.bookname
  
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
and c.custid != 1
;


-- (8) 주문하지않은고객의이름(부속질의사용)
select c.name
from customer c, orders o
where c.custid = o.custid
;



-- (9) 주문금액의총액과주문의평균금액
select sum(saleprice), avg(saleprice)
from orders;

-- (10) 고객의이름과고객별구매액


-- (11) 고객의이름과고객이구매한도서목록


-- (12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문




-- 3. (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름


-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름


