package com.learning.methodbinding.confuse;

public class Test {

	public static void main(String[] args) {
		/*new B().go(100);
		new B().go1(100);
		
		new A().go(100);
		new A().go1((byte)100);*/
		
		A ab= new B();
		//ab.go(10);
		//((B)ab).go1(14);
		
		A a= new A();
		B b= new B();
		
		System.out.println("----Instance Fields---------------------------------------------------------------");
		System.out.println("A a= new A() => a.i => prints i from class A "+a.i);
		System.out.println("B b= new B() => b.i => prints i from class B "+b.i);
		System.out.println("A ab= new B() => ab.i => prints i from class A "+ab.i);
		System.out.println("A ab= new B() but casted ((B)ab)=> ab.i => prints i from class B "+((B)ab).i);
		System.out.println();
		System.out.println();
		
		System.out.println("----Static Fields------------------------------------------------------------------");
		System.out.println("A.k =>  static  in Class A =>"+(A.k));
		System.out.println("B.k =>  static  in Class B =>"+(B.k));
		System.out.println("A a= new A() => a.k => prints k from class A "+a.k);
		System.out.println("B b= new B() => b.k => prints k from class B "+b.k);
		System.out.println("A ab= new B() => ab.k => prints k from class A "+ab.k);
		System.out.println("A ab= new B() but casted ((B)ab)=> ab.k => prints k from class B "+((B)ab).k);
		System.out.println();
		System.out.println();

		System.out.println("----Static Methods------------------------------------------------------------------");
		System.out.println("A.staticGO => calls static method in Class A =>"+(A.staticGO()));
		System.out.println("B.staticGO => calls static method in Class B =>"+(B.staticGO()));
		System.out.println("....................................................................................................................");
		System.out.println("Static methods should not be called via object but if called....");
		System.out.println("....................................................................................................................");
		System.out.println("A a= new A() => a.staticGO() => "+a.staticGO());
		System.out.println("B b= new B() => b.staticGO() => "+b.staticGO());
		System.out.println("A ab= new B() => ab.staticGO() => "+ab.staticGO());
		System.out.println("A ab= new B() but casted ((B)ab)=> ((B)ab).staticGO() => "+((B)ab).staticGO());
		System.out.println();
		System.out.println();
		
		System.out.println("----Instance Methods------------------------------------------------------------------");
		System.out.println("....................................................................................");
		System.out.println("Instance methods are overridden and calls the most specific method ie.. child's method if available...");
		System.out.println("....................................................................................");
		System.out.println("A a= new A() => a.instanceGO() => "+a.instanceGO());
		System.out.println("B b= new B() => b.instanceGO() => "+b.instanceGO());
		System.out.println("A ab= new B() => ab.instanceGO() => "+ab.instanceGO());
		System.out.println("A ab= new B() but casted ((B)ab)=> ((B)ab).instanceGO() => "+((B)ab).instanceGO());
		System.out.println();
		System.out.println();
		
		System.out.println("----Same method name but different parameter not overloaded--------------------------------------------------------");
		System.out.println("A a= new A() => a.go(10) => "+a.go(10));
		System.out.println("B b= new B() => b.go(10) => "+b.go(10));
		System.out.println("Even though it excatly matches method in B class as the reference type is A and method in A is compatible to fun call (i.e.. int to double castinf is valid) it calls Class A");
		System.out.println("A ab= new B() => ab.go(10) => "+ab.go(10));
		System.out.println("A ab= new B() but casted ((B)ab)=> ((B)ab).go(10) => "+((B)ab).go(10));
		
		System.out.println();
		System.out.println();
		System.out.println("When same fields are reassigned it gets new value");
		System.out.println("----Instance Fields when reassigned---------------------------------------------------------------");
		System.out.println("A a= new A() => a.j => prints j from class A "+a.j);
		System.out.println("B b= new B() => b.j => prints j from class B "+b.j);
		System.out.println("A ab= new B() => ab.j => prints j from class A "+ab.j);
		System.out.println("A ab= new B() but casted ((B)ab)=> ab.j => prints i from class B "+((B)ab).j);
		System.out.println();
		System.out.println();
		
		System.out.println("----Static Fields Instance Fields when reassigned------------------------------------------------------------------");
		System.out.println("A.l =>  static  in Class A =>"+(A.l));
		System.out.println("B.l =>  static  in Class B =>"+(B.l));
		System.out.println("A a= new A() => a.l => prints l from class A "+a.l);
		System.out.println("B b= new B() => b.l => prints l from class B "+b.l);
		System.out.println("A ab= new B() => ab.l => prints l from class A "+ab.l);
		System.out.println("A ab= new B() but casted ((B)ab)=> ab.l => prints l from class B "+((B)ab).l);
		
	}

}
