USE escapedb;


DROP TABLE IF EXISTS WISHLIST;
DROP TABLE IF EXISTS IMAGES;
DROP TABLE IF EXISTS REVIEW;
DROP TABLE IF EXISTS `MEMBER`;
DROP TABLE IF EXISTS TEAM;
DROP TABLE IF EXISTS `COMMENT`;
DROP TABLE IF EXISTS WANTED;
DROP TABLE IF EXISTS QnA;
DROP TABLE IF EXISTS SWAP;
DROP TABLE IF EXISTS PAYMENT;
DROP TABLE IF EXISTS RESERVATION;
DROP TABLE IF EXISTS `USER`;
DROP TABLE IF EXISTS THEME;
DROP TABLE IF EXISTS GENRE;
DROP TABLE IF EXISTS STORE;
DROP TABLE IF EXISTS `ADMIN`;



CREATE TABLE GENRE (
	genre_code	INT	NOT NULL,
	gname	VARCHAR(20)	NULL
);
ALTER TABLE GENRE ADD CONSTRAINT PRIMARY KEY(genre_code);
ALTER TABLE GENRE MODIFY genre_code INT AUTO_INCREMENT;
INSERT INTO GENRE VALUES(NULL, '감성');
INSERT INTO GENRE VALUES(NULL, '모험');
INSERT INTO GENRE VALUES(NULL, '액션');
INSERT INTO GENRE VALUES(NULL, '추리');
INSERT INTO GENRE VALUES(NULL, 'SF/판타지');
INSERT INTO GENRE VALUES(NULL, '공포');
INSERT INTO GENRE VALUES(NULL, '19금');
INSERT INTO GENRE VALUES(NULL, '야외');
INSERT INTO GENRE VALUES(NULL, '?');


CREATE TABLE `USER` (
	user_code	INT	NOT NULL,
	id	VARCHAR(100)	NOT NULL,
	upassword	VARCHAR(100)	NULL,
	email	VARCHAR(100)	NOT NULL,
	phone	VARCHAR(100)	NOT NULL,
	address	VARCHAR(200)	NOT NULL,
	ban	VARCHAR(1)	NOT NULL,
	birthday	DATE	NULL,
	favorite_genre1	INT	NULL,
	favorite_genre2	INT	NULL,
	favorite_genre3	INT	NULL,
	writedate	DATETIME	NOT NULL	DEFAULT NOW()
);
ALTER TABLE `USER` ADD CONSTRAINT PRIMARY KEY(user_code);
ALTER TABLE `USER` MODIFY user_code INT AUTO_INCREMENT;
ALTER TABLE `USER` ADD FOREIGN KEY (favorite_genre1) REFERENCES GENRE (genre_code);
ALTER TABLE `USER` ADD FOREIGN KEY (favorite_genre2) REFERENCES GENRE (genre_code);
ALTER TABLE `USER` ADD FOREIGN KEY (favorite_genre3) REFERENCES GENRE (genre_code);
insert into user values(NULL,'user1','qlalfqjsgh1!','dsfjldsjf1@naver.com','010-8473-3343','서울시 성동구',0,'1995-08-16',1,2,3,'2023-03-06');
insert into user values(NULL,'user2','qlalfqjsgh2!','erjkwe12@naver.com','010-3434-3434','서울시 강남구',0,'1997-04-20',4,5,1,'2023-03-07');
insert into user values(NULL,'dasom1','qkrgkektha1!','moa8417@naver.com','010-7644-8407','경주시 황성동',0,'1991-08-16',1,2,3,'2023-03-06');
insert into user values(NULL,'mint','wkdeotn1!','mint1@gmail.com','010-4325-3421','포항시 양덕동',0,'2013-05-12',6,3,4,'2023-03-08');


CREATE TABLE `ADMIN` (
	admin_code	INT	NOT NULL,
	id	VARCHAR(20)	NULL,
	apassword	VARCHAR(20)	NULL,
	phone	VARCHAR(20)	NULL,
	email	VARCHAR(100)	NULL
);
ALTER TABLE `ADMIN` ADD CONSTRAINT PRIMARY KEY(admin_code);
ALTER TABLE `ADMIN` MODIFY admin_code INT AUTO_INCREMENT;
insert into admin values(1,'admin01','pwdpwd1','010-3333-3333','djfs@naver.com');
insert into admin values(2,'admin02','pwdpwd2','010-3344-3443','djfdkljf@gmail.com');


