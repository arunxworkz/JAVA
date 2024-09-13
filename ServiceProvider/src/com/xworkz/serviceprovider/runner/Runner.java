package com.xworkz.serviceprovider.runner;

import com.sun.net.ssl.internal.ssl.Provider;
import com.xworkz.serviceprovider.internal.BookingProvider;
import com.xworkz.serviceprovider.internal.DellProvider;
import com.xworkz.serviceprovider.internal.InternetProvider;
import com.xworkz.serviceprovider.internal.MovieBookingProvider;

public class Runner {

	public static void main(String[] args) {
		
		BookingProvider bookingProvider = new BookingProvider("BookMyShow", "Vinay");
		bookingProvider.service("Bookin options");
		bookingProvider.toString();
		
		System.out.println("=======================================================");
		
		DellProvider dellProvider = new DellProvider("DELL", "Michael S. Dell");
		dellProvider.service("Laptop service");
		dellProvider.toString();
		
		System.out.println("=======================================================");
		
		InternetProvider internetProvider = new InternetProvider("JIO", "Mukesh Ambani");
		internetProvider.service("internet");
		internetProvider.toString();
		
		System.out.println("=======================================================");
		
		MovieBookingProvider movieBookingProvider = new MovieBookingProvider("Ticket booking application", "Ashish Hemrajani");
		movieBookingProvider.service("Booking the tickets");
		movieBookingProvider .toString();
		movieBookingProvider.book(5);
		movieBookingProvider.cancle(3);
	}
	
	
}
