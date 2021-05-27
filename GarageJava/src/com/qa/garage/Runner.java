package com.qa.garage;

import java.util.ArrayList;


public class Runner {
	
	
	public static void main(String[] args) {
		
		Garage G1 = new Garage();
		
		Car a = new Car(001, "Telsa", 2021, 100000000);
		Plane b = new Plane(002, "Boeing", 2014, 2384903);
		Train c = new Train(003, "Amtrak", 2002, 3503509);
		
		G1.addvehicle(a);
		G1.addvehicle(b);
		G1.addvehicle(c);
		
		G1.calculateBill();
		//G1.printContents();
	

	}

}
