package busReservationdbconnection;

import java.util.Date;
import java.sql.*;

public class BookingDAO {

	public int getBookedCount(int busno,Date date) throws SQLException{
		
//		String query = "select count(passenger_name) from booking where bus_no=? and travel_date=?";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement("select count(passenger_name) from booking where bus_no=? and travel_date=?");
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		System.out.println("bus no "+rs.getInt(1));
		return rs.getInt(1);
	}
	
	public void addBooking(BookingBus booking) throws SQLException{
		String query = "Insert into booking values(?,?,?)";
		Connection con = DBConnection.getConnection();
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, booking.passangerName);
		pst.setInt(2, booking.busNo);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
		
	}
}
