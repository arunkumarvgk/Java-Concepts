package com.learning.classesandobjects;

public class ConstructorExample2 {

	int id;
	int age;
	int salary;

	ConstructorExample2() {
		id=0;
		age=25;
		salary=45000;
	}

	ConstructorExample2(int id) {
		this.id=id;
	}

	ConstructorExample2(int id,int age,int salary) {
		this(id);
		this.age=age;
		this.salary=salary;
	}

	public static void main(String[] args) {
		ConstructorExample2 a= new ConstructorExample2(2,23,30000);
	}

}
