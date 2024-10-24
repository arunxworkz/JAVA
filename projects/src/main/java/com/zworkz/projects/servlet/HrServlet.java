package com.zworkz.projects.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zworkz.projects.dto.HrDTO;
@WebServlet()
public class HrServlet extends HttpServlet{

	
	public HrServlet() {
		System.out.println("This is Hr servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.service(req, resp);
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String location = req.getParameter("location");
		String experience = req.getParameter("experience");
		String qulification = req.getParameter("qulification");
		
		HrDTO hrDTO = new HrDTO(name, email, location, experience, qulification);
		
		
		
		
	}
	
}
