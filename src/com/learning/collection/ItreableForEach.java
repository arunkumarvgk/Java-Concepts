package com.learning.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ItreableForEach {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		list.add("i");
		list.add("j");
		list.add("k");
		list.add("l");
		list.add(null);
		
		System.out.println("---------lamda exp---------");
		list.forEach((e)->{
			System.out.println("element is :: "+e);
		});
		
		System.out.println("---------API method---------");
		list.forEach(System.out::print);
		
		System.out.println("");
		
		System.out.println("---------Pass method---------");
		list.forEach(Filter::filter);
		
		System.out.println("---------Consmer---------");
		list.forEach(new Filter2());
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("------foreach return-------");
		System.out.println("list before :: "+list2);
		list2.forEach(Filter::square);
		System.out.println("list after :: "+list2);
	}

}

class Filter{
	static void filter(String s){
		if(s == null){
			System.out.println("null");
		}else if(s.equals("k")){
			System.out.println("Special K");
		}else{
			System.out.println(s);
		}
	}
	
	static int square(Integer i){
		return i*i;
	}
}

class Filter2 implements Consumer{

	@Override
	public void accept(Object arg0) {
		String s= (String)arg0;
		if(s == null){
			System.out.println("null");
		}else if(s.equals("k")){
			System.out.println("Special K");
		}else{
			System.out.println(s);
		}	
	}
	
}
