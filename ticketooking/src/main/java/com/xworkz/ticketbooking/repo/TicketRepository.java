package com.xworkz.ticketbooking.repo;

import com.xworkz.ticketbooking.dto.TicketBookingDTO;

public interface TicketRepository {
	public int save(TicketBookingDTO ticketBookingDTO);
}
