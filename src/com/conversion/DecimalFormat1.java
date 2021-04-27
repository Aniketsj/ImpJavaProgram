package com.conversion;

import java.text.DecimalFormat;

public class DecimalFormat1 {

	public static void main(String[] args) {
		String price = "22.00";
		double d = Double.parseDouble(price);
		System.out.println(d);
		DecimalFormat df = new DecimalFormat("0.00");
		String convert = df.format(d);
		System.out.println(convert);
		
		
	}

}
