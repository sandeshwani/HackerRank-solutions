/*
Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:

Station.jpg

where LAT_N is the northern latitude and LONG_W is the western longitude.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[^AEIOU]' AND
      CITY REGEXP '[^AEIOU]$'
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE NOT ((CITY LIKE '%A' OR CITY LIKE '%E' OR city LIKE '%I' OR CITY LIKE '%O' OR CITY LIKE '%U') OR 
           (CITY LIKE 'A%' OR CITY LIKE 'E%' OR CITY LIKE 'I%' OR CITY LIKE 'O%' OR CITY LIKE 'U%'))
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE LEFT(CITY,1) NOT IN ('A', 'E', 'I', 'O', 'U') AND
      RIGHT(CITY,1) NOT IN ('A', 'E', 'I', 'O', 'U')
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE SUBSTR(CITY,1,1) NOT IN ('A', 'E', 'I', 'O', 'U') AND
      SUBSTR(CITY,LENGTH(CITY),1) NOT IN ('A', 'E', 'I', 'O', 'U')
ORDER BY CITY ASC;