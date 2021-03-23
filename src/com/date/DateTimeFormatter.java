package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatter {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MMMM/yyy HH:mm:ss");
		Date dt = new Date();
		String sDate = formatter.format(dt);
		System.out.println(sDate);
		
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date dt1 = new Date();
		String sDate1 = formatter.format(dt1);
		System.out.println(sDate1);
		
		formatter = new SimpleDateFormat("dd-MM-yy hh:mm:ss");
		Date dt2 = new Date();
		String sDate2 = formatter.format(dt2);
		System.out.println(sDate2);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		Date dt3 = new Date();
		String sd3 = formatter.format(dt3);
		System.out.println(sd3);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		Date dt4 = new Date();
		String st4 = formatter.format(dt4);
		System.out.println(st4);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss z");
		Date dt5 = new Date();
		String s5 = formatter.format(dt5);
		System.out.println(s5);
				
		formatter = new SimpleDateFormat("E, dd MMMM yyyy hh:mm:ss zzzz");
		Date d6 = new Date();
		String s6 = formatter.format(d6);
		System.out.println(s6);
		
		formatter = new SimpleDateFormat("dd/MMMM/yyyy");
		Date dd = formatter.parse("11/March/2021");
		System.out.println(dd);
		
		
	}

}

