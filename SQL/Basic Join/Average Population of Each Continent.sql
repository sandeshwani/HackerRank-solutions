/*
Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent) and their respective average city populations (CITY.Population) rounded down to the nearest integer.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns. Do not include continents without cities in your output.

Input Format

The CITY and COUNTRY tables are described as follows: CITY.jpg

Country.jpg
*/

SELECT Y.CONTINENT, FLOOR(AVG(C.POPULATION))
FROM COUNTRY Y 
INNER JOIN CITY C ON Y.CODE = C.COUNTRYCODE
GROUP BY Y.CONTINENT ASC;