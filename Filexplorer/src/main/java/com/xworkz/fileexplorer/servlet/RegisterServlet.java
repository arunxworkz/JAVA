package com.xworkz.fileexplorer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.fileexplorer.dto.RegisterDTO;
import com.xworkz.fileexplorer.service.RegisterService;
import com.xworkz.fileexplorer.service.RegisterServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class RegisterServlet extends HttpServlet{

	public RegisterServlet() {
		System.out.println("Running the server");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNumber = req.getParameter("phnoNumber");
		/*(optional)
		//To chek the number of requests
		PrintWriter printWriter = resp.getWriter();
		resp.getWriter().println("NAme: " +name);
		resp.getWriter().println("Email:" +email);
		resp.getWriter().println("Phone number:" +phoneNumber);*/
		
		//Create the instance of RegisterService
		RegisterService registerService = new RegisterServiceImpl();
		
		//assign the registerService to a variable and invoke the valid() method from RegisterServiceImpl.
		//Pass the RegisterDTO instance to the the valid method.
		//Create the instance of RegisterDTO (optional).
		
		boolean isValid = registerService.valid(new RegisterDTO(name, email, phoneNumber));
				
		//Here check the wheterhet the isValid is true or false.
		if(isValid) {
			System.out.println("Valid Register");
			req.setAttribute("success", "Registration is success");
		}else {
			System.out.println("Register is invalid");
			req.setAttribute("failure", "Registration os failure");
			req.setAttribute("registerDTO", new RegisterDTO(name, email, phoneNumber));
		}
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Register.jsp");
		requestDispatcher.forward(req, resp);
	}
	
	
	
	
}
