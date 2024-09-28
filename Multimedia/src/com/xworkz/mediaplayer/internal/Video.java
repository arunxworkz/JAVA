package com.xworkz.mediaplayer.internal;

public class Video implements MultiMedia{

	@Override
	public void play(int play) {
		// TODO Auto-generated method stub
		System.out.println("Video is playing");
	}

	@Override
	public void stop(int stop) {
		// TODO Auto-generated method stub
		System.out.println("Video is stoped");
	}

	@Override
	public void displayInfo(int display) {
		// TODO Auto-generated method stub
		System.out.println("Displaying video");
	}

	
}
