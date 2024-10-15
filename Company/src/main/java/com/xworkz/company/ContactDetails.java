package com.xworkz.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/contactDetails")
public class ContactDetails extends HttpServlet{
	
	public ContactDetails() {
		System.out.println("This is Contact Details Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		
		
		resp.getWriter().println("Contact details are saved");
		
		/*PrintWriter printWriter = resp.getWriter();
		String employeeNAme = req.getParameter("employeeNAme");
		String emailId = req.getParameter("emailId");
		String phoneNumber = req.getParameter("phoneNumber");
		String age = req.getParameter("age");
		
		resp.getWriter().println("The Employee Name: "+employeeNAme);
		resp.getWriter().println("The Email Id is: "+emailId);
		resp.getWriter().println("Phone number: "+phoneNumber);
		resp.getWriter().println("Age: "+age);*/
	}
}
