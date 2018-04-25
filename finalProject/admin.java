import java.sql.*;
import java.io.*;

class admin {
	void commisions(Connection conn) throws SQLException, IOException {
		/*String query = "DELETE INGREDIENT WHERE NAME = '" + ingredient + "'";
		try{
			stmt.executeUpdate(query);
		}catch(SQLException e) {
			System.out.print("Statement Error:");
			while(e != null) {
				System.out.println(e.getMessage());
				e = e.getNextException();
			}
			return;
		}
		System.out.println("Ingredient removed");
		stmt.close();*/
	}

	void sales(Connection conn, String date) throws SQLException, IOException {
		String query = "select * from TRANSACTION where DAY = '" + date + "'";
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(query);
		System.out.println("");
		while (rset.next()){
			System.out.printf("%-20s", rset.getString(1));
			System.out.printf("%-6s", rset.getString(2));
			System.out.printf("%-6s", rset.getString(3));
			System.out.printf("%-6s", rset.getString(4));
			System.out.printf("%-6s", rset.getString(5));
			System.out.printf("%-6s", rset.getString(6));
			System.out.printf("%-6s", rset.getString(7));
			System.out.printf("%-6s", rset.getString(8));
			System.out.println("");
		}
		System.out.println("");
	}
}