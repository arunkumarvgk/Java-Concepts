package com.learning.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueImpl {

	public static void main(String[] args) {
	/*	Queue<Integer> pq= new PriorityQueue<Integer>(5);
		Queue<Integer> pq1= new PriorityQueue<Integer>(5);
		
		pq.add(10);
		pq.add(23);
		pq.add(43);
		pq.add(57);
		// pq.add(null);  // Cannot have null values
		pq.add(123);
		pq.add(233);
		pq.add(321);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		
		System.out.println(pq1.poll()); // return Null if queue empty
		// System.out.println(pq1.remove()); // throws excep if empty
		System.out.println(pq1);
		
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		
		
		System.out.println(pq1.peek());// return Null if queue empty
		//System.out.println(pq1.element());// throws excep if empty
		System.out.println(pq1);
		*/
		
		System.out.println("=======================Comparator====================");
		Comparat com = new Comparat();
		//Queue<Comparat> comQueue = new PriorityQueue<Comparat>(com);
		Queue<Integer> comQueue = new PriorityQueue<Integer>();
		
		Random r= new Random();
		
		for(int k=0;k<10;k++){
			int m = r.nextInt(100);
			int n = r.nextInt(100);
			//System.out.println(m+" "+n+" "+(m+n));
			System.out.print("  "+m);
			comQueue.add(m);
		}
		System.out.println("");
		for(int c:comQueue){
			System.out.print("  "+c);
			//System.out.print(" "+(c.i+c.j));
		}
		
	}
	

}

class Comparat implements Comparator<Comparat> {
	int i;
	int j;
	
	Comparat(){
		this.i=0;
		this.j=0;
	}
	
	Comparat(int i,int j){
		this.i=i;
		this.j=j;
	}

	@Override
	public int compare(Comparat o1, Comparat o2) {
		if((o1.i)<(o2.i)){
			return -1;
		}/*if((o1.i+o1.j) == (o2.i+o2.j)){
			return 0;
		}*/else{
			return 1;
		}
	}

	
}
