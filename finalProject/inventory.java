import java.sql.*;
import java.io.*;

class inventory {
  void displayInventory(Connection conn) throws SQLException, IOException {
    String query = "select * from INGREDIENT";
    Statement stmt = conn.createStatement();
    ResultSet rset = stmt.executeQuery(query);
    System.out.println("");
    while (rset.next()){
      System.out.println(rset.getString(1));
    }
  }
}