package com.xworkz.machineries.machinerepository;

public class WorkSpace implements MachineRepository {

	@Override
	public void machine() {
		System.out.println("Object which reduces human effort");

	}

	@Override
	public int input() {
		System.out.println("Takes the input");
		return 5;
	}

	@Override
	public int output() {
		System.out.println("Generate output");
		return 1;
	}

}
