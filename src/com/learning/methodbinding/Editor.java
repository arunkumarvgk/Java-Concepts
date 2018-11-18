package com.learning.methodbinding;

public class Editor extends Staff{
	public void approveReview() {
		System.out.println("Editor :: approve review");
	}

	public void rejectReview() {
		System.out.println("Editor :: reject review");
	}
	
	public static void main(String[] args) {
		User u = new Editor();
		//u.saveWebLink();
		u.postAReview("");
		//u.staticMethod();
	}
}