CREATE TABLE STORE (
	store_code	INT	NOT NULL,
	admin_code	INT	NOT NULL,
	sname	VARCHAR(100)	NOT NULL,
	phone	VARCHAR(30)	NOT NULL,
	address	VARCHAR(100)	NOT NULL,
	homepage	VARCHAR(100)	NOT NULL,
	event VARCHAR(100) NULL
);
ALTER TABLE STORE ADD CONSTRAINT PRIMARY KEY(store_code);
ALTER TABLE STORE MODIFY store_code INT AUTO_INCREMENT;
ALTER TABLE STORE ADD FOREIGN KEY (admin_code) REFERENCES `ADMIN` (admin_code);
INSERT INTO STORE VALUES(NULL, 1, '비밀의화원 리버타운점', '02-763-3289', '서울 종로구 대명길 9 (명륜4가) 지하2층 방탈출', 'http://www.secretgardenescape.com', NULL);
INSERT INTO STORE VALUES(NULL, 2, '제로월드 강남점', '02-599-1661', '서울특별시 서초구 서초대로73길 40.(서초동, 강남오피스텔) 지하1층', 'https://www.zerogangnam.com', NULL);


CREATE TABLE THEME (
	theme_code	INT	NOT NULL,
	store_code	INT	NOT NULL,
	genre_code	INT	NOT NULL,
    tname VARCHAR(100) NULL,
	themetime	INT	 NULL,
	posting	LONGTEXT	NULL,
	number_people	INT	NULL,
	themelevel	INT	NULL,
	device	VARCHAR(30)	NULL,
	activity	VARCHAR(30)	NULL
);
ALTER TABLE THEME ADD CONSTRAINT PRIMARY KEY(theme_code);
ALTER TABLE THEME MODIFY theme_code INT AUTO_INCREMENT;
ALTER TABLE THEME ADD FOREIGN KEY (store_code) REFERENCES STORE (store_code);
ALTER TABLE THEME ADD FOREIGN KEY (genre_code) REFERENCES GENRE (genre_code);
INSERT INTO THEME VALUES(NULL, 1, 5, 'Z', 120, '눈을 떠보니 낯선 우주선... 나는 왜 여기에...? *고소공포증 주의', 3, 3, '보통', '높음');
INSERT INTO THEME VALUES(NULL, 1, 6, '무고', 75, '#무속신앙 #공포 #탈출_후_어깨털기 무고: 무당의 저주', 2, 3, '보통', '낮음');
INSERT INTO THEME VALUES(NULL, 1, 9, '후레쉬망고 호스텔', 70, '싸와디카~ 작지만 아늑한 후레쉬망고 호스텔입니다.', 2, 3, '보통', '낮음');
INSERT INTO THEME VALUES(NULL, 1, 1, '만화 : 늦게 피어난 꽃', 60, '늦게라도 피어남에 감사합니다.', 2, 2, '낮음', '낮음');
INSERT INTO THEME VALUES(NULL, 1, 4, '스토커', 60, '#스릴러맨스 #평생_함께하자고_했잖아 #사랑해 사랑하는 자기... 우리는 언제까지나 함께 해야 해...', 2, 2, '보통', '낮음'); -- 추리에 스릴러가 포함됨
INSERT INTO THEME VALUES(NULL, 2, 2, '헐!', 90, '뭐지? 끼이이익----! 처음 듣는 날카로운 소리와 함께 내 몸은 하늘로 붕 뜬다...', 2, 4, '높음', '보통'); -- 모험에 코미디가 포함됨
INSERT INTO THEME VALUES(NULL, 2, 5, '나비효과', 75, '다시 그 때로 돌아갈 수만 있다면 얼마나 좋을까..?', 4, 3, '보통', '낮음');
INSERT INTO THEME VALUES(NULL, 2, 6, '제로', 120, '강남 제로월드의 10번째 테마 [제로] 입니다. 마지막까지 저희와 함께 해 주시겠습니까?', 3, 4, '보통', '보통');


