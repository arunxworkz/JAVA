package com.xworkz.ticketbooking.repo;

import com.xworkz.ticketbooking.dto.TicketBookingDTO;

public class TicketRepositoryImpl implements TicketRepository{

	@Override
	public int save(TicketBookingDTO ticketBookingDTO) {
		System.out.println("This is repositoty");
		return 0;
	}

}
