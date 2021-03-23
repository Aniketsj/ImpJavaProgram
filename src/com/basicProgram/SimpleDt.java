package com.basicProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDt {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM/dd/yyyy");
		String formatedDate = simpleDateFormat.format(date);
		System.out.println(formatedDate);
		
		

	}

}
