package com.xworkz.Train.railways.central;

import com.xworkz.Train.railways.MetroTrain;
import com.xworkz.Train.railways.SteamEngine;
import com.xworkz.Train.railways.SubUrbanTrain;

public class Runnner {

	public static void main(String[] args) {
		
		
		SteamEngine steamEngine = new SteamEngine("Rjajinagara", "KRS", 50);
		steamEngine.source();
		steamEngine.destinnation();
		steamEngine.noOfPlatform(2);
		
		System.out.println("===================================================");
		
		SubUrbanTrain subUrbanTrain = new SubUrbanTrain(2);
		subUrbanTrain.display();
		
		SubUrbanTrain subUrbanTrain1 = new SubUrbanTrain(23);
		subUrbanTrain1.display();
		
		System.out.println("===================================================");
		
		MetroTrain metroTrain = new MetroTrain();
		metroTrain.display("Bangloere", 1234, 25);
		
		System.out.println("===================================================");
		
		MetroTrain metroTrain1 = new MetroTrain();
		metroTrain1.noOfPlatform(6);
	}
}
