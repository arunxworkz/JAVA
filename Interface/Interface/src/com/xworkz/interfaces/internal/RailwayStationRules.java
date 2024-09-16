package com.xworkz.interfaces.internal;

public class RailwayStationRules implements RailwayStationRule{

	public void validTicket() {
		System.out.println("GEt the valid ticket before travel");
	}
	
	public void useFootOverBridge() {
		System.out.println("Bridge to pass form 1 platform to another");
	}
	
	public void avoidPlatformHopping() {
		System.out.println("Do not jump over railway tracks from one to another platform");
	}
	
	public void followPlatformNumbers() {
		System.out.println("Follow platform");
	}
	
	public void followTrainTimings() {
		System.out.println("Train timing are delayed");
	}
}
