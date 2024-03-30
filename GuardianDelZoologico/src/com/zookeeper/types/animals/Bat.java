package com.zookeeper.types.animals;
import com.zookeeper.types.Mammal;

public class Bat extends Mammal {
	
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("Woooosh! Murcielago volando");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("bueno, no importa");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Ayudaaaa, un murcielago nos ataca");
		energyLevel -= 100;
	}
}

