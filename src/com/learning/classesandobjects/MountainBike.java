package com.learning.classesandobjects;

public class MountainBike extends Bicycle {

	// the MountainBike subclass has
	// one field
	public int seatHeight;

	// the MountainBike subclass has
	// one constructor
	public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}

	public MountainBike() {
		super();
		System.out.println("No-arg contructor child");
	}

	// the MountainBike subclass has
	// one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public void sayHello(){
		System.out.println("Child's Hello");
	}
	
	public void onlyChildHello(){
		
		System.out.println("Only Child's Hello");
	}
	
	public static void sayStaticHello(){
		
		System.out.println("Child's static Hello");
	}
	
	private void privateParentHello(){
		System.out.println("Childs's private Hello overloaded");
	}
	
	private void privateChildHello(){
		System.out.println("Childs's private Hello");
	}
	
	 public static void main(String... args){
		MountainBike samRef = new MountainBike();
		Bicycle parentRef  = new MountainBike();
		
		samRef.sayHello();
		samRef.onlyParentHello();
		samRef.onlyChildHello();
		samRef.onlyParentHello();
		samRef.privateChildHello();
		samRef.privateParentHello();
		
		sayStaticHello();
		System.out.println("================================");
		parentRef.sayHello();
		parentRef.onlyParentHello();
		parentRef.sayStaticHello();
		
	}
}
