#########################
# 테이블 조인(TABLE JOIN)
#########################

-- 1. 테이블 생성
# song 테이블 만들기
CREATE TABLE if NOT EXISTS song (           -- song이라는 테이블이 없으면 생성해줘.
    SID INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(32) NOT NULL,             -- 필드 생성 : 제목, 가사
    lylics VARCHAR(64)
) AUTO_INCREMENT=101;                       -- 시작번호 지정 : 시작을 101번부터 하겠다는 의미


# 걸그룹 테이블 만들기
CREATE TABLE if NOT EXISTS girl_group (
    gid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    debut DATE NOT NULL,
    hit_song_id int
) AUTO_INCREMENT=1001;


-- 2. 데이터 입력
# song 테이블
INSERT INTO song (title, lylics) values
    ('Tell Me', 'tell me tell me tetetete tel me'),
   ('Gee', 'GEE GEE GEE GEE GEE BABY BABY'),
   ('미스터', '이름이 뭐야 미스터'), 
   ('Abracadabra', '이러다 미쳐 내가 여리여리'),
   ('8282', 'Give me a call Baby baby'), ('기대해', '기대해'),
   ('I Dont care', '다른 여자들의 다리를'), 
   ('Bad Girl Good Girl', '앞에선 한 마디 말도'), ('Nu ABO', '뉴예삐오'),
   ('별빛달빛', '너는 내 별빛 내 마음의 별빛'), 
   ('A', 'A 워오우 워오우워 우우우'),
   ('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고'), ('Ah', '너와 단 둘이'),
   ('짧은치마', '짧은 치마를 입고 내가 길을 걸으면'),
   ('위아래', '위 아래 위위 아래'), ('Dumb Dumb', '너 땜에 하루종일')
   ('TOP', 'My love D.O.C 너도 힘들겠어'), ('Perfect Man', '그대만을 알겠어 내 숨이 다한대도 cause u r the ONE'),
   ('누난 너무 예뻐', '누난 너무 예뻐서 남자들이 가만 안 둬'),
   ('HOT ISSUE', '머리부터 발 끝까지 Hot issue');
SELECT * FROM song;


   # girl_group 테이블
INSERT INTO girl_group (name, debut, hit_song_id) values
   ('원더걸스', '2007-02-10', 101),
   ('소녀시대', '2007-08-02', 102), ('카라', '2009-07-30', 103),
   ('브라운아이드걸스', '2008-01-17', 104), ('다비치', '2009-02-27', 105),
   ('2NE1', '2009-07-08', 106), ('f(x)', '2011-04-20', 108),
   ('시크릿', '2011-01-06', 109), ('레인보우', '2010-08-12', 110),
   ('애프터 스쿨', '2009-11-25',120), ('포미닛', '2009-08-28', 121);
   SELECT * FROM girl_group_songs;




-- 3. TABLE JOIN
# INNER JOIN
SELECT r.name, r.debut, l.title, l.lylics FROM song l
    INNER JOIN girl_group r                                 -- INNER 생략 가능
    ON l.SID=r.hit_song_id;

# left outer JOIN
SELECT r.name, r.debut, l.title, l.lylics FROM song l
    LEFT OUTER JOIN girl_group r                            -- OUTER 생략 가능 
    ON l.SID=r.hit_song_id;

# Right outer JOIN
SELECT r.name, r.debut, l.title, l.lylics FROM song l
    RIGHT OUTER JOIN girl_group r                            -- OUTER 생략 가능 
    ON l.SID=r.hit_song_id;

# FOOL outer JOIN                                            -- 계산대로는 18항목이 나와야하지만 MySQL에서 지원X 
SELECT r.name, r.debut, l.title, l.lylics FROM song l
    LEFT OUTER JOIN girl_group r
    ON l.SID=r.hit_song_id;
UNION                                                         -- UNION(합집합) 을 통해 구현
SELECT r.name, r.debut, l.title, l.lylics FROM song l
    RIGHT OUTER JOIN girl_group r
    ON l.SID=r.hit_song_id;

