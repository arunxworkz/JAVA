package com.xworkz.servletproject.dbconnection;

public enum DbConnection {
	
	 DBURL("jdbc:mysql://localhost:3306/practicedb"), USERNAME("root"), PASSWORD("7483079907");
	
	private String value;
	
	private DbConnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	
}
