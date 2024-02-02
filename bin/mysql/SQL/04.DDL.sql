#####################################################
#
# 데이터 조작 언어(DDL : Data Definition Language)
#
#####################################################

# 주소록 만들기
    -- 이름, 전화번호, 이메일, 생일
    -- 사용자(users)
    -- uid, pwd, uname, email, regDate, isDeleted
    -- 기본키로 설정되는 동시에 unique(중복허용X) 속성을 가짐

-- ERD (Entity Relationship Diagram) : 계체-관계 다이어그램
-- 1:N의 관계 : addrBook(tripod이 있는 쪽)에 uid 입력 시 그 값이 users table에 없으면 입력이 되지 않음
CREATE TABLE addrBook
(
	aid int NOT NULL AUTO_INCREMENT,
	name varchar(16) NOT NULL,
	Tel varchar(16),
	email varchar(32),
	birthday date,
	PRIMARY KEY (aid)
);

# 사용자 테이블 생성
CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(16) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);