CREATE TABLE WISHLIST (
wishlist_code	INT	NOT NULL,
user_code	INT	NOT NULL,
theme_code	INT	NOT NULL
);
ALTER TABLE WISHLIST ADD CONSTRAINT PRIMARY KEY(wishlist_code);
ALTER TABLE WISHLIST MODIFY wishlist_code INT AUTO_INCREMENT;
ALTER TABLE WISHLIST ADD FOREIGN KEY (theme_code) REFERENCES THEME (theme_code);
ALTER TABLE WISHLIST ADD FOREIGN KEY (user_code) REFERENCES USER (user_code);


CREATE TABLE REVIEW (
	review_code	INT	NOT NULL,
	user_code	INT	NOT NULL,
	theme_code	INT	NOT NULL,
	title	VARCHAR(100)	NULL,
	posting	LONGTEXT	NULL,
	interior	INT	NULL,
	story	INT	NULL,
	reviewlevel	INT	NULL,
	playdate	DATE	NULL,
	success	INT	NULL,
	hintcount	INT	NULL,
	cleartime	INT	NULL,
	writedate	DATETIME	NULL	DEFAULT NOW()
);
ALTER TABLE REVIEW ADD CONSTRAINT PRIMARY KEY(review_code);
ALTER TABLE REVIEW MODIFY review_code INT AUTO_INCREMENT;
ALTER TABLE REVIEW ADD FOREIGN KEY (user_code) REFERENCES `USER` (user_code);
ALTER TABLE REVIEW ADD FOREIGN KEY (theme_code) REFERENCES THEME (theme_code);
INSERT INTO REVIEW VALUES(NULL, 2, 1, "너무 재밌었어요", "추천합니다!", 5, 5, 5, now(), 1, 3, 45, now());


CREATE TABLE IMAGES (
images_code	INT	NOT NULL,
store_code	INT	NOT NULL,
review_code	INT	NOT NULL,
theme_code	INT	NOT NULL,
imagesname	VARCHAR(20)	NULL
);
ALTER TABLE IMAGES ADD CONSTRAINT PRIMARY KEY(images_code);
ALTER TABLE IMAGES MODIFY images_code INT AUTO_INCREMENT;
ALTER TABLE IMAGES ADD FOREIGN KEY (store_code) REFERENCES STORE (store_code);
ALTER TABLE IMAGES ADD FOREIGN KEY (review_code) REFERENCES REVIEW (review_code);
ALTER TABLE IMAGES ADD FOREIGN KEY (theme_code) REFERENCES THEME (theme_code);


CREATE TABLE WANTED (
	wanted_code	INT	NOT NULL,
	user_code	INT	NOT NULL,
	theme_code	INT	NOT NULL,
	title	VARCHAR(100)	NULL,
	posting	LONGTEXT	NULL,
	writedate	DATETIME	NULL	DEFAULT NOW(),
	reserved_date	DATE	NOT NULL,
	reserved_time	INT	NOT NULL
);
ALTER TABLE WANTED ADD CONSTRAINT PRIMARY KEY(wanted_code);
ALTER TABLE WANTED MODIFY wanted_code INT AUTO_INCREMENT;
ALTER TABLE WANTED ADD FOREIGN KEY (user_code) REFERENCES `USER` (user_code);
ALTER TABLE WANTED ADD FOREIGN KEY (theme_code) REFERENCES THEME (theme_code);
INSERT INTO WANTED VALUES(0, 1, 1, "방탈출 멤버 구합니다", "공포테마 방탈출 3명 구해요!", now(), now(), 60);


CREATE TABLE `COMMENT` (
	comment_code	INT	NOT NULL,
	comment_code2	INT	NULL,
	user_code	INT	NOT NULL,
    wanted_code INT NOT NULL,
	`comment`	VARCHAR(100)	NULL,
	writedate	DATETIME	NULL	DEFAULT NOW()
);
ALTER TABLE `COMMENT` ADD CONSTRAINT PRIMARY KEY(comment_code);
ALTER TABLE `COMMENT` MODIFY comment_code INT AUTO_INCREMENT;
ALTER TABLE `COMMENT` ADD FOREIGN KEY (comment_code2) REFERENCES `COMMENT` (comment_code);
ALTER TABLE `COMMENT` ADD FOREIGN KEY (user_code) REFERENCES `USER` (user_code);
ALTER TABLE `COMMENT` ADD FOREIGN KEY (wanted_code) REFERENCES WANTED (wanted_code);
INSERT INTO `COMMENT` VALUES(NULL, NULL, 1, 1, "안녕하세요! 사람 아직 구하시나요?", now());
INSERT INTO `COMMENT` VALUES(NULL, NULL, 2, 1, "저 하고 싶어요!!", now());
INSERT INTO `COMMENT` VALUES(NULL, 2, 3, 1, "저도요!", now());


