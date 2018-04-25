import java.sql.*;
import java.io.*;

class admin {
	void customerLoyalty(Connection conn) throws SQLException, IOException {
		String query = "SELECT SUM(SALEPRICE), NAME FROM (SELECT * FROM TRANSACTION T, CUSTOMER C WHERE T.CUSTID = C.LOYALTYCARDID) GROUP BY SALEPRICE, NAME ORDER BY SALEPRICE";

		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(query);
		System.out.println("");
		while (rset.next()){
			System.out.printf("%-20s", rset.getString(1));
			System.out.printf("%-20s", rset.getString(2));
			System.out.println("");
		}
		System.out.println("");
	}

	void salesReport(Connection conn) throws SQLException, IOException {
		String query = "SELECT SUM(P.PRICE), SUM(T.SALEPRICE), E.NAME, (SUM(P.PRICE)-SUM(T.SALEPRICE)) FROM EMPLOYEE E, TRANSACTION T, (SELECT SUM(I.BULKPRICE) AS PRICE, M.TACOID FROM INGREDIENT I, MADEWITH M WHERE I.NAME = M.INGREDIENT GROUP BY M.TACOID) P WHERE P.TACOID = T.TACOID AND E.SSN = T.EMPID GROUP BY E.NAME, E.SSN";

		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(query);
		System.out.println("");
		while (rset.next()){
			System.out.printf("%-20s", rset.getString(1));
			System.out.printf("%-20s", rset.getString(2));
			System.out.printf("%-20s", rset.getString(3));
			System.out.printf("%-20s", rset.getString(4));
			System.out.println("");
		}
		System.out.println("");
	}
}