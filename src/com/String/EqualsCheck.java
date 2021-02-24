package com.String;

public class EqualsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1 = "Aniket";
		String a2 = "Aniket";
		String a3 = new String("Aniket");
		
		System.out.println(a1.equals(a2));
		System.out.println(a1==a3);

	}

}
