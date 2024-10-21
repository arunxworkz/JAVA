package com.xworkz.forms.servlet;

import java.io.IOException;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.forms.DTO.collegeDTO;

public class collegeform extends HttpServlet{

	public collegeform() {
		System.out.println("This is college form");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String fatherName = req.getParameter("fatherName");
		String motherName = req.getParameter("motherName");
		String percentage = req.getParameter("percentage");
		String course = req.getParameter("course");
		String age = req.getParameter("age");
		
		resp.setContentType("text/html");
		
		if(age != null) {
			int convertedAge = Integer.valueOf(age);
			if(convertedAge > 18) {
				System.out.println("Valid age");
			}else {
				System.out.println("Invalid age");
			}
		}
		
		
		collegeDTO collegeDTO = new collegeDTO(fname, lname, email, phone, address, fatherName, motherName, percentage, course, age);
		
		
		
	}
	
}
