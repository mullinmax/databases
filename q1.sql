-- lists the names of every customer the bought a taco with chicken and what they paid for it

SELECT C.NAME T.SALEPRICE
FROM CUSTOMER C, TRANSACTION T, TACO, MADEWITH M
WHERE	C.LOYALTYCARDID = T.CUSTID and 
		T.TACOID = TACO.TACOID and 
		TACO.TACOID = M.TACOID and
		M.INGREDIENT = 'Chicken';