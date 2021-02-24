package com.String;

public class CountTotalNoOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Aniket Sambhaji Jadhav";
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				count++;
			}
		}
		System.out.println("Count of the string is = "+count);

	}

}
