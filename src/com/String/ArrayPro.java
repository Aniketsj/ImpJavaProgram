package com.String;

import java.util.Arrays;

public class ArrayPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "4+2+5+6+1";
		String s1 = "";
		char[]ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		int count =0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='+') {
				count++;
			}
		}
		System.out.println("count is "+count);
		for(int i=count;i<ch.length;i++) {
			s1 = s1 + ch[i]+"+";
		}
		System.out.println("s1="+s1);
		String s2  = s1.substring(0,s1.lastIndexOf("+"));
		
				System.out.println("s2="+s2);
	}

}
