-- ddl, dml Retry 23.4.18

create table phoneInfo_basic (
    idx number(6) constraint PK_PHONEINFO_BASIC_IDX primary key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date default sysdate
);

create table phoneInfo_univ (
    idx number(6) constraint PK_PHONEINFO_UNIV_IDX primary key,
    fr_u_major varchar2(20) default 'N' not null,
    fr_u_year number(1) default 1 not null check (fr_u_year between 1 and 4),
    fr_ref number(7) references phoneInfo_basic(idx) not null
);

create table phoneInfo_com (
    idx number(6) constraint PK_PHONEINFO_COM_IDX primary key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6) references phoneInfo_basic(idx) not null
);

-- (1)
select * from phoneInfo_basic;
insert into phoneInfo_basic values (1 ,'김경호' ,'010-1234-5678' ,'kim@gamail.com' ,'서울' ,'90/09/18' );
insert into phoneInfo_basic values (2 ,'더크로스' ,'010-2222-9999' ,'the@gmail.com' ,'인천' ,default );
insert into phoneInfo_basic values (3 ,'얀' ,'010-3939-9393' ,'y@gamil.com' ,'대전' ,'20/03/14' );
insert into phoneInfo_basic values (4 ,'박완규' ,'010-4949-8887' ,'park@gmail.com' ,'부산' ,'23/02/20' );


-- (2)
select * from phoneInfo_univ;
insert into phoneInfo_univ values (11 ,'락 ' ,1 ,1 );
insert into phoneInfo_univ values (22 ,'락발라드 ' ,2 ,2 );
insert into phoneInfo_univ values (33 ,'락발라드 ' ,3 ,3 );
insert into phoneInfo_univ values (44 ,'락 ' ,4 ,4 );

-- (3)
select * from phoneInfo_com;
insert into phoneInfo_com values(111 ,'naver' ,1 );
insert into phoneInfo_com values(222 ,'google' ,2 );
insert into phoneInfo_com values(333 ,'kakao' ,3 );
insert into phoneInfo_com values(444 ,'sk' ,4 );




