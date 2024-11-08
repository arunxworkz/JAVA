package com.xworkz.ticketooking.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ticketbooking.dto.TicketBookingDTO;
import com.xworkz.ticketbooking.service.TicketBooking;
import com.xworkz.ticketbooking.service.TicketBookingServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/book")
public class BookingServlet extends HttpServlet{
	
	public BookingServlet() {
		System.out.println("This is booking servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String statiumName = req.getParameter("statiumName");
		String noOfTicket = req.getParameter("noOfTicket");
		String contact = req.getParameter("contact");
		String email = req.getParameter("email");
		
		int tickets = Integer.valueOf(noOfTicket);
		
		TicketBookingDTO ticketBookingDTO = new TicketBookingDTO(statiumName, tickets, contact, email);
		
		TicketBooking ticketBooking = new TicketBookingServiceImpl();
		
		if(ticketBooking.valid(ticketBookingDTO)) {
			req.setAttribute("success", "Success");
			System.out.println("The details are correct, the tickets are booked");
		}else {
			req.setAttribute("failure", "No booking is done");
			req.setAttribute("dto", ticketBookingDTO);
			System.out.println("The details are incorrect, the tickets are not booked");
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/ticketbooking.jsp");
		dispatcher.forward(req, resp);
	}
}
