package com.xworkz.funcinterface.monday;

public class Car implements Vehicle{
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Vehicle vehicle = ()->{
			System.out.println("This is from implementation class");
		};
	}

}
