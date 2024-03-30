package com.zookeeper.types.animals;
import com.zookeeper.types.Mammal;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("El Gorilla esá tirando cosas");
		energyLevel -= 5;
	}
	
	
	public void eatBananas() {
		System.out.println("Yummy yummy");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("El gorilla subió el árbol");
		energyLevel -=10;
	}
}
