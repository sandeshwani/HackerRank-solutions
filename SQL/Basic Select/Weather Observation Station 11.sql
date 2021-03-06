
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[^AEIOU]' OR
      CITY REGEXP '[^AEIOU]$'
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE NOT ((CITY LIKE '%A' OR CITY LIKE '%E' OR city LIKE '%I' OR CITY LIKE '%O' OR CITY LIKE '%U') AND 
           (CITY LIKE 'A%' OR CITY LIKE 'E%' OR CITY LIKE 'I%' OR CITY LIKE 'O%' OR CITY LIKE 'U%'))
ORDER BY CITY ASC;

/* ANOTHER */
SELECT DISTINCT CITY 
FROM STATION 
WHERE LEFT(CITY,1) NOT IN ('A', 'E', 'I', 'O', 'U') OR
      RIGHT(CITY,1) NOT IN ('A', 'E', 'I', 'O', 'U')
ORDER BY CITY ASC;

/* ANOTHER METHOD */
SELECT DISTINCT CITY 
FROM STATION 
WHERE SUBSTR(CITY,1,1) NOT IN ('A', 'E', 'I', 'O', 'U') OR
      SUBSTR(CITY,LENGTH(CITY),1) NOT IN ('A', 'E', 'I', 'O', 'U')
ORDER BY CITY ASC;