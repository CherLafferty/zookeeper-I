package com.cher.zookeeper;

public class Bat extends Mammal {
	
//	Member Variables
//	CONSTRUCTOR
	public Bat() {
		super(300);
	}
	
//CONSTRUCTOR OVERLOAD
//	METHODS
	
//	Print sound of bat taking off
	public void fly() {
		System.out.println("flutter flutter");
		this.setenergyLevel(getenergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("I want to suck your blood");
		this.setenergyLevel(getenergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("Burning dow the town!");
		this.setenergyLevel(getenergyLevel() - 100);
	}
	
	
}
