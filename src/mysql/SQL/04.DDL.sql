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

-- 2. 테이블 조회
# DB 내의 테이블 목록
SHOW TABLES;

# 테이블 구조
DESC users;                     -- describe


-- 3. 테이블 삭제
# largeCity view 삭제
DROP VIEW largeCity;            -- DROP VIEW

# dateTable 삭제
DROP TABLE dateTable;           -- DROP TABLE

# kcity 내의 데이터 삭제
TRUNCATE kcity;                 -- TRANCATE ; 데이터 구조는 남지만 데이터를 전부 날릴 위험이 있어 추천하지 않음

# 테이블 이름 변경
RENAME TABLE kcity TO korCity;


-- 5. 테이블 구조 변경

# users 테이블에서 email 뒤에 tel 추가
ALTER TABLE users
    ADD tel VARCHAR(16) NOT NULL AFTER email;
DESC users;

# users 테이블에서 tel의 not null 제거
ALTER TABLE users
    CHANGE tel tel VARCHAR(16);
DESC users;