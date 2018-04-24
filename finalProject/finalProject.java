/****************************************************************/
/* GradeBook Application Main class (Section 5.6)               */
/* Needs grade1.java and grade2.java to be compiled             */
/* Chapter 5; Oracle Programming -- A Primer                    */
/*            by R. Sunderraman                                 */
/****************************************************************/

import java.io.*; 
import java.sql.*;

class tacoStandDatabase { 

  public static void main (String args []) 
      throws SQLException, IOException { 

    inventory warehouse = new inventory();
    boolean done;
    char ch,ch1;
    byte num = 0;

    try {
      Class.forName ("oracle.jdbc.driver.OracleDriver");
    } catch (ClassNotFoundException e) {
        System.out.println ("Could not load the driver");
        return;
      }
    String user, pass;
    user = readEntry("userid  : ");
    pass = readEntry("password: ");

    //  The following line was modified by Prof. Marling to work on prime

    Connection conn = DriverManager.getConnection
       ("jdbc:oracle:thin:@deuce.cs.ohiou.edu:1521:class", user, pass);

    done = false;
    do {
      System.out.println("Welcome to the Taco Stand Database. Please select a task:");
      System.out.println(" - Display warehouse inventory (1):");
      System.out.flush();
      ch = (char) System.in.read();
      ch1 = (char) System.in.read();
      switch (ch) {
        case '1' : warehouse.displayInventory(conn);
                   break;
        case '2' : warehouse.add_course(conn);
                   break;
        case '3' : warehouse.add_students(conn);
                   break;
        case '4' : warehouse.select_course(conn);
                   break;
        case 'q' : done = true;
                   break;
        default  : System.out.println("Type in option again");
      }
    } while (!done);

    conn.close();
  }

  //readEntry function -- to read input string
  static String readEntry(String prompt) {
     try {
       StringBuffer buffer = new StringBuffer();
       System.out.print(prompt);
       System.out.flush();
       int c = System.in.read();
       while(c != '\n' && c != -1) {
         buffer.append((char)c);
         c = System.in.read();
       }
       return buffer.toString().trim();
     } catch (IOException e) {
       return "";
       }
   }
} 