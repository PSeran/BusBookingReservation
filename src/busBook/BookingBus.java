package busBook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookingBus {
	private String pasangerName;
	private int busno;
	Date date;
//	public BookingBus(String pasangerName, int busno, Date date) {
//		super();
//		this.pasangerName = pasangerName;
//		this.busno = busno;
//		this.date = date;
//	}
	Scanner sc=new Scanner(System.in);
	      BookingBus() throws ParseException {
		System.out.println("enter your name");
		String pasangerName=sc.nextLine();
		System.out.println("enter booking bus number");
		int busno=sc.nextInt();
		System.out.println("give the dd-MM-yyyy");
		String dateInput=sc.next();
		SimpleDateFormat dateformate=new SimpleDateFormat("dd-MM-yyyy");
		date=dateformate.parse(dateInput);
	}
	      int capacity=0;
		public boolean isAvalable(ArrayList<Bus> buses, ArrayList<BookingBus> bokbus) {
			for(Bus bus:buses) {
				if(bus.getBusNo()==busno) 
					capacity=bus.getCapacity();
			}
			int booked=0;
			for (BookingBus bookingBus : bokbus) {
				if(bookingBus.busno==busno && bookingBus.date.equals(date));
				booked++;
					
			}
			return booked<capacity?true:false;
//			return true;
		}
	
}
