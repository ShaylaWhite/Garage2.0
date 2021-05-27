package com.qa.garage;

public class Train extends Vehicle {

	public Train(int trainID, String name, int year, double value) {
		super(trainID, name, year, value);
		this.value = value * .2;
		
	}
	
	
	
	
	@Override
	public void start() {
		
	}
	
	@Override
	public void stop() {

	}
	
	@Override
	public String toString() {
		return "[(Train Name = " + getName() + "), (Year = " + getYear() +"), (invoice amount = $" + getValue() +")]\n";
	}
		


}
