#####################################################
#
# 데이터 조작 언어(DML : Data Manipulation Language)
#
#####################################################

-- 2. Update

--     UPDATE 테이블 식
--         SET 필드명1=값1, 필드명2=값2, ..., 필드명n=값n, 
--         WHERE 조건;                     -- 조건 : primary key = Value

# ID가 2340인 'Suwon'의 인구를 120만명으로 설정
UPDATE kcity SET name='Suwon', population=1200000 WHERE id=2340;

# ID가 2362인 'Yongin'의 인구를 110만명으로 설정
UPDATE kcity SET name='Yongin', population=1100000 WHERE id=2362;

# ID가 2391 이상인 도시의 인구를 10만씩 추가
UPDATE kcity SET  population=population+100000 WHERE id=2390;
SELECT * FROM kcity;

 -- id 값을 바꾸는 건 절대 금지. 데이터베이스는 무결성이 가장 중요하기 때문.


-- 3. Insert

    INSERT INTO 테이블(필드명1, 필드명2, ..., 필드명n)
        VALUES (값1, 값2, ..., 값n) [, (값1, 값2, ..., 값n)];
    -- or
    INSERT INTO 테이블 VALUES [, (모든 필드의 값)];

# 경기도 화성시, 의정부시 추가
INSERT INTO kcity
    VALUES (default, 'Hwasung', 'KOR', 'Kyonggi', 900000),
            (default, 'Uijongbu', 'KOR', 'Kyonggi', 460000);
SELECT * FROM kcity;

# 강원도 속초시 추가 - default value 활용(auto_increment 포함)
INSERT INTO kcity (name, countrycode, district) VALUES('Sokcho', 'KOR', 'Kang-won');
SELECT * FROM kcity;

# 경기도 광주시 추가 - auto_increment 속성이 설정되어 있어도 ID값을 임의로 부여 가능
INSERT INTO kcity
    VALUES (2601, 'Kwangju', 'KOR', 'Kyonggi', 300000);
SELECT * FROM kcity;


-- 4. Delete
    DELETE FROM 테이블명 WHERE 조건;        -- 조건 : primary key = Value

# 강원도 속초시 삭제
 DELETE FROM kcity WHERE id=2406;
 SELECT * FROM kcity ORDER BY id DESC;
