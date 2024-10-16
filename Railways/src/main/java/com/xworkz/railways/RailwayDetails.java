package com.xworkz.railways;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/booking")
public class RailwayDetails extends HttpServlet{

	public RailwayDetails() {
		System.out.println("This is railway booking details");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		
		PrintWriter printWriter = resp.getWriter();
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");
		String startDate = req.getParameter("startDate");
		String returnDate = req.getParameter("returnDate");
		String seatType = req.getParameter("seatType");
		String numberOfTickets = req.getParameter("numberOfTickets");
		String numberOfMales = req.getParameter("numberOfMales");
		String numberOfFemales = req.getParameter("numberOfFemales");
		
		resp.getWriter().println("First name: "+ firstName);
		resp.getWriter().println("Last name: "+ lastName);
		resp.getWriter().println("Email: "+ email);
		resp.getWriter().println("Source: "+ source);
		resp.getWriter().println("Destination: "+ destination);
		resp.getWriter().println("Start Date: "+ startDate);
		resp.getWriter().println("Return Date: "+ returnDate);
		resp.getWriter().println("Seat Type: "+ seatType);
		resp.getWriter().println("Number of Tickets: "+ numberOfTickets);
		resp.getWriter().println("Number of Males: "+ numberOfMales);
		resp.getWriter().println("Number of Females: "+ numberOfFemales);
		
	}
	
}
