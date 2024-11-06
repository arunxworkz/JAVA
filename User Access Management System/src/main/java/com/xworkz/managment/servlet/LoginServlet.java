package com.xworkz.managment.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/login1")
public class LoginServlet extends HttpServlet {

	// Make sure that the servlet is working
	public LoginServlet() {
		System.out.println("Thi is login servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Get the details from the loginform
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		//String role = req.getParameter("role");

		// Check the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver nstalled");
		} catch (ClassNotFoundException e) {
			System.err.println("Driver not found");
			e.printStackTrace();
		}

		// Get the details to access the database.
		String dbUrl = "jdbc:mysql://localhost:3306/projectdatabase";
		String dbUserName = "root";
		String dbPassword = "7483079907";

		// Get the conection class to get connect with database
		Connection connection = null;

		// Driver Manager to get connect with the database using the database details
		try {
			connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

			// Create sql query ro check the data is present in the database
			String selectQuery = "select * from users where userName = ? and password = ?";

			// Prepared statement for getting the inputs from the form
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2,  password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			//PrintWriter printWriter = resp.getWriter();
			
			if (resultSet.next()) {
				// Login successful
				int userId = resultSet.getInt("id");
				String role = resultSet.getString("role"); //Get the role from the database
				if("admin".equalsIgnoreCase(role)) {
					resp.sendRedirect("createsoftware.jsp");
				}else if("employee".equalsIgnoreCase(role)){
					resp.sendRedirect("requestAccess.jsp");
				}else {
					req.setAttribute("faailure", "Role is not recognized. Contact Admin");
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("login1.jsp");
	                requestDispatcher.forward(req, resp);
				}
				// printWriter.println("Login successful! User ID: " + userId);(optional)
				//resp.sendRedirect("index.jsp");
				req.setAttribute("success", "login successful"); // Redirect to a success page
			} else {
				// Login failed
				System.err.println("Invalid credentials");
				//resp.sendRedirect("index.jsp");
				req.setAttribute("failure", "login not successful"); // Redirect back to login page
			}
		} catch (SQLException e) {
			System.err.println("Connetcion not established");
			e.printStackTrace();
		}

//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("login1.jsp");
//		requestDispatcher.forward(req, resp);
	}

}
