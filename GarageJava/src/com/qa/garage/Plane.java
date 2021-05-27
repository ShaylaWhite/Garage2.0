package com.qa.garage;

public class Plane extends Vehicle {

		public Plane(int planeID, String name, int year, double value) {
			super(planeID, name, year, value);
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
			return "[(Plane Name = " + getName() + "), (Year = " + getYear() +"), (invoice amount = $" + getValue() +")]\n";
		}
			
	}


