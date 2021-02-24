package com.String;

public class NoOfVowelAndConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Aniket";
		int count = 0, con=0;
		// count vowel
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a'||str.charAt(i)=='A'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}else if(str.charAt(i)>='a'||str.charAt(i)>='A'&&str.charAt(i)<='z'||str.charAt(i)<='Z'){
			con++;	
			}

		}
		System.out.println(count);
		System.out.println(con);
	}

}
