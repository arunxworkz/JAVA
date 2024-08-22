package com.xworkz.Sandal.store.display;

import com.xworkz.Sandal.store.SandalData;

public class Data {

	private SandalData sd[] = new SandalData[5];
	private int i = 0;
	//private SandalData data;
	
	
	public void store(SandalData data) {
		this.sd[i] = data;
		this.i++;
	}
	
	public void print() {
		System.out.println("The data is: ");
		for(SandalData ele: sd) {
			
			//System.out.println(ele);
			if(ele != null) {
				ele.show();
		    }
			else {
				System.out.println("Nothig to print");
			}
	}
	
}
}
