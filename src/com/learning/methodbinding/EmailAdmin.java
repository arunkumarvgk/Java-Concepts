package com.learning.methodbinding;

public class EmailAdmin extends Staff {
	public void handleEmailCampaign() {
		System.out.println("EmailAdmin :: handle email campaign");
	}
	
	public static void main(String[] args) {
		User u = new User();
		u.saveWebLink();
	}

}
