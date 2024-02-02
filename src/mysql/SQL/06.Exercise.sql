1. 2009년도에 데뷔한 걸그룹의 히트송은?
(그룹 이름, 데뷔일, 노래 제목)
SELECT name, debut, title
FROM girl_group_songs
WHERE YEAR(debut) = 2009;


2. 데뷔일자가 빠른 5개 그룹의 히트송은?
(그룹 이름, 데뷔일, 노래 제목)



3. 대륙별 국가 숫자, GNP의 합, 평균 국가별 GNP는?




4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로
(대륙명, 국가명, 도시명, 인구수)
SELECT Continent, r.Name continentName, r.Name countryName, l.Name cityName, l.Population FROM city l
    JOIN country r
    ON l.CountryCode=r.Code
    WHERE r.Continent='Asia'
    ORDER BY l.Population DESC
    LIMIT 10;



5. 전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?
(국가명, GNP, 언어명)
SELECT r.Name countryName, l.Name cityName, o.`language` FROM city l
JOIN country r ON l.CountryCode=r.Code
JOIN countrylanguage o ON l.CountryCode=o.CountryCode
WHERE l.Continent='Asia' AND r.IsOfficial='T'
ORDER BY l.Population DESC
LIMIT 10;