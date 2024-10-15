package com.xworkz.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/order")
public class Company extends HttpServlet{

	public Company() {
		System.out.println("Running the server");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("order.html");
		
		
		/*PrintWriter printWriter = resp.getWriter();
		
		String customerName = req.getParameter("customerName");
		String items = req.getParameter("items");
		String quantity = req.getParameter("quantity");
		
		resp.getWriter().println("Customer name: "+customerName);
		resp.getWriter().println("Item: "+items);
		resp.getWriter().println("Quantity: "+quantity);*/
	}
}
