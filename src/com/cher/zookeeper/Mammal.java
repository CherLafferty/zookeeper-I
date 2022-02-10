package com.cher.zookeeper;

public class Mammal {
	//Member Variables
	private int energyLevel;

	// CONSTRUCTOR
	public Mammal() {
	    this.energyLevel = 100;
	}

	// CONSTRUCTOR OVERLOAD
	public Mammal (int energy) {
	    this.energyLevel = energy;
	}

	// METHODS
	// the displayEnergy() method should show the animals energy level as well as return it.
	public int displayEnergy(){
	    System.out.println(energyLevel);
	    return energyLevel;
	}

	// GETTERS and SETTERS
	public int getenergyLevel() {
	    return this.energyLevel;
	}

	public void setenergyLevel(int energyLevel){
	    this.energyLevel = energyLevel;
	}
	

}
