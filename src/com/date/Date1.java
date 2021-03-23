package com.date;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date date = new Date();
		System.out.println("Date  = " + date);
		String dt = DateFormat.getInstance().format(date);
		System.out.println(dt);
		String dt1 = DateFormat.getDateInstance().format(date);
		System.out.println(dt1);
		String dt2 = DateFormat.getTimeInstance().format(date);
		System.out.println(dt2);
		String dt3 = DateFormat.getDateTimeInstance().format(date);
		System.out.println(dt3);
		String dateformatShort = DateFormat.getTimeInstance(DateFormat.SHORT).format(date);
		System.out.println(dateformatShort);
		String dateformatMedium = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date);
		System.out.println(dateformatMedium);
		String dateformatLong = DateFormat.getTimeInstance(DateFormat.LONG).format(date);
		System.out.println(dateformatLong);
		String dateformatShort1 = DateFormat.getDateInstance(DateFormat.SHORT).format(date);
		System.out.println(dateformatShort1);
		String dateformatMedium2 = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		System.out.println(dateformatMedium2);

		String dateformatLong2 = DateFormat.getDateInstance(DateFormat.LONG).format(date);
		System.out.println(dateformatLong2);
		
		//convert string to date
		String d = "31 Mar, 2015";
		Date dd1 = DateFormat.getInstance().parse(d);
		System.out.println(dd1);
	}

}
