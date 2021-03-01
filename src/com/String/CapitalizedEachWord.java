package com.String;

public class CapitalizedEachWord {

	public static void main(String[] args) {
		String a ="i aM aniket";
		String cap="";
		String[]arr = a.split("\\s");
		for (String string : arr) {
			cap=string.substring(0,1).toUpperCase();
			String afterFirst = string.substring(1);
			String all = cap+afterFirst.toLowerCase()+" ";
			System.out.print(all);
					
		}
		
		
		

	}

}
