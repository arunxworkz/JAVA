package com.xworkz.ticketbooking.service;

import com.xworkz.ticketbooking.dto.TicketBookingDTO;
import com.xworkz.ticketbooking.repo.TicketRepository;
import com.xworkz.ticketbooking.repo.TicketRepositoryImpl;


public class TicketBookingServiceImpl implements TicketBooking {

	@Override
	public boolean valid(TicketBookingDTO ticketBookingDTO) {

		boolean valid = true;

		if (ticketBookingDTO == null) {
			System.out.println("Reference is null");
			return valid = false;
		}

		if (ticketBookingDTO.getNoOfTicket() > 2) {
			System.out.println("Ticket are confirmed");
			return valid = true;
		}

		if (ticketBookingDTO.getEmail() != null && ticketBookingDTO.getEmail().contains("@")
				&& ticketBookingDTO.getEmail().endsWith(".com")) {
			System.out.println("Provide the correcnt email id");
			return valid = true;
		}

		if(valid) {
			System.out.println("Saving the data");
			TicketRepository ticketRepository = new TicketRepositoryImpl();
			int value = ticketRepository.save(ticketBookingDTO);
			if(value > 0) {
				System.out.println("Saved");
				valid = true;
			}else {
				System.out.println("not savde");
				valid = false;
			}
		}
		return valid;
	}

}
