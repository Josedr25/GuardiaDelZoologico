package com.zookeper.test;
import com.zookeeper.types.animals.Bat;

public class BatTest {
	
	public static void main(String[] args) {
		
		Bat bruce = new Bat(300);
		
		bruce.displayEnergy();
		bruce.attackTown();
		bruce.attackTown();
		bruce.displayEnergy();
		bruce.eatHumans();
		bruce.eatHumans();
		bruce.displayEnergy();
		bruce.fly();
		bruce.fly();
		bruce.displayEnergy();
	}

}
