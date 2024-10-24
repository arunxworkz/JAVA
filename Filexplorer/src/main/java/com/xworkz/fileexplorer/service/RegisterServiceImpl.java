package com.xworkz.fileexplorer.service;

import com.xworkz.fileexplorer.dto.RegisterDTO;

public class RegisterServiceImpl implements RegisterService{

	@Override
	public boolean valid(RegisterDTO registerDTO) {

		boolean valid = true;
		
		if(registerDTO == null) {
			return false;
		}
		
		String name = registerDTO.getName();
		if (name != null && !name.isEmpty() && (name.length() > 3 && name.length() < 30)) {
			System.out.println("Name is valid");
		}else {
			System.out.println("Name is invalid");
			return false;
		}
		
		String email = registerDTO.getEmail();
		if(email != null && email.contains("@gmail") && email.endsWith(".com") || email.endsWith(".in")) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Email is valid");
			return false;
		}
		
		//long phoneNumber = Long.parseLong(registerDTO.getPhoneNumber());
		//RegisterDTO registerDTO1 = (RegisterDTO)phoneNumber;
		//if(phoneNumber != null) {
		String phoneNumber = registerDTO.getPhoneNumber();
		if(phoneNumber != null) {
			System.out.println("Phone number is valid");
		}else {
			System.out.println("Invalid phoe number");
		}
		
		return valid;
	}

}
