package com.String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy");
		String dt =sdf.format(d);
		System.out.println(dt);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy hh:mm::ss z");
		LocalDateTime ldt=LocalDateTime.now();
		String dt1= sdf1.format(d);
		System.out.println(dt1+" "+ldt);
	}

}
