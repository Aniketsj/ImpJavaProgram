package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Aniket");
		list.add("Selenium");
		list.add("Automation");
		list.add("Java");
		
//		String []s=new String[5];

		String[]s = list.toArray(new String[list.size()]);
		
		for (String string : s) {
			System.out.println(string);
		}
	}

}
