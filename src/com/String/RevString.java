package com.String;

public class RevString {

	public static void main(String[] args) {
		int count=0;
		String a = "Aniket Jadhav";
		for(int i=a.length()-1;i>=0;i--){
			System.out.print(a.charAt(i));
		}
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!=' '){
				count++;
			}
		}
		System.out.println("count of space is ="+count);
		

	}

}
