package com.practice;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "java programming";
		String revw = "";
	
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}

			revw = revw + revWord + " ";		
		}
	
		System.out.println("reverse string is :  " + revw);

	}

}
