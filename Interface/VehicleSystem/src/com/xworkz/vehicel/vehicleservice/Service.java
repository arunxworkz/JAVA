package com.xworkz.vehicel.vehicleservice;

import com.xworkz.vehicel.VehicleRepository.VehicleRepository;

public class Service implements VehicelService{

	//VehicleRepositoryvehicleRepository;
	
	@Override
	public void persist(VehicleRepository vehicleRepository) {
		if(vehicleRepository != null) {
		
			vehicleRepository.save();
		}
	}
		

	@Override
	public void merge(VehicleRepository vehicleRepository) {
		if(vehicleRepository != null) {
			vehicleRepository.update(); 
		}
	}

	@Override
	public boolean clear(VehicleRepository vehicleRepository) {
		if(vehicleRepository != null) {
			boolean crud = vehicleRepository.delete(); 
			if(crud) {
				vehicleRepository.delete(); 
			}
			else {
				return false;
			}
		}
		return true;
	}

	@Override
	public String serach(VehicleRepository vehicleRepository) {
		if(vehicleRepository != null) {
			String str = vehicleRepository.read();
			if(str != null) {
				vehicleRepository.delete(); 
			}
			else {
				return "Vehicle number not found";
			}
		}
		return "Check database";
	}

}
