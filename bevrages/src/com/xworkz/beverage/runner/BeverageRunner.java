package com.xworkz.beverage.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BeverageRunner {

	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306/alochol";
		String dbUrlName = "root";
		String dbUrlPaasword = "7483079907";
		String query = "select coulumnName from new_table where email = '' and password ='';";
		Connection connnection = null;
		try {
			connnection = DriverManager.getConnection(dbUrl, dbUrlName, dbUrlPaasword);
			Statement statement = connnection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {

				System.out.println("data from table ==" + resultSet.getString("alcohol_name"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
