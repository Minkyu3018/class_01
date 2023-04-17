-- select test2

select bookid, bookname
from book
where bookid='1'
;

select bookname, price
from book
where price >= 20000
;

select name, address
from customer
;

select orderid, orderdate
from orders
where orderdate between '14/07/04' and '14/07/07'
;


select orderid, orderdate
from orders
where orderdate not between '14/07/04' and '14/07/07'
;

select name, address
from customer
where name like '김%'
;

select name, address
from customer
where name like '김%아'
;

