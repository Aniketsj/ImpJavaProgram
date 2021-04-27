package com.String;

public class CountWord {

	public static void main(String[] args) {
		int count = 0;
		String str = "aniket jadhav welcome";
		String[]s = str.split("\\s");
		System.out.println(s.length);
		
		System.out.println("***************");
		for(int i=0;i<str.length()-1;i++){
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("count is:"+count);
	}

}
