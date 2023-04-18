-- ddl,dml Test

create table apt_basic(
        ap_id number(4) constraint PK_APT_BASIC_ID primary key ,
        ap_name varchar2(20) not null,
        ap_phone varchar2(20) not null,
        ap_email varchar2(20),
        ap_job varchar2(20),
        ap_date date default sysdate
);

select * from apt_basic;

insert into apt_basic values 
(806, '홍길동', '010-1111-1234', 'aaa@gamail.com', '무속인', '');

insert into apt_basic values 
(203, '김철수', '010-2222-5678', 'bbb@gamail.com', '학생', '20/04/02');

insert into apt_basic values 
(408, '이미지', '010-3333-4567', 'ccc@gamail.com', '주부', '23/07/28');

insert into apt_basic values 
(607, '박군', '010-4444-122', 'ddd@gamail.com', '가수', default);

update apt_basic
set ap_phone = '010-4444-1222'
where ap_id = 607
;


