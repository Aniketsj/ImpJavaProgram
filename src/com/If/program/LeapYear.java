package com.If.program;

public class LeapYear {

	public static void main(String[] args) {

		//leap year or not
		int year =2012;
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0)){
			System.out.println("Leap year "+year);
		}else{
			System.out.println("Not Leap year "+year);
		}
	}

}
