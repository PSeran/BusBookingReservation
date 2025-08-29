package busReservationdbconnection;

import java.sql.SQLException;
import java.util.Scanner;

public class BusReserDriver {

	public static void main(String[] args) throws SQLException {
		try {
			BusDAO busdao=new BusDAO();
			busdao.busdatainfo();
			
			int userOpt = 1;
			Scanner scanner = new Scanner(System.in);
					
			while(userOpt==1) {
				System.out.println("Enter 1 to Book and 2 to exit");
				userOpt = scanner.nextInt();
//				System.out.println(userOpt);
				if(userOpt == 1) {
					BookingBus booking = new BookingBus();
					System.out.println("booking bus called");
					if(booking.isAvailable()) {
						System.out.println("is avalable method called");  //it is not work
						BookingDAO bookingdao = new BookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("Your booking is confirmed");
					}
					else {
						System.out.println("bus seets not avalable");
					}
					
				}
				else {
					System.out.println("Sorry. Bus is full. Try another bus or date.");
				}
			}
			scanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
