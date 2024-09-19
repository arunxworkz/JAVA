package com.xworkz.machineries.machineservice;

import com.xworkz.machineries.machinerepository.MachineRepository;

public class Service implements MachineService {

	@Override
	public void working(MachineRepository machineRepository) {
		if (machineRepository != null) {
			System.out.println("MAchine is providing the service");
			machineRepository.machine();
		}

	}

	@Override
	public int inputTakes(MachineRepository machineRepository) {
		if (machineRepository != null) {
			int count = machineRepository.input();
			if (count >= 5) {
				machineRepository.input();
				return 1;
			} else {
				return 0;
			}
		}
		return 1;
	}

	@Override
	public int outPut(MachineRepository machineRepository) {
		if (machineRepository != null) {
			int count = machineRepository.output();
			if (count == 1) {
				machineRepository.output();
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}

}
