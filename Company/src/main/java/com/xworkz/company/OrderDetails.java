package com.xworkz.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/orderDetails")
/*the urlPattren takes the values from the order html page, which is the value of 
 * action in the fomr tag*/
public class OrderDetails extends HttpServlet{
	
	public OrderDetails() {
		System.out.println("This is OrderDetails class for dervelet");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		
		resp.getWriter().println("Order Successful");
		
		
		/*PrintWriter printWriter = resp.getWriter();
		
		String customerName = req.getParameter("customerName");
		String items = req.getParameter("items");
		String quantity = req.getParameter("quantity");
		
		resp.getWriter().println("Customer name: "+customerName);
		resp.getWriter().println("Item: "+items);
		resp.getWriter().println("Quantity: "+quantity);*/
		
	}
	
	
}
