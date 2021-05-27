package com.qa.garage;

//Parent Class - Abstract 
public class Vehicle {

	private int id;
	private String name;
	private int year;
	protected double value;
	private String engineState; //OFF or ON
	
	//empty object
	public Vehicle(){};
	
	public Vehicle(int id, String name, int year, double value) {
		setId(id);
		setName(name);
		setYear(year);
		setValue(value);
		setEngineState("OFF");
		
	}
	
	//functions
	
	public void start() {
		if (this.engineState == "ON") {
			System.out.println("Engine is already ON");
		}else {
			this.setEngineState("ON");
			System.out.println("Engine is ON");

		}
		
	}
	
	private void setEngineState(String string) {
		// TODO Auto-generated method stub
		
	}

	public void stop() {
		if(this.engineState == "OFF") {
			System.out.println("Engine is already OFF.");
		}else {
			this.setEngineState("OFF");
			System.out.println("Engine is turned OFF");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
	
	
	
}
