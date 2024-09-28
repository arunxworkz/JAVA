package com.xworkz.mediaplayer.runner;

import com.xworkz.mediaplayer.internal.Audio;
import com.xworkz.mediaplayer.internal.Images;
import com.xworkz.mediaplayer.internal.MultiMedia;

public class Runner {
	public static void main(String[] args) {
		MultiMedia  multiMedia = new Audio() ;
		multiMedia.play(0);
		multiMedia.stop(0);
		multiMedia.stop(0);
		
	}
}
