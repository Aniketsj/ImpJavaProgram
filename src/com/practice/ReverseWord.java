package com.practice;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "Aniket Jadhav";
		String[] words = str.split(" ");
		String word  = "";
		
		String revString = "";
		for(int i= 0;i<words.length;i++) {
			word = words[i];
			String revWord = "";
			for(int k = word.length()-1;k>=0;k--) {
				revWord = revWord + word.charAt(k);
			}
			revString = revString + revWord +" ";
		}
		System.out.println(revString);

	}

}


/*
 * 
 * for (int i = 0; i < words.length; i++) {
			String word = words[i];
			
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}

			revw = revw + revWord + " ";		
		}
	
		System.out.println("reverse string is :  " + revw);
 */
