package com.xworkz.task1.service;

import com.xworkz.task1.dto.ProductDTO;
import com.xworkz.task1.repository.Product;
import com.xworkz.task1.repository.ProductRepoImpl;


public class ProductServiceImpl implements ProductSrevice{

	@Override
	public boolean valid(ProductDTO productDTO) {
		
		boolean valid = true;
		
		if(productDTO == null) {
			return false;
		}
		
		String name = productDTO.getCompanyName();
		if(name != null) {
			System.out.println("Comapny name is correct");
		}else {
			return  false;
		}
		
		String productName = productDTO.getProductName();
		if(productName != null) {
			System.out.println("Product name name is correct");
		}else {
			valid = false;
		}
		
		String productType = productDTO.getProductType();
		if(productType != null) {
			System.out.println("Product type is correct");
		}else {
			valid = false;
		}
		
		int quantity = productDTO.getQuantity();
		if(quantity > 1) {
			System.out.println(" is correct");
		}else {
			valid =  false;
		}
		
		if(valid) {
			System.out.println("Saving the data");
			Product ticketRepository = new ProductRepoImpl();
			int value = ticketRepository.save(productDTO);
			if(value > 0) {
				System.out.println("Saved");
				valid = true;
			}else {
				System.out.println("not savde");
				valid = false;
			}
		}
		
		return valid;
		
	}

}
