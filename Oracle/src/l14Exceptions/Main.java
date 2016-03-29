package l14Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/*
	 * 3 kinds of exception: 1. checked exception 2. error exception 3. runtime
	 * exception
	 */

	private List<Integer> list;
	private static final int SIZE = 10;

	// List of numbers
	public Main() {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}
	}

	public void writeList() {
		// The FileWriter constructor throws IOException, which must be caught.
		PrintWriter out = null;
		try {
			System.out.println("Usao u try");
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			for (int i = 0; i < SIZE; i++) {
				// The get(int) method throws IndexOutOfBoundsException, which
				// must be caught.
				out.println("Value at: " + i + " = " + list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("IOException: " + e.getMessage());
		}
		/*
		 * catch (IOException|SQLException ex) { 
		 * logger.log(ex); 							if you have two arguments in exception,
		 * throw ex; 							catch parameter is final, and you cant put any values in block }
		 */

		// runtime system always executes finally block
		finally { // best practice is to put finally block because resources can
					// leak
			if (out != null) { // best posible reason
				System.out.println("Closing PrintWriter.");
				out.close();
			} else {
				System.out.println("PrintWriter not opened.");
			}
		}

	}

	// try with resources statment
	static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	// try with finally block
	static String readFirstLineFromFileWithFinallyBlock(String path)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			if (br != null)
				br.close();
		}
	}
	//try with SQL exception
	public static void viewTable(Connection con) throws IOException {

		String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

		try (Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String coffeeName = rs.getString("Cof_Name");
				int supplierID = rs.getInt("SUP_ID");
				float price = rs.getFloat("PRICE");
				int sales = rs.getInt("SALES");
				int total = rs.getInt("TOTAL");

				System.out.println(coffeeName + ", " + supplierID + ", "
						+ price + ", " + sales + ", " + total);
			}
		} catch (SQLException e) {
			System.out.println("JDBCTutorialUtilities.printSQLException(e);");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
