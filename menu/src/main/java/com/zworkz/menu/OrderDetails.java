package com.zworkz.menu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/submit")
public class OrderDetails extends HttpServlet{

	OrderDetails(){
		System.out.println("This is the orderdetals");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		
		PrintWriter printWriter= resp.getWriter();
		
		/*printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("<h1>Order</h1>");
		printWriter.println("</body>");
		printWriter.println("</html>");*/
		
		String quantity = req.getParameter("quantity");
		String price = req.getParameter("price");
		String item = req.getParameter("item");
		
		Double totalPrice = Double.valueOf(price);
		Integer totalQuantity = Integer.valueOf(quantity); 
		resp.setContentType("text/html");
		
		//printWriter.println("<html>");
//		printWriter.println("<body>");
//		
//			if(totalQuantity > 0) {
//				printWriter.println("<span style = \"color:red>");
//				printWriter.println("<p>Quantity is valid<p>");
//				printWriter.println("<p>Item is"+ item +" </p>");
//				printWriter.println("<span>");
//			}else {
//				System.out.println("Quantity is in valid");
//			}
//			
//			if(totalPrice > 20) {
//				System.out.println("Price is valid");
//			}else {
//				printWriter.println("<span style = \"color:red>");
//				printWriter.println("Not valid");
//				printWriter.println("<span>");
//			}
//			
//			printWriter.println("</body>");
//			printWriter.println("</html>");
		printWriter.println("Printing");
	}
	
		
}
