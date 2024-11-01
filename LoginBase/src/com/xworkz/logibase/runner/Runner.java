package com.xworkz.logibase.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.logibase.internal.InvokeMethods;

public class Runner {
	public static void main(String[] args) {
		InvokeMethods invokeMethods = new InvokeMethods();
 		
		//Instell the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		}catch(ClassNotFoundException e) {
			System.err.println("Driver not installed");
			e.printStackTrace();
		}
		
		//Database Details
		String dbUrl = "jdbc:mysql://localhost:3306/taks";
		String dbUserName = "root";
		String dbPassword = "7483079907";
		
		//Connection
		Connection connection = null;
		
		//DriverManager
		try {
			connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			System.out.println("Connection established");
			//Stetement
			Statement statement = connection.createStatement();
			
			//Updating
			//String update = "update details set password = 'kar7896' where id = '2'";
			
			int value = 0;
			value = statement.executeUpdate(invokeMethods.insert());
			
			
			if(value > 0) {
				System.out.println("Data saved");
			}else {
				System.err.println("Dtara not saved");
			}
			
			statement.executeUpdate("update details set password = 'na6498' where id = '3'");
			statement.executeUpdate("update details set password = 'osa567' where id = '4'");
			statement.executeUpdate("update details set password = 'c12ten' where id = '5'");
			statement.executeUpdate("update details set password = '456char' where id = '6'");
			statement.executeUpdate("update details set password = 's56m' where id = '7'");
			statement.executeUpdate("update details set password = '897ajay' where id = '8'");
			statement.executeUpdate("update details set password = '2589sach' where id = '9'");
			statement.executeUpdate("update details set password = '96325sha' where id = '10'");
			
			statement.executeUpdate("delete from details where id between '11' and '20'");
			
			//statement.executeUpdate("select count('*') from details");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
