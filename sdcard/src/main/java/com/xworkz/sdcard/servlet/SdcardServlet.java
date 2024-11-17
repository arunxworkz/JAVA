package com.xworkz.sdcard.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.sdcard.dto.SdcardDTO;
import com.xworkz.sdcard.service.SdcardService;
import com.xworkz.sdcard.service.SdcardServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/join-now")
/*
 * @WebServlet anotaton is used o map the url patterns and is used in web
 * applications to declare the servlet without the need for a seprate
 * configaration file. loadonStartUp is used load the servlet when the srver
 * start's up. Setting loadOnStartup to a positive integer forces the servlet 'to
 * be initialized at startup.
 */
public class SdcardServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		SdcardDTO sdcardDTO = new SdcardDTO(firstName, lastName, email, password);
		SdcardServiceImpl sdcardService = new SdcardServiceImpl();

		sdcardService.save(sdcardDTO);

		// System.out.println("Firts name: "+firstName + " Last NAme: "+lastName+"
		// Email: "+email+ " passwod: "+password);

		RequestDispatcher dispatcher = req.getRequestDispatcher("about.jsp");
		dispatcher.forward(req, resp);
	}
}
