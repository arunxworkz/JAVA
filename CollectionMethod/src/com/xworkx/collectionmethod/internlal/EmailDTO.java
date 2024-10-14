package com.xworkx.collectionmethod.internlal;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class EmailDTO implements Serializable{
	
	String sender;
	String receiver;
	String subject;
	
	@Override
	public String toString() {
		return "Receiver: "+receiver + " Sender: "+sender+ " Subject: " + subject;
				
		//return "receiver";
	}
	
	
	
	
}
