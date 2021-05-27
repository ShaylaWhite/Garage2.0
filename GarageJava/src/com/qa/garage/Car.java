package com.qa.garage;

//Subclass

public class Car extends Vehicle {
	
	private double value;

	public Car(int carId, String name, int year, double value) {
		super(carId, name, year, value);
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
			return "[(Car Name = " + getName() + "), (Year = " + getYear() +"), (invoice amount = $" + getValue() +")]\n";
		}
			

	}

