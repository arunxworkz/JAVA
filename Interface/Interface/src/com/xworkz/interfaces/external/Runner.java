package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.BankRules;
import com.xworkz.interfaces.internal.CollegeRules;
import com.xworkz.interfaces.internal.HospitalRule;
import com.xworkz.interfaces.internal.HospitalRules;
import com.xworkz.interfaces.internal.RailwayStationRules;
import com.xworkz.interfaces.internal.TempleRules;
import com.xworkz.interfaces.internal.TrafficRules;

public class Runner {

	public static void main(String[] args) {
		
		HospitalRules hospitalRules = new HospitalRules();
		hospitalRules.maintaicSilence();
		hospitalRules.wearMaks();
		hospitalRules.donotUsePhone();
		//HospitalRule.phNo;  here it can not be donw as ti belongs to another class.
		hospitalRules.printVariables();
		
		System.out.println("----------------------------------------");
		
		TrafficRules trafficRules = new TrafficRules();
		trafficRules.doNotDrinkAndDrive();
		trafficRules.followSignals();
		trafficRules.followTrafficSigns();
		trafficRules.goAtGreenLIght();
		trafficRules.maintainSpeed();
		trafficRules.slowDownAtSpeedBreake();
		trafficRules.stopAtRedLight();
		
		System.out.println("----------------------------------------");
		
		CollegeRules collegeRules = new CollegeRules();
		collegeRules.assignment();
		collegeRules.attendenc();
		collegeRules.dicipline();
		collegeRules.exams();
		collegeRules.idCard();
		
		System.out.println("----------------------------------------");
		
		TempleRules templeRules = new TempleRules();
		templeRules.noPhotography(); 
		templeRules.noSlipper(); 
		templeRules.queueSystem(); 
		templeRules.traditionalDress(); 
		
		System.out.println("----------------------------------------");
		
		RailwayStationRules railwayStationRules = new RailwayStationRules();
		railwayStationRules.avoidPlatformHopping();
		railwayStationRules.followPlatformNumbers();
		railwayStationRules.followTrainTimings();
		railwayStationRules.useFootOverBridge();
		
		System.out.println("----------------------------------------");
		
		BankRules bankRules = new BankRules();
		bankRules.avoidCrowdingCounters();
		bankRules.carryIdentityProof();
		bankRules.fillFormsCorrectly();
		bankRules.maintainQueue();
		
	}
	
	
}


