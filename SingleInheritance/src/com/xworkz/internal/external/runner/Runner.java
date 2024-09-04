package com.xworkz.internal.external.runner;

import com.xworkz.internal.Device;
import com.xworkz.internal.external.Speaker;

public class Runner {

	public static void main(String[] args) {
		
		Speaker speaker = new Speaker();
		speaker.display();
		System.out.println("------------------------------");
		Device device = new Device();
		device.name("Mouse");
		device.action("cursor movement");
	}
}
