-- lists the names of all the people who bought tacos on January 13th of 2018

SELECT C.NAME
FROM TRANSACTION T, CUSTOMER C
WHERE LOYALTYCARDID = CUSTID and T.DAY = '13-JAN-2018';

/* OUTPUT

SQL> @q2.sql

NAME
--------------------
Carlton
Mark

*/