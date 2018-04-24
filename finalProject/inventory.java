import java.sql.*; 
import java.io.*; 

class inventory { 
  void displayInventory(Connection conn) throws SQLException, IOException {
    String query = "select * from INGEEDIENT";
    Statement stmt = conn.createStatement();
    ResultSet rset = stmt.executeQuery(query);
    System.out.println("");
    while (rset.next ()) { 
      System.out.println(rset.getString(1) + "   " + rset.getString(2) + "   " + rset.getString(3));
    } 
    System.out.println("");
  }
}