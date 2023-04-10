INSERT INTO author (id,name,profile) VALUES(seq_author.nextval, 'smk', 'developer');
INSERT INTO author (id,name,profile) VALUES(seq_author.nextval, 'duru', 'DBA');
INSERT INTO author (id,name,profile) VALUES(seq_author.nextval, 'TAEHO', 'scientist');


SELECT 
    T.id TOPIC_ID,
    title,
    name    
FROM topic T
    LEFT JOIN author A
    ON T.author_id = A.id
WHERE
    T.id = 1
;