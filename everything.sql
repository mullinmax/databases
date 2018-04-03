SELECT * FROM CUSTOMER;
SELECT * FROM EMPLOYEE;
SELECT * FROM TACO;
SELECT * FROM INGREDIENT;
SELECT * FROM TRANSACTION;
SELECT * FROM MADEWITH;

/*
SQL> @everything.sql

NAME                 LOYALTYCARDID
-------------------- -------------
Carlton                          1
Mark                             2
Joe                              3
Sam                              4
Amy                              5
Sarah                            6
Emma                             7
Brittney                         8

8 rows selected.


NAME                        SSN
-------------------- ----------
Michael                       1
Byron                         2
Raj                           3
Qing                          4
Colleen                       5
Matthew                       6
Paul                          7
Jake                          8

8 rows selected.


    TACOID     WEIGHT
---------- ----------
         1        2.1
         2          2
         3        1.9
         4          5
         5          2
         6        2.5
         7          3
         8       2.25

8 rows selected.


NAME                  BULKPRICE SERVINGSONHAND
-------------------- ---------- --------------
Salsa                       .05           2000
Chicken                      .1           2000
Ground Beef                 .11           2000
Steak Beef                  .12           2000
Cheese                      .04           2000
Sour Cream                  .03           2000
Black Beans                 .02           2000
Pinto Beans                 .01           2000
Lettus                     .001           2000
Corn Tortilla               .04           2000
Corn Shell                  .05           2000

NAME                  BULKPRICE SERVINGSONHAND
-------------------- ---------- --------------
Flour Tortilla              .09           2000

12 rows selected.


    TRANSID     CUSTID      EMPID     TACOID  SALEPRICE DAY              LAT
---------- ---------- ---------- ---------- ---------- --------- ----------
       LON
----------
       100          1          1          1          5 13-JAN-18      16.52
     52.63

       101          2          2          2        6.5 13-JAN-18      16.52
     52.63

       102          3          3          3       7.15 14-JAN-18      19.56
        53


    TRANSID     CUSTID      EMPID     TACOID  SALEPRICE DAY              LAT
---------- ---------- ---------- ---------- ---------- --------- ----------
       LON
----------
       103          4          4          4        4.3 14-JAN-18      19.56
        53

       104          5          5          5          5 14-JAN-18      19.56
        53

       105          6          6          6        5.5 14-JAN-18      19.56
        53


    TRANSID     CUSTID      EMPID     TACOID  SALEPRICE DAY              LAT
---------- ---------- ---------- ---------- ---------- --------- ----------
       LON
----------
       106          7          7          7          6 15-JAN-18      19.56
        53

       107          8          8          8        7.2 19-JAN-18      19.56
        53


8 rows selected.


    TACOID INGREDIENT
---------- --------------------
         1 Cheese
         1 Chicken
         1 Corn Tortilla
         1 Lettus
         1 Salsa
         2 Cheese
         2 Corn Shell
         2 Ground Beef
         2 Lettus
         2 Salsa
         3 Cheese

    TACOID INGREDIENT
---------- --------------------
         3 Chicken
         3 Corn Shell
         3 Lettus
         3 Pinto Beans
         3 Salsa
         3 Sour Cream
         3 Steak Beef
         4 Black Beans
         4 Cheese
         4 Chicken
         4 Corn Tortilla

    TACOID INGREDIENT
---------- --------------------
         4 Lettus
         4 Sour Cream
         4 Steak Beef
         5 Black Beans
         5 Chicken
         5 Corn Tortilla
         5 Ground Beef
         5 Lettus
         5 Pinto Beans
         5 Salsa
         5 Sour Cream

    TACOID INGREDIENT
---------- --------------------
         6 Black Beans
         6 Cheese
         6 Chicken
         6 Corn Tortilla
         6 Ground Beef
         6 Pinto Beans
         6 Salsa
         6 Steak Beef
         7 Black Beans
         7 Cheese
         7 Chicken

    TACOID INGREDIENT
---------- --------------------
         7 Flour Tortilla
         7 Ground Beef
         7 Lettus
         7 Pinto Beans
         7 Salsa
         7 Steak Beef
         8 Black Beans
         8 Chicken
         8 Flour Tortilla
         8 Ground Beef
         8 Lettus

    TACOID INGREDIENT
---------- --------------------
         8 Salsa
         8 Steak Beef
*/