/*
Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.

Input Format

The CITY and COUNTRY tables are described as follows: CITY.jpg

Country.jpg
*/


SELECT SUM(C.POPULATION)
FROM CITY C
INNER JOIN COUNTRY Y 
ON C.COUNTRYCODE = Y.CODE AND Y.CONTINENT = 'ASIA';

/* ALMOST SAME */
SELECT SUM(CITY.POPULATION) 
FROM CITY, COUNTRY
WHERE CITY.COUNTRYCODE = COUNTRY.CODE AND COUNTRY.CONTINENT = 'Asia';

/* I THINK PERFORMANCE OF PREVIOUS QUERY WILL BE BETTER THAN THIS */
SELECT SUM(POPULATION) 
FROM CITY 
WHERE COUNTRYCODE IN
(SELECT CODE FROM COUNTRY WHERE CONTINENT = 'Asia')


/*Using where condition, dont known about the performance*/
select Sum(c.population)
from city c inner join country t on c.countrycode = t.code
where continent = 'asia';