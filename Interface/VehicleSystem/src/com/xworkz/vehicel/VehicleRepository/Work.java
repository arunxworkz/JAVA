package com.xworkz.vehicel.VehicleRepository;

public class Work implements VehicleRepository{

	@Override
	public void save() {
		System.out.println("Vehicle number is saved");
		
	}

	@Override
	public void update() {
		System.out.println("Vehicle number is updated");
		
	}

	@Override
	public boolean delete() {
		System.out.println("The vehicle number is deletred for the database");
		return true;
	}

	@Override
	public String read() {
		System.out.println("Vehicle number");
		return "KA18E007";
	}

}
