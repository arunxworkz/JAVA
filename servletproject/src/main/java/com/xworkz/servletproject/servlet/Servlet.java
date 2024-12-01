package com.xworkz.servletproject.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servletproject.dto.DtoClass;
import com.xworkz.servletproject.service.ServletServiceImpl;


@WebServlet(loadOnStartup = 1, urlPatterns = "/signup")
public class Servlet extends HttpServlet{

	public Servlet() {
		System.out.println("This is servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String name = req.getParameter("name");
		String phNo = req.getParameter("phNo");
		
		
		DtoClass dto = new DtoClass(name, phNo);
		
		ServletServiceImpl serimpl = new ServletServiceImpl();
		serimpl.save(dto);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);
		
	}
	

	
	
}
