package com.String;

public class CountNoOfSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Aniket Jadhav";
		int count = 0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!=' '){
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println(a.endsWith("v"));
	}

}
