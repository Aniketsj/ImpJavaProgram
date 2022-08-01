package com.practice;

import java.util.ArrayList;

public class VerifyStringWithArrayList {

	public static void main(String[] args) {

		String str="aniket";
		ArrayList<String> al=new ArrayList<String>();
		al.add("test");
		al.add("automation");
		al.add("aniket");
		
		for(String s:al) {
			if(s.equalsIgnoreCase(str)) {
				System.out.println("equal");
			}else {
				System.out.println("Not equal");
			}
		}
	}

}
