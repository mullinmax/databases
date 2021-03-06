CREATE TABLE CUSTOMER (NAME VARCHAR(20), LOYALTYCARDID NUMBER PRIMARY KEY);
INSERT INTO CUSTOMER VALUES ('Carlton', 1);
INSERT INTO CUSTOMER VALUES ('Mark', 2);
INSERT INTO CUSTOMER VALUES ('Joe', 3);
INSERT INTO CUSTOMER VALUES ('Sam', 4);
INSERT INTO CUSTOMER VALUES ('Amy', 5);
INSERT INTO CUSTOMER VALUES ('Sarah', 6);
INSERT INTO CUSTOMER VALUES ('Emma', 7);
INSERT INTO CUSTOMER VALUES ('Brittney', 8);

CREATE TABLE EMPLOYEE (NAME VARCHAR(20), SSN NUMBER PRIMARY KEY);
INSERT INTO EMPLOYEE VALUES ('Michael', 1);
INSERT INTO EMPLOYEE VALUES ('Byron', 2);
INSERT INTO EMPLOYEE VALUES ('Raj', 3);
INSERT INTO EMPLOYEE VALUES ('Qing', 4);
INSERT INTO EMPLOYEE VALUES ('Colleen', 5);
INSERT INTO EMPLOYEE VALUES ('Matthew', 6);
INSERT INTO EMPLOYEE VALUES ('Paul', 7);
INSERT INTO EMPLOYEE VALUES ('Jake', 8);

CREATE TABLE TACO (TACOID NUMBER PRIMARY KEY, WEIGHT NUMBER);
INSERT INTO TACO VALUES (1, 2.1);
INSERT INTO TACO VALUES (2, 2.0);
INSERT INTO TACO VALUES (3, 1.9);
INSERT INTO TACO VALUES (4, 5.0);
INSERT INTO TACO VALUES (5, 2.0);
INSERT INTO TACO VALUES (6, 2.5);
INSERT INTO TACO VALUES (7, 3.0);
INSERT INTO TACO VALUES (8, 2.25);

CREATE TABLE INGREDIENT (NAME VARCHAR(20) PRIMARY KEY, BULKPRICE NUMBER, SERVINGSONHAND NUMBER);
INSERT INTO INGREDIENT VALUES ('Salsa', 0.05, 50);
INSERT INTO INGREDIENT VALUES ('Chicken', 0.10, 1230);
INSERT INTO INGREDIENT VALUES ('Ground Beef', 0.11, 220);
INSERT INTO INGREDIENT VALUES ('Steak Beef', 0.12, 156);
INSERT INTO INGREDIENT VALUES ('Cheese', 0.04, 2350);
INSERT INTO INGREDIENT VALUES ('Sour Cream', 0.03, 2060);
INSERT INTO INGREDIENT VALUES ('Black Beans', 0.02, 400);
INSERT INTO INGREDIENT VALUES ('Pinto Beans', 0.01, 840);
INSERT INTO INGREDIENT VALUES ('Lettus', 0.001, 2400);
INSERT INTO INGREDIENT VALUES ('Corn Tortilla', 0.04, 2560);
INSERT INTO INGREDIENT VALUES ('Corn Shell', 0.05, 2035);
INSERT INTO INGREDIENT VALUES ('Flour Tortilla', 0.09, 20205);

CREATE TABLE TRANSACTION (TRANSID NUMBER PRIMARY KEY, CUSTID NUMBER, EMPID NUMBER, TACOID NUMBER, SALEPRICE NUMBER, DAY DATE, LAT NUMBER, LON NUMBER);
INSERT INTO TRANSACTION VALUES (100, 1, 1, 1, 5.00, to_date('13-JAN-2018', 'DD-MON-YYYY'), 16.52, 52.63);
INSERT INTO TRANSACTION VALUES (101, 2, 2, 2, 6.50, to_date('13-JAN-2018', 'DD-MON-YYYY'), 16.52, 52.63);
INSERT INTO TRANSACTION VALUES (102, 3, 3, 3, 7.15, to_date('14-JAN-2018', 'DD-MON-YYYY'), 19.56, 53.00);
INSERT INTO TRANSACTION VALUES (103, 4, 4, 4, 4.30, to_date('14-JAN-2018', 'DD-MON-YYYY'), 19.56, 53.00);
INSERT INTO TRANSACTION VALUES (104, 5, 5, 5, 5.00, to_date('14-JAN-2018', 'DD-MON-YYYY'), 19.56, 53.00);
INSERT INTO TRANSACTION VALUES (105, 6, 6, 6, 5.50, to_date('14-JAN-2018', 'DD-MON-YYYY'), 19.56, 53.00);
INSERT INTO TRANSACTION VALUES (106, 7, 7, 7, 6.00, to_date('15-JAN-2018', 'DD-MON-YYYY'), 19.56, 53.00);
INSERT INTO TRANSACTION VALUES (107, 8, 8, 8, 7.20, to_date('19-JAN-2018', 'DD-MON-YYYY'), 19.56, 53.00);

