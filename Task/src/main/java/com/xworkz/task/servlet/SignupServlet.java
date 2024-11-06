package com.xworkz.task.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.task.dto.ServiceDTO;
import com.xworkz.task.service.Service;
import com.xworkz.task.service.ServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/signUp")
public class SignupServlet extends HttpServlet{

	public SignupServlet() {
		System.out.println("Running the server");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");
		
		ServiceDTO serviceDTO = new ServiceDTO(name, email, password, confirmPassword);
		
		Service service = new ServiceImpl();
		if(service.valid(serviceDTO)) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("success", serviceDTO);
			req.setAttribute("successMsg", "Successfull");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/signup.jsp");
			//req.setAttribute("data", serviceDTO);
			req.setAttribute("failure", serviceDTO);
			req.setAttribute("failureMsg", "Validation Errors");
			dispatcher.forward(req, resp);
		}
		
		
		
	}
}
//
//System.out.println("Valid credentials");
//RequestDispatcher dispatcher=req.getRequestDispatcher("/Success.jsp");
//req.setAttribute("name", serviceDTO.getName());
//req.setAttribute("successMsg", "Sign up is Success");			
//dispatcher.forward(req, resp);
//}else {
//System.out.println("invalid cresdentials");
//RequestDispatcher dispatcher=req.getRequestDispatcher("/index.jsp");
//req.setAttribute("data", serviceDTO);
//req.setAttribute("failureMsg", "Validation Errors");			
//
//dispatcher.forward(req, resp);
