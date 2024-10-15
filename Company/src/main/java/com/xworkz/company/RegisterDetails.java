package com.xworkz.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/Register")
public class RegisterDetails extends HttpServlet{
	
	public RegisterDetails() {
		System.out.println("This is RegidterDetails servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		
		PrintWriter printWriter = resp.getWriter();
		
		String firstName = req.getParameter("firstName");
		String secondName = req.getParameter("secondName");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");
		String gender = req.getParameter("gender");
		String countryName = req.getParameter("countryName");
		String stateName = req.getParameter("stateName");
		
		resp.getWriter().println("Full Name: " + firstName);
		resp.getWriter().println("Second Name: " + secondName);
		resp.getWriter().println("Gender: " + gender);
		resp.getWriter().println("Country Name: " + countryName);
		resp.getWriter().println("State Name: " + stateName);
	}
}
