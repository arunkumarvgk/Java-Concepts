package com.learning.reference;

public class ReferenceTest {

	private void test1(int i, Integer j, String sa, String as, Employee e) {
		System.out.println(i+" "+j+" "+sa+" "+as+" "+e.name);
		
		i = 10;
		j = 20;
		sa = "sa_1";
		as = "as_1";
		e.name = "Updated";
	}

	private void test2(Employee e) {
		e = new Employee();
		e.name ="New name";
	}

	public static void main(String[] args) {
		ReferenceTest r = new ReferenceTest();
		int i = 1;
		Integer j = 2;
		String sa = "sa_0";
		String as = new String("as_0");
		Employee e = new Employee();
		e.name="Created";
		
		System.out.println(i+" "+j+" "+sa+" "+as+" "+e.name);
		r.test1(i, j, sa, as, e);
		System.out.println(i+" "+j+" "+sa+" "+as+" "+e.name);
		
		r.test2(e);
		System.out.println(e.name);
	}
}

class Employee {
	String name;
}
