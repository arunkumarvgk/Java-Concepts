package com.learning.polymorphism;

public class User {

	public void saveWebLink() {
		System.out.println("User :: save web link");
		postAReview();
	}

	public void saveMovie() {
		System.out.println("User :: save movie");
	}

	public void saveBook() {
		System.out.println("User :: save book");
	}

	public void rateBookmark() {
		System.out.println("User :: rate bookmark");
	}

	public void postAReview() {
		System.out.println("User :: post a review");
	}

	public static void main(String[] args) {
		User u = new User();
		u.saveWebLink();
	}

}
