package com.conversion;

import java.text.DecimalFormat;

public class DecimalFormat1 {

	public static void main(String[] args) {
		String price = "22.05";
		double d = Double.parseDouble(price);
		System.out.println(d);
		DecimalFormat df = new DecimalFormat("0.000");
		String convert = df.format(d);
		System.out.println(convert);
		
		
	}

}
