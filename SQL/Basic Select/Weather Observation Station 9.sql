/*
Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:
*/
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[^AEIOU]' OR
      CITY REGEXP '^[^aeiou]'
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY
FROM STATION
WHERE CITY NOT LIKE ('A%') AND
      CITY NOT LIKE ('E%') AND 
      CITY NOT LIKE ('I%') AND
      CITY NOT LIKE ('O%') AND
      CITY NOT LIKE ('U%')
ORDER BY CITY ASC;


/* ANOTHER METHOD */
SELECT DISTINCT CITY
FROM STATION
WHERE LOWER(SUBSTR(CITY,1,1)) NOT IN ('a', 'e', 'i', 'o', 'u')
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE LEFT(CITY,1) NOT IN ('A', 'E', 'I', 'O', 'U') 
ORDER BY CITY ASC;
