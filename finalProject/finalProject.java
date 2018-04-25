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
		user = readEntry("userid	: ");
		pass = readEntry("password: ");

		//	The following line was modified by Prof. Marling to work on prime

		Connection conn = DriverManager.getConnection
			("jdbc:oracle:thin:@deuce.cs.ohiou.edu:1521:class", user, pass);

		done = false;
		do {
			System.out.println("Welcome to the Taco Stand Database. Please select a task:");
			System.out.println(" - Display warehouse inventory (1):");
      System.out.println(" - Receive shipment to inventory (2):");
			System.out.flush();
			ch = (char) System.in.read();
			ch1 = (char) System.in.read();
			switch (ch) {
				case '1' : 
					warehouse.displayInventory(conn);
					break;
				case '2' : 
					String ingredient = readEntry("What ingredient is being received? ");
					String numServings = readEntry("how many servings of " + ingredient + "? ");
					warehouse.receiveShipment(conn, ingredient, numServings);
				case 'q' : done = true;
									break;
				default	: System.out.println("Type in option again");
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