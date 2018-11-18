package com.learning.classesandobjects;

public class Bicycle {

	// the Bicycle class has
	// three fields
	public int cadence;
	public int gear;
	public int speed;
	
	public static int staticVar;

	// the Bicycle class has
	// one constructor
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	public Bicycle() {
		System.out.println("No-arg contructor parent");
	}

	// the Bicycle class has
	// four methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void onlyParentHello(){
		System.out.println("Only Parent's Hello");
	}
	
	public void sayHello(){
		System.out.println("Parent's Hello");
	}
	
	public static void sayStaticHello(){
		System.out.println("Parent's static Hello");
	}
	
	private void privateParentHello(){
		System.out.println("Parent's private Hello");
	}
	
}