CREATE TABLE TEAM (
team_code	INT	NOT NULL,
wanted_code	INT	NOT NULL
);
ALTER TABLE TEAM ADD CONSTRAINT PRIMARY KEY(team_code);
ALTER TABLE TEAM MODIFY team_code INT AUTO_INCREMENT;
ALTER TABLE TEAM ADD FOREIGN KEY (wanted_code) REFERENCES WANTED (wanted_code);


CREATE TABLE MEMBER (
member_code	INT	NOT NULL,
user_code	INT	NOT NULL,
team_code	INT	NOT NULL
);
ALTER TABLE MEMBER ADD CONSTRAINT PRIMARY KEY(member_code);
ALTER TABLE MEMBER MODIFY member_code INT AUTO_INCREMENT;
ALTER TABLE MEMBER ADD FOREIGN KEY (user_code) REFERENCES USER (user_code);
ALTER TABLE MEMBER ADD FOREIGN KEY (team_code) REFERENCES TEAM (team_code);


CREATE TABLE QnA (
	qna_code	INT	NOT NULL,
	user_code	INT	NOT NULL,
	store_code	INT	NOT NULL,
	title	VARCHAR(100)	NULL,
	posting	LONGTEXT	NULL,
	writedate	DATETIME	NULL	DEFAULT NOW()
);
ALTER TABLE QnA ADD CONSTRAINT PRIMARY KEY(qna_code);
ALTER TABLE QnA MODIFY qna_code INT AUTO_INCREMENT;
ALTER TABLE QnA ADD FOREIGN KEY (user_code) REFERENCES `USER` (user_code);
ALTER TABLE QnA ADD FOREIGN KEY (store_code) REFERENCES STORE (store_code);
INSERT INTO QnA VALUES(NULL, 2, 1, "QnA질문", "QnA내용", now());


CREATE TABLE SWAP (
	swap_code	INT	NOT NULL,
	user_code	INT	NOT NULL,
	theme_code	INT	NOT NULL,
	reserved_date	DATE	NOT NULL,
	reserved_time	INT	NOT NULL
);
ALTER TABLE SWAP ADD CONSTRAINT PRIMARY KEY(swap_code);
ALTER TABLE SWAP MODIFY swap_code INT AUTO_INCREMENT;
ALTER TABLE SWAP ADD FOREIGN KEY (user_code) REFERENCES `USER` (user_code);
ALTER TABLE SWAP ADD FOREIGN KEY (theme_code) REFERENCES THEME (theme_code);
INSERT INTO SWAP VALUES(NULL, 2, 1, now(), 60);


CREATE TABLE RESERVATION (
reservation_code	INT	NOT NULL,
user_code	INT	NOT NULL,
theme_code	INT	NOT NULL,
rdate	DATETIME	NULL,
rtime	INT	NULL,
price	INT	NULL,
rmember	INT	NULL
);
ALTER TABLE RESERVATION ADD CONSTRAINT PRIMARY KEY(reservation_code);
ALTER TABLE RESERVATION MODIFY reservation_code INT AUTO_INCREMENT;
ALTER TABLE RESERVATION ADD FOREIGN KEY (user_code) REFERENCES USER (user_code);
ALTER TABLE RESERVATION ADD FOREIGN KEY (theme_code) REFERENCES THEME (theme_code);


CREATE TABLE PAYMENT (
payment_code	INT	NOT NULL,
reservation_code	INT	NOT NULL
);
ALTER TABLE PAYMENT ADD CONSTRAINT PRIMARY KEY(payment_code);
ALTER TABLE PAYMENT MODIFY payment_code INT AUTO_INCREMENT;
ALTER TABLE PAYMENT ADD FOREIGN KEY (reservation_code) REFERENCES RESERVATION (reservation_code);
