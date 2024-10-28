package com.xworkz.managment.service;

import com.xworkz.managment.dto.SignUpDTO;

public class SignUpServiceImpl implements SignUpService{

	@Override
	public boolean validate(SignUpDTO signUpDTO) {
		
		//create variable to return true if all the condition matches
		boolean valid = true;
		
		//check the null pointer exception
		if(signUpDTO == null) {
			return false;
		}
		
		if(signUpDTO.getUserName() != null && (signUpDTO.getUserName().length() > 3)) {
			System.out.println("Name is valid");
		}else {
			System.err.println("Name not valid");
			return valid = false;
		}
		if(signUpDTO.getPassword() != null && signUpDTO.getPassword().length() > 8 && signUpDTO.getPassword().contains("@")) {
			System.out.println("Password is valid");
		}else {
			System.err.println("Password not valid");
			return valid = false;
		}
		return true;
	}

}
