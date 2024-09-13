package com.xworkz.serviceprovider.internal;

public class MovieBookingProvider extends BookingProvider{

	int noOfTickets;
	
	public MovieBookingProvider(String name, String ceoName) {
	super(name, ceoName);
	}
	
	@Override
	public void service(String sreviceNAme) {
		System.out.println("The sevice provider is: "+sreviceNAme);
	}
	
	public void book(int noOfTickets) {
		this.noOfTickets = noOfTickets;
		System.out.println("The number of tickets booked are: "+noOfTickets);
	}
	
	public void cancle(int noOfTickets) {
		this.noOfTickets -= noOfTickets;
		System.out.println(noOfTickets+" tickets are cancled");
		System.out.println("Remaining teckets are: "+noOfTickets);
	}
	
}
