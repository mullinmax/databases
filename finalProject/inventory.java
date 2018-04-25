import java.sql.*;
import java.io.*;

class inventory {
	void displayInventory(Connection conn) throws SQLException, IOException {
		String query = "select * from INGREDIENT";
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(query);
		System.out.println("");
		while (rset.next()){
			System.out.printf("%-20s", rset.getString(1));
			System.out.printf("%-6s", rset.getString(2));
			System.out.printf("%-6s", rset.getString(3));
			System.out.println("");
		}
		System.out.println("");
	}

	void receiveShipment(Connection conn, String ingredient, String numServings) throws SQLException, IOException {
		String query = "INSERT INTO INGREDIENT VALUES('" + ingredient + "', 0.05, 5);";
		Statement stmt = conn.createStatement();
		try{
			stmt.executeUpdate(query);
		}catch(SQLException e) {
			System.out.print("Error:");
			while(e != null) {
				System.out.println(e.getMessage());
				e = e.getNextException();
			}
			return;
		}
		System.out.println("Shipment received");
		stmt.close();
	}
}