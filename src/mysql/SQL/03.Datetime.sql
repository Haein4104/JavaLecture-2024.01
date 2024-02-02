###################
# 날짜 및 시간 조작
###################

-- 1. 테이블 생성
CREATE TABLE if NOT EXISTS dateTable (
    id INT PRIMARY KEY AUTO_INCREMENT,                  -- INT 뒤에 (not null)
    regDate DATE DEFAULT (Current_date),
    modTime datetime DEFAULT CURRENT_TIMESTAMP
);



-- 2. 데이터 입력
INSERT INTO dateTable VALUES (default, default, DEFAULT);
SELECT * FROM dateTable;

INSERT INTO dateTable(id) VALUES (DEFAULT);
SELECT * FROM dateTable;

INSERT INTO dateTable(regDate, modTime) VALUES
    ('2024-01-01', '2024-01-31 10:25:00'),
    ('2024-02-01', '2024-02-02 10:38:40');
SELECT * FROM dateTable;



-- 3. 데이터 조회 (구글링으로 더 많은 방법을 찾아보기!)
# 2024-02-02 형식
SELECT regDate, date_format(modTime, '%Y-%m-%d') FROM dateTable;
SELECT * FROM dateTable;

# 10:45:00 AM 형식
SELECT DATE_FORMAT(modTime, '%h:%i:%s %p') FROM dateTable;
SELECT * FROM dateTable;

# 데이터 추가
UPDATE dateTable SET modTime='2024-02-02 16:45:00' WHERE id=4;
SELECT * FROM dateTable;

# 24-02-02 16:45 형식
SELECT DATE_FORMAT(modTime, '%y-%m-%d %h:%i') FROM dateTable;
SELECT * FROM dateTable;

# 날짜 조회 함수
SELECT NOW(), CURDATE(), CURTIME();



-- 4. 데이터 수정

UPDATE dateTable SET regDate=CURDATE(), modTime=NOW() WHERE id=3;



-- 5. 날짜 계산
# 날짜 더하기 빼기
SELECT DATE_ADD((NOW), INTERVAL 40 DAY);
SELECT DATE_SUB((CURDATE), INTERVAL 3 MONTH);

# D-DAY 계산
SELECT TO_DAYS('2024-11-14') - TO_DAYS(CURDATE());

CREATE VIEW largeCity AS SELECT * FROM city
    WHERE population>8000000;