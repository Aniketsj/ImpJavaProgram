package com.String;

public class ReverseEachWordUsingSplit {

	public static void main(String[] args) {
		String str = "aniket sambhaji jadhav";
		String word = "";
		String rv = "";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			word =  words[i];
			rv = rv + revString(word) + " ";
		}
		System.out.println(rv);

	}

	public static String revString(String str) {
		String revst = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revst = revst + str.charAt(i);
		}

		return revst;
	}

}
