package com.String;

public class ExtractIntegerCount {

	public static void main(String[] args) {
		int no = 0;
		String str = "2 b 23 f 1.2";
		Boolean isPrevisousCharacter = false;

		for (int i = 0; i < str.length(); i++) {
			boolean isDigit = Character.isDigit(str.charAt(i));

			if (!isDigit) {
				System.out.println("inside !isDigit ="+str.charAt(i));
				isPrevisousCharacter = false;
			} else if (!isPrevisousCharacter) {
				System.out.println("inside !isPrevisousCharacter= "+str.charAt(i));
				if (isDigit) {
					System.out.println("inside isDigit="+str.charAt(i));
					no++;
					isPrevisousCharacter = true;
				}
			}
		}
		System.out.println(no);

	}

}
