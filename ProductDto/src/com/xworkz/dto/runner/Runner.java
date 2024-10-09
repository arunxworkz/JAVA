package com.xworkz.dto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.dto.productdto.ProductDTO;

import sun.security.krb5.internal.ccache.CCacheOutputStream;

public class Runner {
	public static void main(String[] args) {
		
		ProductDTO productDTO = new ProductDTO();
		Collection<ProductDTO> collection= new ArrayList<>();
		collection.add(new ProductDTO(1, "Cap",  100));
		collection.add(new ProductDTO(2, "Pen", 5.36));
		collection.add(new ProductDTO(3, "Printing Machine", 10000));
		collection.add(new ProductDTO(4, "Bus", 700000.2356));
		collection.add(new ProductDTO(5, "Car", 2000.2356));
		collection.add(new ProductDTO(6, "Bike", 4000.2356));
		collection.add(new ProductDTO(7, "Marker Pen", 80));
		collection.add(new ProductDTO(8, "Laptop", 75000));
		collection.add(new ProductDTO(9, "PS5", 8000));
		collection.add(new ProductDTO(10, "Samsung S23", 100000));

		/*System.out.println(collection.stream().
		filter(ref -> productDTO.getCost()>5000).Comparator.comparing(ProductDTO::getCost())
		.collect(Collectors.toList()));
		This will not work as the :: operator is not supported
		by thus version of the Java*/
		
		collection.stream().forEach(ref->System.out.println(ref));
		
		System.out.println("+-------------------------------------------+");
		
		collection.stream().filter(ref-> ref.getCost()>5000).
		sorted((ref1, ref2)->Double.compare(ref1.getCost(),ref2.getCost()))
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		
		System.out.println("----------------------------------------------");
		
		collection.stream().filter(ref->ref.getCost()>5000 && ref.getCost()<50000)
		.sorted().collect(Collectors.toList()).forEach(ref->System.out.println(ref));
	
		System.out.println("----------------------------------------------");
		
		collection.stream().sorted((ref1, ref2)->Double.compare(ref2.getCost(), ref1.getCost()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		
		System.out.println("----------------------------------------------");
		//filter will return boolean
		collection.stream().filter(ref->ref.getProductName().startsWith("P"))
		.sorted().collect(Collectors.toList()).forEach(
				ref->System.out.println(ref));
		System.out.println("----------------------------------------------");
		
		/*collection.stream().filter(ref->Double.ref.getCost()).filter(ref->ref.getId())
		.sorted().collect(Collectors.toList()).forEach(ref->System.out.println(ref));*/
		
		//soterd will take 2 arguments
		collection.stream().forEach(ref->System.out.println(ref.getProductName()));
		System.out.println("----------------------------------------------");
		
		collection.stream().forEach(ref->System.out.println(ref.getId()));
		System.out.println("----------------------------------------------");
		
		collection.stream().
		forEach(ref->System.out.println(ref.getProductName().toUpperCase()));
	}
}
