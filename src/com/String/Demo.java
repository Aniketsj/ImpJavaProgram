package com.String;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Demo {

	public static void main(String[] args) {
	int a[] =new  int[5];
	a[1]= 2;
	a = new int[3];
	
	System.out.println(a[1]);
	
	// local date
	
	LocalDate ld =LocalDate.of(2018, 3, 22);
	ld.plusDays(-5);
	System.out.println(ld);
	LocalDate d = ld.plusDays(5);
	System.out.println(d);
	

}
}
