package busReservationdbconnection;

import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat; 

public class BookingBus {
	 String passangerName;
	 int busNo;
	 Date date;

	
	  BookingBus()
	  {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		passangerName=sc.next();
		System.out.println("enter booking bus number");
		busNo=sc.nextInt();
		System.out.println("give the dd-MM-yyyy");
		String dateInput=sc.next();
		SimpleDateFormat dateformate=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(passangerName+ " "+busNo);
		
		try {
			date = dateformate.parse(dateInput);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	 }

	  	public boolean isAvailable()  throws SQLException{
	  		
	  		BusDAO busdao = new BusDAO();
	  		int capacity = busdao.getCapacity(busNo);
//	  		int capacity=BusDAO.getCapacity(busNo)
	  		System.out.println("capacity-->"+capacity);
	  		
	  		BookingDAO bookingdao = new BookingDAO();

	  		int booked = bookingdao.getBookedCount(busNo,date);
	  		System.out.println("booked-->"+booked);
	  		
	  		return booked<capacity;
	  		
	  	}
	
}
