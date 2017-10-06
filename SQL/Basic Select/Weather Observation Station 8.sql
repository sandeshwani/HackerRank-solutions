/*
Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:

Station.jpg

where LAT_N is the northern latitude and LONG_W is the western longitude.
*/

SELECT DISTINCT CITY
FROM STATION
WHERE CITY LIKE 'A%' AND (CITY LIKE '%A' OR CITY LIKE '%E' OR CITY LIKE '%I' OR CITY LIKE '%O' OR CITY LIKE '%U') OR
      CITY LIKE 'E%' AND (CITY LIKE '%A' OR CITY LIKE '%E' OR CITY LIKE '%I' OR CITY LIKE '%O' OR CITY LIKE '%U') OR 
      CITY LIKE 'I%' AND (CITY LIKE '%A' OR CITY LIKE '%E' OR CITY LIKE '%I' OR CITY LIKE '%O' OR CITY LIKE '%U') OR
      CITY LIKE 'O%' AND (CITY LIKE '%A' OR CITY LIKE '%E' OR CITY LIKE '%I' OR CITY LIKE '%O' OR CITY LIKE '%U') OR
      CITY LIKE 'U%' AND (CITY LIKE '%A' OR CITY LIKE '%E' OR CITY LIKE '%I' OR CITY LIKE '%O' OR CITY LIKE '%U')      
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[AEIOU]' AND
      CITY REGEXP '[AEIOU]$'
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY
FROM STATION
WHERE LOWER(SUBSTR(CITY,1,1)) IN ('a', 'e', 'i', 'o', 'u') AND
      LOWER(SUBSTR(CITY,LENGTH(CITY),1)) IN ('a', 'e', 'i', 'o', 'u')
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY
FROM STATION
WHERE LEFT(CITY,1) IN ('A', 'E', 'I', 'O', 'U') AND
      RIGHT(CITY,1) IN ('A', 'E', 'I', 'O', 'U')
ORDER BY CITY ASC;

