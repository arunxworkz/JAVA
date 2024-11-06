package com.xworkz.task1.service;

import com.xworkz.task1.dto.ProductDTO;

public class ProductServiceImpl implements ProductSrevice{

	@Override
	public boolean valid(ProductDTO productDTO) {
		
		boolean valid = true;
		
		if((productDTO.getQuantity() > 0) && (productDTO.getQuantity() < 10)) {
			return true;
		}else {
			return false;
		}
	}

}
