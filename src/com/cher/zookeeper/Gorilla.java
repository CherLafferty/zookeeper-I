package com.cher.zookeeper;


public class Gorilla extends Mammal {
	
//	Member Variables
//	private int energyLevel;
	
	
//	CONSTRUCTOR
	public Gorilla() {
//		this.energyLevel = 100;
		super();
	}
	
//	CONSTRUCTOR OVERLOAD
//	public Gorilla (int energy) {
//		this.energyLevel = energy;
//	}
	
//	METHODS
//	print message that Gorilla has thrown something
//	And return decrease of energy -5
	public void throwSomething() {
		System.out.println("The Gorilla has thrown something.");
		this.setenergyLevel(getenergyLevel() - 5);
		
	}
	
//	print message that Gorilla is 'satisfied' from eating
//	And return increase of energy +10
	public void eatBanana() {
		System.out.println("The Gorilla just ate and is satisfied.");
		this.setenergyLevel(getenergyLevel() + 10);
	}
	
//	print message that Gorilla has climbed a tree
//	And decrease energy -10
	public void climb() {
		System.out.println("The Gorilla just climbed a tree.");
		this.setenergyLevel(getenergyLevel() - 10);
	}
	
//	GETTERS and SETTERS***Don't need b/c of 'extends' and 'super'
//	public int getEnergyLevel() {
//		return energyLevel;
//	}
//
//	public void setEnergyLevel(int energyLevel) {
//		this.energyLevel = energyLevel;
//	}
	
	
}

