package com.String;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Aniket";
		
		String reverseStr = "";
		for(int i=str.length()-1;i>=0;i--){
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println(reverseStr);
		
		
		int no = 12345;
		int rem;
		int rev = 0;
		while(no!=0){
		rem = no % 10;
		rev = rev * 10 +rem;
		no = no / 10;
		}
		
		System.out.println(rev);
		

	}

}
