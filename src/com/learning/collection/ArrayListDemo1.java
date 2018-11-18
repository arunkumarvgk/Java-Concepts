package com.learning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	public static void useListOverCollection() {
		// Collection<Integer> list If Collection interface is used then remove
		// will remove elemnt not elemtn at index
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(41);
		list.add(1);
		list.add(null);
		list.add(null);
		System.out.println(list);
		list.remove(new Integer(1)); // remove element 1
		list.remove(3);// remove element at index 3
		System.out.println(list);
	}
	
	public static void arraylistMethods() {
		// Collection<Integer> list If Collection interface is used then remove
		// will remove elemnt not elemtn at index
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();
		
		list1.add(9999);
		list2.add(8888);
		list3.add(90);
		
		list.add(1);
		list.add(41);
		list.add(1);
		list.add(null);
		list.add(null);
		System.out.println(list);
		//list.remove(new Integer(1)); // remove element 1
		//list.remove(3);// remove element at index 3
		//System.out.println(list);
		
		list.add(1, 11);
		System.out.println("Add at pos 1 -> list.add(1, 11) :: "+list);
		list.add(32);
		System.out.println("Add at end -> list.add(32) :: "+list);
		list.addAll(list1);
		System.out.println("Add All list1 -> list.addAll(list1) :: "+list);
		list.addAll(1,list2);
		System.out.println("Add All list2 at index 1 -> list.addAll(1,list2) :: "+list);
		
		System.out.println("list.contains(2) :: "+list.contains(2));
		System.out.println("list ==>  "+list);
		System.out.println("list.contains(new Integer(90)) :: "+list.contains( new Integer(90)));
		list.addAll(list3);
		System.out.println("list ==>  "+list);
		System.out.println("After adding list 3 now list.contains(new Integer(90)) :: "+list.contains(new Integer(90)));
		
		//list.forEach(action);
		System.out.println("list.get(4) :: "+list.get(4));
		/*for(Iterator i : list.listIterator()){
			
		}
		*/
		
		for(int elem :  list){
			list.add(0);
		}
		
		System.out.println("list.indexOf(null) :: "+list.indexOf(null));
		System.out.println("list.lastIndexOf(1) :: "+list.lastIndexOf(1));
		System.out.println("list.remove(0) index remove 0th element :: "+list.remove(0));
		System.out.println("list ==>  "+list);
		System.out.println("list.remove(new Integer(342)) element remove :: "+list.remove(new Integer(342)));
		System.out.println("list.removeAll(list3) :: "+list.removeAll(list3));
		System.out.println("list ==>  "+list);
		List<Integer> list5=list.subList(2, 5);
		System.out.println("list.subList(2, 5) :: "+list.subList(2, 5));
		
		System.out.println("list ==>  "+list);
		System.out.println("list5 sublist ==>  "+list5);
		list5.add(1342);
		// any changes made to list5 reflects in list
		System.out.println("list ==>  "+list);
		System.out.println("list5 sublist ==>  "+list5);
		
		list5.remove(new Integer(41));
		
		System.out.println("list ==>  "+list);
		System.out.println("list5 sublist ==>  "+list5);
		
		System.out.println("list.size() :: "+list.size());
		System.out.println("list.retainAll(list2) :: "+list.retainAll(list2));
		System.out.println("list ==>  "+list);
		
		System.out.println("list.set(list.size()-1, 10000) :: returns previous element at this pos "+list.set(list.size()-1, 10000) );
		System.out.println("set 10000 at "+(list.size()-1)+"th index :: "+list);
		System.out.println("list.toArray() :: "+list.toArray().toString());
	
		
		
	}
	
	public static void main(String[] args) {
		// useListOverCollection();
		arraylistMethods();
	}

}
