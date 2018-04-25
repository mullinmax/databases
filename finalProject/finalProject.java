import java.io.*; 
import java.sql.*;

class tacoStandDatabase { 

	public static void main (String args []) 
			throws SQLException, IOException { 

		inventory warehouse = new inventory();
		admin office = new admin();
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
			System.out.println(" [1] Display warehouse inventory");
			System.out.println(" [2] Receive shipment to inventory");
			System.out.println(" [3] Send inventory to vendor");
			System.out.println(" [4] Remove ingredient option");
			System.out.println(" [5] Add new ingredient option");
			System.out.println(" [6] Calculate payroll");
			System.out.println(" [7] Show sales for a date");
			System.out.println(" [Q] quit");
			System.out.flush();
			ch = (char) System.in.read();
			ch1 = (char) System.in.read();
			String ingredient;
			String numServings;
			switch (ch) {
				case '1' : 
					warehouse.displayInventory(conn);
					break;
				case '2' : 
					ingredient = readEntry("What ingredient is being received? ");
					numServings = readEntry("how many servings of " + ingredient + "? ");
					warehouse.receiveShipment(conn, ingredient, numServings);
					break;
				case '3':
					ingredient = readEntry("What ingredient is being sent? ");
					numServings = readEntry("how many servings of " + ingredient + "? ");
					warehouse.sendToVendor(conn, ingredient, numServings);
					break;
				case '4':
					ingredient = readEntry("What ingredient would you like to remove? ");
					warehouse.removeOption(conn, ingredient);
					break;
				case '5':
					ingredient = readEntry("What ingredient would you like to add? ");
					String price = readEntry("What is the bulk price of " + ingredient + " per serving? $");
					String quantity = readEntry("How many servings of " + ingredient + " are we starting with? ");
					warehouse.addOption(conn, ingredient, price, quantity);
					break;
				case '6':
					office.commisions(conn);
					break;
				case '7':
					String date = readEntry("What date would you like to see sales for? (DD-MM-YYYY)");
					office.sales(conn, date);
					break;
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