package com.learning.classesandobjects;

import java.util.Objects;

public class OnlyTwoInstances {
	private static OnlyTwoInstances instance = null;
	
	private static OnlyTwoInstances instance1 = new OnlyTwoInstances();
	private static OnlyTwoInstances instance2 = new OnlyTwoInstances();

	private static int count = 0;
	
	private static int count2 = 0;

	private OnlyTwoInstances() {

	}

	public static OnlyTwoInstances getInstance() {
		if (count < 2) {
			instance = new OnlyTwoInstances();
			count++;
			return instance;
		} else {
			return null;
		}

	}
	
	public static OnlyTwoInstances onlyTwo(){
		
		if((count2%2)==0){
			count2++;
			return instance1;
		}else{
			count2++;
			return instance2;
		}
		
	}
	
	public static void main(String[] args) {
		OnlyTwoInstances one = onlyTwo();
		OnlyTwoInstances two = onlyTwo();

		OnlyTwoInstances three = onlyTwo();
		OnlyTwoInstances four = onlyTwo();
		
		OnlyTwoInstances five = onlyTwo();
		OnlyTwoInstances six = onlyTwo();
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
		System.out.println(four.hashCode());
		System.out.println(five.hashCode());
		System.out.println(six.hashCode());
		
		if (Objects.isNull(one)) {
			System.out.println("one is Empty");
		}

		if (Objects.isNull(two)) {
			System.out.println("two is Empty");
		}

		if (Objects.isNull(three)) {
			System.out.println("three is Empty");
		}

		if (Objects.isNull(four)) {
			System.out.println("four is Empty");
		}
		
		
	}
}
