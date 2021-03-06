/*
Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:

Station.jpg

where LAT_N is the northern latitude and LONG_W is the western longitude.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE CITY LIKE 'A%' OR 
      CITY LIKE 'E%' OR 
      CITY LIKE 'I%' OR 
      CITY LIKE 'O%' OR 
      CITY LIKE 'U%'
ORDER BY CITY ASC;

/*ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE CITY REGEXP '^[AEIOU]' OR
      CITY REGEXP '^[aeiou]'
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE LOWER(SUBSTR(CITY,1,1)) IN ('a', 'e', 'i', 'o', 'u')
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE LEFT(CITY,1) IN ('a', 'e', 'i', 'o', 'u')
ORDER BY CITY ASC;