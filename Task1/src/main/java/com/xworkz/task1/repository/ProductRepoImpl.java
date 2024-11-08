package com.xworkz.task1.repository;

import com.xworkz.task1.dto.ProductDTO;

public class ProductRepoImpl implements Product{

	@Override
	public int save(ProductDTO productDTO) {
		System.out.println("Today is a good day");
		return 0;
	}

}
