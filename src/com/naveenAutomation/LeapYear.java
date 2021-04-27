package com.naveenAutomation;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int yr = 2000;
		if(((yr%4==0)&&(yr%100!=0))||(yr%400==0)) {
			System.out.println("leap yr");
		}else {
			System.out.println("not leap yr");
		}
	}

}
