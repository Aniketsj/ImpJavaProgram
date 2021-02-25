package com.basicProgram;

public class RevNumber {

	public static void main(String[] args) {

		int rev=0;
		int no =12345;
		int rem;
		String a =String.valueOf(no);
		System.out.println("int to string");
		for(int i=a.length()-1;i>=0;i--){
			System.out.println(a.charAt(i));
		}
		
		System.out.println("no");
		while(no!=0){
		rem = no%10;
		rev=rev*10+rem;
		no=no/10;
			
		
		}
		System.out.println(rev);

	}

}
