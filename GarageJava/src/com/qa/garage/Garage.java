package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> contents = new ArrayList<>();
	
	public void addvehicle(Vehicle v) {
		contents.add(v);
		System.out.println("this Vehicle" + v + "is added");
	}
	
	public void printContents() {
		
		if (contents.isEmpty()) {
			System.out.println("\n No vehicles \n");
			
		} else {
			System.out.println("\n here are your vehicles\n");
			for (Vehicle v : contents) {
				System.out.println(v);
			}	
		}	
	}
	
	public double vehicleValue(Vehicle v) {
		double value = v.getValue();
		return value;
	}
	
	public void calculateBill() {
		double total =0;
		for (Vehicle v : contents) {
			total = total + v.getValue();
		}
		System.out.println("your invoice total is:" + total);
	}
	
	public void removeVehicle(Vehicle a) {
		contents.remove(a);
		System.out.println("car removed" + a);
	}

	public void emptyGarge(Vehicle a) {
		contents.remove(a);
		System.out.println("no more vehicles");
	}
	

}
