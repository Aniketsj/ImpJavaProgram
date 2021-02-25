package com.String;

public class CheckPalindromeString {

	public static void main(String[] args) {

		String str = "nitin";
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		
		if(str.equals(sb.toString())){
			System.out.println("Palindrome");
		}else{
			System.out.println("not palindrome");
		}
		String rev = "";
		for(int i=str.length()-1;i>=0;i--){
			char a= str.charAt(i);
			
			rev=rev+a;
			
		}
		
		if(rev.equals(str)){
			System.out.println("Palindrome");
		}else{
			System.out.println("not Palindrom");
		}
	}

}
