package com.zworkz.projects.dto;

import java.io.Serializable;

public class CollegeDTO implements Serializable{
	
	String name;
	String email;
	String phone;
	String address;
	String fatherName;
	String motherName;
	String percentage;
	String course;
	String age;
	public CollegeDTO(String name, String email, String phone, String address, String fatherName,
			String motherName, String percentage, String course, String age) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.percentage = percentage;
		this.course = course;
		this.age = age;
	}
	@Override
	public String toString() {
		return "CollegeDTO [Name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", fatherName=" + fatherName + ", motherName=" + motherName + ", percentage="
				+ percentage + ", course=" + course + ", age=" + age + "]";
	}
	public String getname() {
		return name;
	}
	public void name(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}
