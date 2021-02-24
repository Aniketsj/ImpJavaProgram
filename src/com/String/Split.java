package com.String;

public class Split {

	public static void main(String[] args) {

		String str = "Aniket Jadhav Website page";
		String[] s = str.split("\\s");
		for(String ss:s){
			System.out.println(ss);
		}
		String date = "22-Jan-2021";
		String[] d = date.split("-");
		String day = d[0];
		String month = d[1];
		String year = d[2];
		
		System.out.println(day+"-"+year+month);
		
	}

}
