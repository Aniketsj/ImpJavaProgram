package com.String;

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		String str = "Aniket Sambhaji Jadhav";
		
		str = str.toLowerCase();
		int vowelsCount = 0;
		int consonants = 0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowelsCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				consonants++;
			}
			
		}
		System.out.println("vowels count is "+vowelsCount);
		System.out.println("Consonanats count is "+consonants);
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
