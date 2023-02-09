INSERT INTO user_tb(username, password , email, created_at) values ('jeon','1234','jeon@naver.com',now());
INSERT INTO user_tb(username, password , email, created_at) values ('ssar','1234','ssar@naver.com',now());
INSERT INTO user_tb(username, password , email, created_at) values ('cafe','1234','cafe@naver.com',now());

INSERT INTO board_tb(title, content, user_id, created_at) values ('왕의남자','왕의남자 내용', 1, now());
INSERT INTO board_tb(title, content, user_id, created_at) values ('반지의 제왕','반지의 제왕 내용', 2, now());
INSERT INTO board_tb(title, content, user_id, created_at) values ('해리 포터','해리 포터 내용', 3, now());
INSERT INTO board_tb(title, content, user_id, created_at) values ('쉬리','쉬리 내용', 1, now());
INSERT INTO board_tb(title, content, user_id, created_at) values ('웰컴투 동막골','웰컴투 동막골 내용', 2, now());
INSERT INTO board_tb(title, content, user_id, created_at) values ('스피드','스피드 내용', 3, now());

commit;