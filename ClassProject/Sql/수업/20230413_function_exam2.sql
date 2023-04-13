-- function exam2

--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
select custid ,sum(saleprice)
from orders
where custid=1
group by custid;

--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
select count(*)
from orders
where custid = 1;

-- (1) 마당서점도서의총개수
select count(*)
from book;

-- (2) 마당서점에도서를출고하는출판사의총개수
select count(distinct publisher) as "Publisher count"
from book;

