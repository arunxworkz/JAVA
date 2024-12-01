package com.xworkz.servletproject.service;

import com.xworkz.servletproject.dto.DtoClass;
import com.xworkz.servletproject.repository.ServletRepoImpl;

public class ServletServiceImpl {
	
	public boolean save(DtoClass dto) {
	    boolean isValid = true;

	    if (dto != null) {
	        if (dto.getName().length() < 3 || dto.getName().isEmpty()) {
	            System.err.println("The data is not valid");
	            isValid = false;
	        }

	        if (dto.getPhNo().length() != 10 || dto.getPhNo().isEmpty()) {
	            System.out.println("The data is not valid");
	            isValid = false;
	        }

	        if (isValid) {
	            ServletRepoImpl repo = new ServletRepoImpl();
	            return repo.save(dto);
	        } else {
	            return false;
	        }
	    }
	    return false;
	}

	
	
}
