

//STEP 1. Import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/kirjat";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	public static void tallennaKirja(Kirja opus) {

		String tekij� = opus.getTekija();
		String nimi = opus.getTeoksenNimi();
		int vuosi = opus.getJulkaisuvuosi();

		Connection conn = null;
		Statement stmt = null;
		try {

			System.out.println("Connecting to database...");

			// Luodaan yhteys tietokantaan
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// SQL Lausekkeen esittely, k�ytet��n ? muuttuvien tietojen kohdalla
			String sql = "INSERT INTO kirja (kirjan_nimi, tekij�, julkaisuvuosi) values (?,?,?)";

			// T�ydennet��n SQL-lauseisiin puuttuvat muuttujat
			PreparedStatement preparedStmt = conn.prepareStatement(sql);

			preparedStmt.setString(1, nimi);
			preparedStmt.setString(2, tekij�);
			preparedStmt.setInt(3, vuosi);

			// Suorittaa SQL lauseen

			preparedStmt.execute();

			System.out.println("Saving data...");

		} catch (SQLException se) {
			// K�sitell��n tietokantavirheet
			se.printStackTrace();
		} catch (Exception e) {
			// Muut virheet
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try

	}// end main

	

}