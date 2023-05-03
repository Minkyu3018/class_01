create table `BOARD` (
	`NUM` int NOT NULL AUTO_INCREMENT,
    `TITLE` varchar(100) not null,
    `WRITER` varchar(100) not null,
    `CONTENT` varchar(1000),
    `REGDATE` date,
    `CNT` int DEFAULT '0',
    PRIMARY KEY (`NUM`)
    );
    
    
    insert into BOARD (`TITLE`, `WRITER`, `CONTENT`, `CNT`) 
    VALUES ('제목1', 'SONG', '컨텐트1', '0');
    
   --  insert into BOARD (`TITLE`, `WRITER`, `CONTENT`, `DATE`, `CNT`) VALUES (?, ?, ?, 'sysdate', '0');