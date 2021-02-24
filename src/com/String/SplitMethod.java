package com.String;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Aniketjadhav@gmail.com";
		String s1 ="Aniket jadhav Automation engineer";
		String sword []=s1.split("\\s");
		for(String b:sword){
			System.out.println(b);
		}
		
		String[] s =str.split("@");
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		String email = "Aniketjadhav2000@gmail.com";
		String e[]= email.split("@");
		
		System.out.println(e[0]+"@"+"yopmail.com");
		
		

	}

}
