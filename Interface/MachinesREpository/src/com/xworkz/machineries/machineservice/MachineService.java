package com.xworkz.machineries.machineservice;

import com.xworkz.machineries.machinerepository.MachineRepository;

public interface MachineService {

	void working(MachineRepository machineRepository);

	int inputTakes(MachineRepository machineRepository);

	int outPut(MachineRepository machineRepository);

}
