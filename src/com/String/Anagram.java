package com.String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "aniket";
		String s2 = "niketa";
		
		if(s1.length()!=s2.length()) {
			System.out.println("not anagram");
		}else {
			char[]ch = s1.toCharArray();
			char[]ch1=s2.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if(Arrays.equals(ch, ch1)==true) {
				System.out.println("equal");
			}
			
		}
		
	}

}
