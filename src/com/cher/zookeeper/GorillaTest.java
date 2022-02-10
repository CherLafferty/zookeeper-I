package com.cher.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
//		System.out.println("just testing");
		Mammal mammal = new Mammal();
		mammal.displayEnergy();
		
		Gorilla ape = new Gorilla();
		ape.throwSomething();
		ape.eatBanana();
		ape.climb();
		ape.climb();
		ape.displayEnergy();
	
		
		
		Bat rabbies = new Bat();
		rabbies.displayEnergy();
		rabbies.attackTown();
		rabbies.fly();
		rabbies.eatHumans();
		rabbies.eatHumans();
		rabbies.displayEnergy();
			
		
	}

}
