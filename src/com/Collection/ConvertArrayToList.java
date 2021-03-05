package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {

		String[] s= {"aniket","java","automation","Selenium"};
		
		
				
		List<String> list=new ArrayList<String>();
		for(int i=0;i<s.length;i++) {
			
			list.add(s[i]);
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}

