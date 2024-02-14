# 1. 국내 광역시도별 도시 갯수가 많은 5개 이상인 도
SELECT district, count(*) numCity FROM city 
    WHERE countrycode='KOR'
    GROUP BY district 
    ORDER BY numCity DESC
    LIMIT 5;

# 2. 인구수가 800만보다 큰 도시의 국가명, 도시명, 인구수
SELECT country.Name, city.Name, city.population FROM city
    JOIN country ON city.countrycode=country.Code
    WHERE city.population > 8000000;

# 3. 아시아 대륙에서 인구수가 많은 도시 상위 10개국
SELECT r.Continent, r.Name countryName, l.Name cityName, l.Population FROM city l
    JOIN country r
    ON l.CountryCode=r.Code
    WHERE r.Continent='Asia'
    ORDER BY l.Population DESC
    LIMIT 10;

# 4. 강원도(Kang-won)에 인구가 120000인 태백시를 삽입
INSERT INTO kcity (name, countrycode, district, population) VALUES('Taebaek', 'KOR', 'Kang-won', 120000);
SELECT * FROM kcity;

# 5. Chunchon 시의 이름과 인구수를 춘천과 30만으로 변경
UPDATE kcity SET name='춘천', population=300000 WHERE id=2365;
SELECT * FROM kcity;