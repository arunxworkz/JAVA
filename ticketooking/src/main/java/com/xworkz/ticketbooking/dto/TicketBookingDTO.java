package com.xworkz.ticketbooking.dto;

import java.io.Serializable;

public class TicketBookingDTO implements Serializable{
	
	String statiumName;
	int noOfTicket;
	String contact;
	String email;
	
	public TicketBookingDTO(String statiumName, int noOfTicket, String contact, String email) {
		this.statiumName = statiumName;
		this.noOfTicket = noOfTicket;
		this.contact = contact;
		this.email = email;
	}

	public String getStatiumName() {
		return statiumName;
	}

	public void setStatiumName(String statiumName) {
		this.statiumName = statiumName;
	}

	public int getNoOfTicket() {
		return noOfTicket;
	}

	public void setNoOfTicket(int noOfTicket) {
		this.noOfTicket = noOfTicket;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
