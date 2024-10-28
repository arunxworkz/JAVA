package com.xworkz.managment.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.managment.dto.SignUpDTO;
import com.xworkz.managment.service.SignUpService;
import com.xworkz.managment.service.SignUpServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signup")
public class SignUpServlet extends HttpServlet {

	public SignUpServlet() {
		System.out.println("SignUp Servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Get the values from the html or jsp page
		String username = req.getParameter("userName");
		String password = req.getParameter("password");
		String role = req.getParameter("role");

		// Creating the object of the signupdto to pass the values directly from the form
		SignUpDTO signUpDTO = new SignUpDTO(username, password, role);

		// Check the driver installation(optional)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
		} catch (ClassNotFoundException e) {
			System.err.println("Driver not found");
			e.printStackTrace();
		}

		// creating the object of signupservice
		SignUpService signUpService = new SignUpServiceImpl();

		// paasing the reference of the signupservice to validate the data passed.
		if (signUpService.validate(signUpDTO)) {

			// Provide the access deatils of the database
			String dburl = "jdbc:mysql://localhost:3306/projectdatabase";
			String dbuserName = "root";
			String dataBasePassword = "7483079907";

			Connection connection = null;

			// Use DriverMangare to connect to the database
			try {
				connection = DriverManager.getConnection(dburl, dbuserName, dataBasePassword);
				System.out.println("Conection is Established");

				// Create Prepared statement to pass the values
				PreparedStatement preparedStatement = null;

				// Provide the column name is given in the database column name.
				String insertQuery = "insert into users (username, password, role) values(?, ?, ?)";

				/*
				 * The below is for deleting String deleteQuery =
				 * "delete from users where id = 1";
				 */

				preparedStatement = connection.prepareStatement(insertQuery); // prepareStatement
				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);
				preparedStatement.setString(3, role);

				// PreparedStaement will return int value
				int insertValues = preparedStatement.executeUpdate();

				// For confirmation check whether the date is storing or not
				if (insertValues > 0) {
					System.out.println("Data is stored");
					req.setAttribute("success", "SignUp successful");
				} else {
					System.err.println("Data Not stored");
					req.setAttribute("failure", "SignUp Unsuccessful");
				}

			} catch (SQLException e) {
				System.err.println("Connection not established");
				e.printStackTrace();
			}

		}
		//RequesDipatcher for request from one servlet or jsp to nother
		RequestDispatcher requstDispatcher = req.getRequestDispatcher("signup.jsp");
		requstDispatcher.forward(req, resp);

	}
}
