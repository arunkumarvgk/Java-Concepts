package com.learning.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeSorter<E> {

	public static  void main(String[] args) {
		Set<Employee> list = new HashSet<>();
		// List<Employee> list = new ArrayList<>();
		list.add(new Employee(102, "Zcc", 176.0));
		list.add(new Employee(101, "VF", 726.0));
		list.add(new Employee(99, "ASc", 576.0));
		list.add(new Employee(321, "BCcc", 976.0));
		list.add(new Employee(42, "ZML", 760.0));
		list.add(new Employee(02, "POc", 476.0));

		for (Employee e : list) {
			System.out.println(e.getId());
		}

		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {

				if (((Employee) o1).getId() > ((Employee) o2).getId()) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		System.out.println("==============================================================");
		for (Employee e : list) {
			System.out.println(e.getId());
		}
		
	}

}
