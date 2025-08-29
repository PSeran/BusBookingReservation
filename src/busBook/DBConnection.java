package busReservationdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static String url="jdbc:mysql://localhost:3306/busreservation";
	private static String username="root";
	private static String passWord="RootTest1";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,username,passWord);
	
	}
}
