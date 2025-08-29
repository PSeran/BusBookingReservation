package busReservationdbconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {
	public void  busdatainfo() throws SQLException {
		String query = "Select * from bus";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus No: " + rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("AC: no ");
			else
				System.out.println("AC: yes ");
			System.out.println("Capacity: " + rs.getInt(3));
		}
		
		System.out.println("------------------------------------------");
	}
	
	public int getCapacity(int id) throws SQLException {
		String query = "select capacity from bus where id=" + id;
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
}
















//public void busdatainfo() throws SQLException {
////String query="select * from bus";
//Connection	con=DBConnection.getConnection();
//Statement st=con.createStatement();
//ResultSet rs=st.executeQuery("select * from bus");
//while (rs.next()) {
//System.out.println("bus_id "+rs.getInt(1));
//if (rs.getInt(2)==0) {
//	System.out.println("NO AC");
//}else 
//	System.out.println("yes/ ac avalable");
//System.out.println("Capacity "+rs.getInt(3));
//}
//
//}
//public int getCapacity(int id) throws SQLException {
//Connection con = DBConnection.getConnection();
//Statement st = con.createStatement();
//ResultSet rs = st.executeQuery("Select capacity from bus where id=" + id);
//rs.next();
//return rs.getInt(id);
//}