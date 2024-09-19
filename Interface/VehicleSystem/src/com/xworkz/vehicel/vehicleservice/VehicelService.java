package com.xworkz.vehicel.vehicleservice;

import com.xworkz.vehicel.VehicleRepository.VehicleRepository;

public interface VehicelService {

	
	void persist(VehicleRepository VehicleRepository);
	void merge(VehicleRepository VehicleRepository);
	boolean clear(VehicleRepository VehicleRepository);
	String serach(VehicleRepository VehicleRepository);
	
	
}
