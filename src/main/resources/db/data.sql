INSERT INTO user_tb(username, password , email, created_at) values ('jeon','1234','jeon@naver.com',now());

INSERT INTO board_tb(title, content, user_id, created_at) values ('왕의남자','왕의남자 내용', 1, now());

commit;