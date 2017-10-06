/*
A median is defined as a number separating the higher half of a data set from the lower half. Query the median of the Northern Latitudes (LAT_N) from STATION and round your answer to  decimal places.

Note: Oracle solutions are not permitted for this challenge.

Input Format

The STATION table is described as follows:

Station.jpg

where LAT_N is the northern latitude and LONG_W is the western longitude.
*/



/* As declared variable cant be used directly in offset we have to use prepare statement and execute it using the declared variable */

SET @V1:= (SELECT COUNT(LAT_N) FROM STATION);
SELECT FLOOR(@V1/2) INTO @V2;
SET @V3=@V2+1;

PREPARE STMT FROM 'SELECT CASE 
        WHEN (@V1 MOD 2) =0 THEN (SELECT ROUND(AVG((LAT_N)),4) FROM (SELECT LAT_N FROM STATION ORDER BY LAT_N ASC LIMIT 2 OFFSET ?) S)
        ELSE ROUND((SELECT LAT_N FROM STATION ORDER BY LAT_N ASC LIMIT 1 OFFSET ?), 4)
        END
        ';
EXECUTE STMT USING @V3,@V2 ;



