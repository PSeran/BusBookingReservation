package busBook;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusReserDriver {

	public static void main(String[] args) throws ParseException {
		Scanner s=new Scanner(System.in);
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<BookingBus> bokbus=new ArrayList<BookingBus>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,2));
		buses.add(new Bus(3,true,2));
		for (Bus b : buses) {
			b.busdatainfo();
		}
		char yn='y';
		while(yn=='y') {
			System.out.println("you want to booking bus 1 or 2 exit");
			char condition=s.next().charAt(0);
					System.out.println(condition);
			if (condition=='y') {
				BookingBus bookb=new BookingBus(); 
				if (bookb.isAvalable(buses,bokbus)) {
					bokbus.add(bookb);
					System.out.println("booking is completed enjoy your jorney");
				}
				
			}
			else
				yn='n';
			System.out.println("thank you i'm wait you one's viset");
		}
	}

}
