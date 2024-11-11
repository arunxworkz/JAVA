package com.xworkz.alcohol.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Alcohol {
	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306/alcohol";
		String dbUrlName = "root";
		String dbUrlPaasword = "7483079907";
		String query = "insert into new_table values (1,'IB','150')";
		Connection connnection = null;
		try {
			connnection = DriverManager.getConnection(dbUrl, dbUrlName, dbUrlPaasword);
			Statement statement = connnection.createStatement();
			int results = statement.executeUpdate(query);

			if (results > 0) {
				System.out.println("this is saved");

			} else {
				System.err.println("this is not saved");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
