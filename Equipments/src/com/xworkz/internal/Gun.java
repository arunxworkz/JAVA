package com.xworkz.internal;

public class Gun extends Weapon{

	@Override
	protected void use() {
		System.out.println("Over riding in Gun");
	}
	
	@Override
	public void fire() {
		System.out.println("Over riding the fire method in GUN");
	}
	
	
	void display() {
		use();
		fire();
	}
}
