package com.xworkz.vehicel.Runner;

import com.xworkz.vehicel.vehicleservice.VehicelService;
import com.xworkz.vehicel.VehicleRepository.VehicleRepository;
import com.xworkz.vehicel.VehicleRepository.Work;
import com.xworkz.vehicel.vehicleservice.Service;

public class Runner {

	public static void main(String[] args) {
		
		VehicleRepository vehicleRepository = new Work();
		Work work= new Work();
		Service service = new Service();
		service.persist(vehicleRepository);
		System.out.println("--------------------------------------");
		service.merge(vehicleRepository);
		System.out.println("--------------------------------------");
		service.clear(vehicleRepository);
		System.out.println("--------------------------------------");
		service.serach(vehicleRepository);
		System.out.println("--------------------------------------");
		
	}
	
	
}
