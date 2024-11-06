package com.xworkz.task.service;

import com.xworkz.task.dto.ServiceDTO;

public class ServiceImpl implements Service {

    @Override
    public boolean valid(ServiceDTO serviceDTO) {
        
    
        if (serviceDTO == null) {
            System.out.println("ServiceDTO is null");
            return false;
        }


        if (serviceDTO.getName() != null) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is not valid");
            return false;
        }

        
        if (serviceDTO.getEmail() != null &&
            serviceDTO.getEmail().contains("@") &&
            serviceDTO.getEmail().endsWith(".com")) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is not valid");
            return false;
        }

        
        if (serviceDTO.getPassword() != null) {
            System.out.println("Password is present");
        } else {
            System.out.println("Password is not present");
            return false;
        }

       
        if (serviceDTO.getPassword().equals(serviceDTO.getConfirmPassword())) {
            System.out.println("Password and Confirm Password match");
        } else {
            System.out.println("Password and Confirm Password do not match");
            return false;
        }
        return true;
    }
}
