package com.xworkz.projects.service;

import com.zworkz.projects.dto.CollegeDTO;

public class ValidateImpl implements CollegFormService{

	@Override
	public boolean validateData(CollegeDTO collegeDTO) {
		
		boolean valid = true;
		if(collegeDTO != null) {
			System.out.println("is  null");
			return  false;
		}
		
		String name = collegeDTO.getname();
		if(name.length()>3 && !name.isEmpty()) {
			System.out.println("Name is valid: "+name);
			//return true;
		}else {
			System.out.println("Not a vlid name");
			return valid = false;
		}
		
		String email = collegeDTO.getEmail();
		if(email.contains("@") && email.matches("gmail.com")) {
			System.out.println("Valid email: "+email);
		}else {
			System.out.println("Not a valid email");
			return valid = false;
		}
		
		String phone = collegeDTO.getPhone();
		//long phoneNo = Long.parseLong(phone);
		if(phone.length() > 0 && phone.length() < 11) {
			System.out.println("Valid phone number");
		}else {
			System.out.println("Not a valid phone number");
			return valid = false;
		}
		
		String fatherName = collegeDTO.getFatherName();
		if(fatherName.length() > 3 && !fatherName.isEmpty()) {
			System.out.println("Father name is providede");
		}else {
			System.out.println("Father name is Not provided");
			return valid = false;
		}
		
		String motherName = collegeDTO.getMotherName();
		if(motherName.length() > 3 && !motherName.isEmpty()) {
			System.out.println("Mother name is providdde");
		}else {
			System.out.println("Not provided");
			return valid = false;
		}
		
		String percentage = collegeDTO.getPercentage();
		int percent = Integer.valueOf(percentage);
		if(percent > 75) {
			System.out.println("Valid");
		}else {
			System.out.println("Not valid");
			return valid = false;
		}
		
		String course = collegeDTO.getCourse();
		if(!course.isEmpty()) {
			System.out.println("Valid course");
		}else {
			System.out.println("Course not providede");
		}
		
		String yob = collegeDTO.getAge();
		int age = Integer.valueOf(yob);
		if(age > 18) {
			System.out.println("Age is valid");
		}
		else {
			System.out.println("Age is not valid");
			return valid = false;
		}
		
		return valid;
	}

}
