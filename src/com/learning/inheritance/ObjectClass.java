package com.learning.inheritance;

public class ObjectClass {
	
	public static int k=0;
	public int l=0;
	
	public ObjectClass clone(){
		ObjectClass ob=new ObjectClass();
		ob=this;
		return ob;
	}
	
	public static void main(String[] args) {
		/*ObjectClass a= new ObjectClass();
		ObjectClass b= new ObjectClass();
		
		a.l=98;
		System.out.println(a.l);
		System.out.println((a.getClass()));
		System.out.println((a.getClass()).getName());
		System.out.println(a.getClass().getName()+"@"+Integer.toHexString(a.hashCode()));
		System.out.println(a.toString());
		
		
			ObjectClass c=a.clone();
			System.out.println(c.l);
		
	
		System.out.println(a.equals(b));
		System.out.println("A".equals("A"));*/
		
		String anil="Anil";
		
		for(int i=anil.length()-1;i>=0;i--){
			anil+=anil.charAt(i);
			
			System.out.print(anil.charAt(i));
		}
		
		System.out.println(anil);
	}

}
