package com.zworkz.projects.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.projects.service.CollegFormService;
import com.xworkz.projects.service.ValidateImpl;
import com.zworkz.projects.dto.CollegeDTO;
@WebServlet(loadOnStartup = 1, urlPatterns = "/collegeForm")
public class CollegeFormServlet extends HttpServlet{

	public CollegeFormServlet() {
		System.out.println("This is college form servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String fatherName = req.getParameter("fatherName");
		String motherName = req.getParameter("motherName");
		String percentage = req.getParameter("percentage");
		String course = req.getParameter("course");
		String age = req.getParameter("age");
		
		/*resp.getWriter().println(firstName);
		resp.getWriter().println(lastName);
		resp.getWriter().println(email);
		resp.getWriter().println(phone);
		resp.getWriter().println(address);
		resp.getWriter().println(fatherName);
		resp.getWriter().println(motherName);
		resp.getWriter().println(percentage);
		resp.getWriter().println(course);
		resp.getWriter().println(age);*/

		CollegeDTO collegeDTO = new CollegeDTO(name, email, phone, address, fatherName, motherName, percentage, course, age);
		
		CollegFormService collegForm = new ValidateImpl();
		
		boolean isValid = collegForm.validateData(collegeDTO);
	
		if(isValid) {
			System.out.println("valid");
		}else {
			System.out.println("Not valid");
		}
		
		req.setAttribute("name", name);
		req.getRequestDispatcher("/college.jsp").forward(req, resp);
	}
	
	
}
