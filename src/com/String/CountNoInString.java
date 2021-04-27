package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNoInString {

	public static void main(String[] args) {

		String str = "aniket 1 is 12 or 1.23";
		
		Pattern regex = Pattern.compile("(\\d+(?:\\.\\d+)?)");
		 Matcher matcher = regex.matcher(str);
		String ss= "";
		 while(matcher.find()){
		        ss  = ss+ matcher.group(1)+" ";
		       
		}
		 System.out.println(ss);
		 String s1[] = ss.split(" ");
		 
		 
		
		int digit = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				digit++;
			}
		}
		System.out.println(digit);

	}

}
