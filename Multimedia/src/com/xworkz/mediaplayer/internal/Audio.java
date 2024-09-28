package com.xworkz.mediaplayer.internal;

public class Audio implements MultiMedia{

	@Override
	public void play(int start) {
		System.out.println("Music is started");
	}

	@Override
	public void stop(int stop) {
		
		System.out.println("Music is stoped");
		
	}

	@Override
	public void displayInfo(int display) {
		// TODO Auto-generated method stub
		System.out.println("Displaying the music");
		
	}

}
