package com.xworkz.servletproject.dto;

public class DtoClass {

	private String name;
	private String phNo;
	
	public DtoClass(String name, String phNo) {
		this.name = name;
		this.phNo= phNo;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhNo() {
		return phNo;
	}
	
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "DtoClass [name=" + name + ", phNo=" + phNo + "]";
	}
	
	
	
}
