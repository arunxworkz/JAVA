package com.xworkz.newsignuppage.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.newsignuppage.dto.SignUpDTO;


@WebServlet(loadOnStartup = 1, urlPatterns = "/signup")
public class SignupSetvlet extends HttpServlet{

	public SignupSetvlet() {
		System.out.println("Running the Server");
	}
	
	//SignUpDTO signUpDTO = new SignUpDTO()
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String phnoNumber = req.getParameter("phnoNumber");
		
		SignUpDTO signUpDTO = new SignUpDTO();
		
		//SignUpDTO signUpDTO = new SignUpDTO(name, phnoNumber);
		
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String userName = "root";
		String password = "7483079907";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Installed");
		} catch (ClassNotFoundException e) {
			System.err.println("Driver not Installed");
			e.printStackTrace();
		}
		
		Connection connection = null;
		
		//String insertQuery = "insert into new_table values(name, phnoNumber) values(? , ?)";
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established");
			
			PreparedStatement prepedStatement = null;
			//Statement statement = connection.createStatement();
			
			String insertQuery = "insert into mytable values(name, phnoNumber) values(? , ?)";
			
			/*prepedStatement = connection.prepedStatement(insertQuery);
			prepedStatement.setString(1, name);
			prepedStatement.setString(2, phnoNumber);*/
			
			prepedStatement = connection.prepareStatement(insertQuery);
	        prepedStatement.setString(1, signUpDTO.getName());
	        prepedStatement.setString(2, signUpDTO.getPhnoNumber());
			
			int value = prepedStatement.executeUpdate(insertQuery);
			
			if(value > 0) {
				System.out.println("Values inserted");
			}else {
				System.err.println("Not executed");
			}
			
		} catch (SQLException e) {
			System.err.println("Connection not Established");
			e.printStackTrace();
		}
	}
	
}
