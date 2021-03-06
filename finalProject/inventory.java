import java.sql.*;
import java.io.*;

class inventory {
	void displayInventory(Connection conn) throws SQLException, IOException {
		String query = "select * from INGREDIENT";
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(query);
		System.out.println(" Ingredient name | Price per serving | Servings on hand");
		while (rset.next()){
			System.out.printf("%16s", rset.getString(1));
			System.out.print("    ");
			System.out.printf("%-19s", rset.getString(2));
			System.out.printf("%-6s", rset.getString(3));
			System.out.println("");
		}
		System.out.println("");
	}

	void receiveShipment(Connection conn, String ingredient, String numServings) throws SQLException, IOException {
		
		String query1 = "select * from INGREDIENT where NAME = '" + ingredient + "'";
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(query1);

		rset.next();
		Double price = new Double(rset.getString(2)).doubleValue();
		Double servingsOnHand = new Double(rset.getString(3)).doubleValue();
		servingsOnHand += new Double(numServings).doubleValue();
		
		String query2 = "UPDATE INGREDIENT SET BULKPRICE = '"+Double.toString(price)+"', SERVINGSONHAND = '" +Double.toString(servingsOnHand)+ "' WHERE NAME = '" + ingredient + "'";
		try{
			stmt.executeUpdate(query2);
		}catch(SQLException e) {
			System.out.print("Statement Error:");
			while(e != null) {
				System.out.println(e.getMessage());
				e = e.getNextException();
			}
			return;
		}
		System.out.println("Shipment received");
		stmt.close();
	}

	void sendToVendor(Connection conn, String ingredient, String numServings) throws SQLException, IOException {
		
		String query1 = "select * from INGREDIENT where NAME = '" + ingredient + "'";
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(query1);

		rset.next();
		Double price = new Double(rset.getString(2)).doubleValue();
		Double servingsOnHand = new Double(rset.getString(3)).doubleValue();
		servingsOnHand -= new Double(numServings).doubleValue();
		System.out.println("Query 1 completed");

		String query2 = "UPDATE INGREDIENT SET BULKPRICE = '"+Double.toString(price)+"', SERVINGSONHAND = '" +Double.toString(servingsOnHand)+ "' WHERE NAME = '" + ingredient + "'";
		try{
			stmt.executeUpdate(query2);
		}catch(SQLException e) {
			System.out.print("Statement Error:");
			while(e != null) {
				System.out.println(e.getMessage());
				e = e.getNextException();
			}
			return;
		}
		System.out.println("Ingredient sent");
		stmt.close();
	}

	void removeOption(Connection conn, String ingredient) throws SQLException, IOException {
		String query = "DELETE INGREDIENT WHERE NAME = '" + ingredient + "'";
		Statement stmt = conn.createStatement();
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
		stmt.close();
	}

	void addOption(Connection conn, String ingredient, String price, String quantity) throws SQLException, IOException {
		String query = "INSERT INTO INGREDIENT VALUES ('" + ingredient + "', " + price + ", " + quantity + ")";
		Statement stmt = conn.createStatement();
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
		System.out.println("Ingredient added");
		stmt.close();
	}
}