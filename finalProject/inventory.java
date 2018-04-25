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
      System.out.printf("%10s", rset.getString(2));
      System.out.printf("%10s", rset.getString(3));
      System.out.println("");
    }
    System.out.println("");
  }
}