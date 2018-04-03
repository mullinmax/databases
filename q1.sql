-- lists the names of every customer the bought a taco with chicken and what they paid for it

SELECT C.NAME, T.SALEPRICE
FROM CUSTOMER C, TRANSACTION T, TACO, MADEWITH M
WHERE	C.LOYALTYCARDID = T.CUSTID and 
		T.TACOID = TACO.TACOID and 
		TACO.TACOID = M.TACOID and
		M.INGREDIENT = 'Chicken';

/*
SQL> @q1.sql

NAME                  SALEPRICE
-------------------- ----------
Carlton                       5
Joe                        7.15
Sam                         4.3
Amy                           5
Sarah                       5.5
Emma                          6
Brittney                    7.2

7 rows selected.

*/