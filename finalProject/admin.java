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
		String query = "SELECT SUM(SALEPRICE), NAME FROM (SELECT * FROM TRANSACTION T, EMPLOYEE E WHERE T.EMPID = E.SSN) GROUP BY EMPID, NAME ORDER BY EMPID";

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
}