package com.xworkz.servletproject.repository;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.servletproject.dbconnection.DbConnection;
import com.xworkz.servletproject.dto.DtoClass;

public class ServletRepoImpl {
	
	
	
	public boolean save(DtoClass dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		boolean isValid = true;
		Connection connection = null;
		PreparedStatement prep = null;
		
		
		try {
			connection = DriverManager.getConnection(DbConnection.DBURL.getValue(), DbConnection.USERNAME.getValue(), DbConnection.PASSWORD.getValue());
			System.err.println("Connection established");
			
			prep = connection.prepareStatement("insert into practicetable(name, phno) value(?, ?)");
			prep.setString(1, dto.getName());
			prep.setString(2, dto.getPhNo());
			
			int value =  prep.executeUpdate();
			if(value > 0) {
				System.out.println("Data is saved");
				isValid  = false;
			}else{
				System.out.println("Datya is not saved");
				isValid  = false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return isValid;
	}
}
