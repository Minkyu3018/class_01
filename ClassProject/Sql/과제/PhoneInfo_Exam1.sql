
-- 전화번호 저장 테이블

create table phoneInfo_basic (
        idx number(6) constraint PK_PHONEINFO_BASIC_IDX primary key ,
        fr_name varchar2(20) constraint PK_PHONEINFO_BASIC_fr_NAME not null,
        fr_phonenumber varchar2(20) constraint PK_PHONEINFO_BASIC_PHONENUMBER not null,
        fr_email varchar2(20),
        fr_address varchar2(20),
        fr_regdate date default sysdate
);

create table phoneInfo_univ(
        idx number(6) constraint PK_PHONEINFO_UNIV primary key,
        fr_u_major varchar2(20) default 'N' not null,
        fr_u_year number(1) default 1 not null check(fr_u_year>0 and fr_u_year<5),
        fr_ref number(7) references phoneInfo_basic(idx) not null
);

create table phoneInfo_com(
        idx number(6) constraint PK_PHONEINFO_COM_IDX primary key,
        fr_c_company varchar2(20) default 'N' not null,
        fr_ref number(6) references phoneInfo_basic(idx) not null  
);


--1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_basic;

insert into phoneInfo_basic values (870011 ,'손흥민' ,'010-1234-5678' ,'son@gmail.com' ,'서울' ,'20/05/05' ) ;
insert into phoneInfo_basic values (870022 ,'김병지' ,'010-2222-1234' ,'kbj@gmail.com' ,'울산' ,'21/06/06' ) ;
insert into phoneInfo_basic values (870033 ,'홍명보' ,'010-3333-7890' ,'hmb@gmail.com' ,'경기' ,'22/07/22' ) ;
insert into phoneInfo_basic values (870044 ,'안정환' ,'010-4444-9876' ,'ajh@gmail.com' ,'서울' ,'23/08/15' ) ;
insert into phoneInfo_basic values (870055 ,'이천수' ,'010-5555-2345' ,'lcs@gmail.com' ,'부산' ,'24/01/01' ) ;
insert into phoneInfo_basic values (870066 ,'이을용' ,'010-6666-6666' ,'lyy@gmail.com' ,'대전' ,'02/02/02' ) ;

update phoneInfo_basic set fr_address = '대구' where idx = 870066;

delete from phoneInfo_basic where idx = 870066;

rollback;


-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_univ;
insert into phoneInfo_univ values (1 ,'축구 ' ,4 ,870011 );
insert into phoneInfo_univ values (2 ,'요리 ' ,2 ,870022 );
insert into phoneInfo_univ values (3 ,'전산 ' ,3 ,870033 );
insert into phoneInfo_univ values (4 ,'회계 ' ,1 ,870044 );

update phoneInfo_univ set fr_u_year = 2 where fr_ref = 870044;

delete from phoneInfo_univ where fr_ref = 870044;

rollback;


-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_com;
insert into phoneInfo_com values (1, 'AA', 870011);
insert into phoneInfo_com values (2, 'BB', 870022);
insert into phoneInfo_com values (3, 'CC', 870033);
insert into phoneInfo_com values (4, 'DD', 870044);

update phoneInfo_com set fr_c_company = 'EE' where fr_ref = 870044;

delete from phoneInfo_univ where fr_ref = 870044;

rollback;