CREATE TABLE MADEWITH (TACOID NUMBER, INGREDIENT VARCHAR(20), constraint t_pk primary key (TACOID,INGREDIENT));
INSERT INTO MADEWITH VALUES (1, 'Salsa');
INSERT INTO MADEWITH VALUES (1, 'Chicken');
INSERT INTO MADEWITH VALUES (1, 'Cheese');
INSERT INTO MADEWITH VALUES (1, 'Lettus');
INSERT INTO MADEWITH VALUES (1, 'Corn Tortilla');

INSERT INTO MADEWITH VALUES (2, 'Salsa');
INSERT INTO MADEWITH VALUES (2, 'Ground Beef');
INSERT INTO MADEWITH VALUES (2, 'Cheese');
INSERT INTO MADEWITH VALUES (2, 'Lettus');
INSERT INTO MADEWITH VALUES (2, 'Corn Shell');

INSERT INTO MADEWITH VALUES (3, 'Salsa');
INSERT INTO MADEWITH VALUES (3, 'Chicken');
INSERT INTO MADEWITH VALUES (3, 'Steak Beef');
INSERT INTO MADEWITH VALUES (3, 'Cheese');
INSERT INTO MADEWITH VALUES (3, 'Sour Cream');
INSERT INTO MADEWITH VALUES (3, 'Pinto Beans');
INSERT INTO MADEWITH VALUES (3, 'Lettus');
INSERT INTO MADEWITH VALUES (3, 'Corn Shell');

INSERT INTO MADEWITH VALUES (4, 'Chicken');
INSERT INTO MADEWITH VALUES (4, 'Steak Beef');
INSERT INTO MADEWITH VALUES (4, 'Cheese');
INSERT INTO MADEWITH VALUES (4, 'Sour Cream');
INSERT INTO MADEWITH VALUES (4, 'Black Beans');
INSERT INTO MADEWITH VALUES (4, 'Lettus');
INSERT INTO MADEWITH VALUES (4, 'Corn Tortilla');

INSERT INTO MADEWITH VALUES (5, 'Salsa');
INSERT INTO MADEWITH VALUES (5, 'Chicken');
INSERT INTO MADEWITH VALUES (5, 'Ground Beef');
INSERT INTO MADEWITH VALUES (5, 'Sour Cream');
INSERT INTO MADEWITH VALUES (5, 'Black Beans');
INSERT INTO MADEWITH VALUES (5, 'Pinto Beans');
INSERT INTO MADEWITH VALUES (5, 'Lettus');
INSERT INTO MADEWITH VALUES (5, 'Corn Tortilla');

INSERT INTO MADEWITH VALUES (6, 'Salsa');
INSERT INTO MADEWITH VALUES (6, 'Chicken');
INSERT INTO MADEWITH VALUES (6, 'Ground Beef');
INSERT INTO MADEWITH VALUES (6, 'Steak Beef');
INSERT INTO MADEWITH VALUES (6, 'Cheese');
INSERT INTO MADEWITH VALUES (6, 'Black Beans');
INSERT INTO MADEWITH VALUES (6, 'Pinto Beans');
INSERT INTO MADEWITH VALUES (6, 'Corn Tortilla');

INSERT INTO MADEWITH VALUES (7, 'Salsa');
INSERT INTO MADEWITH VALUES (7, 'Chicken');
INSERT INTO MADEWITH VALUES (7, 'Ground Beef');
INSERT INTO MADEWITH VALUES (7, 'Steak Beef');
INSERT INTO MADEWITH VALUES (7, 'Cheese');
INSERT INTO MADEWITH VALUES (7, 'Black Beans');
INSERT INTO MADEWITH VALUES (7, 'Pinto Beans');
INSERT INTO MADEWITH VALUES (7, 'Lettus');
INSERT INTO MADEWITH VALUES (7, 'Flour Tortilla');

INSERT INTO MADEWITH VALUES (8, 'Salsa');
INSERT INTO MADEWITH VALUES (8, 'Chicken');
INSERT INTO MADEWITH VALUES (8, 'Ground Beef');
INSERT INTO MADEWITH VALUES (8, 'Steak Beef');
INSERT INTO MADEWITH VALUES (8, 'Black Beans');
INSERT INTO MADEWITH VALUES (8, 'Lettus');
INSERT INTO MADEWITH VALUES (8, 'Flour Tortilla');

--select 'drop table '||table_name||' cascade constraints;' from user_tables;