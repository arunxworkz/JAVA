package com.xworkz.standards.runner;

import com.sun.jmx.mbeanserver.Repository;
import com.xworkz.standards.woking1.Profile;
import com.xworkz.standards.working.Operate;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operate repository = new Operate();
		Profile profile = new Profile(repository);
		profile.check();
	}

}
