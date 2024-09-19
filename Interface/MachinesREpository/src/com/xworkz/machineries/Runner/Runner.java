package com.xworkz.machineries.Runner;

import com.xworkz.machineries.machinerepository.MachineRepository;
import com.xworkz.machineries.machinerepository.WorkSpace;
import com.xworkz.machineries.machineservice.Service;

public class Runner {

	public static void main(String[] args) {
		
		MachineRepository machineRepository = new WorkSpace();
		
		Service service = new Service();
		service.working(machineRepository);
		System.out.println("-------------------------------------");
		service.inputTakes(machineRepository);
		System.out.println("-------------------------------------");
		service.outPut(machineRepository);
	}

}
