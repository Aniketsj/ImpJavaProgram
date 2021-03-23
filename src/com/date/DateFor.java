package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFor {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat df = new SimpleDateFormat("yyMMdd");
		Date d = new Date();
		String dte = df.format(d);
		System.out.println(dte);
		
		String orderId = "21031800002222";
		System.out.println(orderId.length());
		
	}

}
