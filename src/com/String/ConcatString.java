package com.String;

public class ConcatString {

	public static void main(String[] args) {

		String a = "Aniket";
		String b = "Jadhav";
		String a1 = "a1";
		int count=0;
		String result = a.concat(b.concat(a1));
		String aa = a.concat(b).concat(a1);
		System.out.println(aa);
		System.out.println(result);
		String check = "Aniket Jadhav test";
		for(int i=0;i<check.length();i++){
			if(check.charAt(i)!=' '){
				count++;
			}
		
		}
		System.out.println(count);
				
	}

}
