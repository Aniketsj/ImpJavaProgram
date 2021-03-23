package com.String;

public class RevEachWord {

	public static void main(String[] args) {

		String str = "Aniket Jadhav Test";
		char[] ch = str.toCharArray();
		int count = 0;
		int nextCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ') {
				count++;
				if (count == 1) {
					String ss1 = str.substring(0, i);
					
					String r1 = revS(ss1);
					System.out.print(r1+" ");
					nextCount = i + 1;
				} else {
					String ss2 = str.substring(nextCount, i);
					
					String r2 = revS(ss2);
					System.out.print(r2+" ");
					nextCount = i + 1;
				}
			}

		}
		String ss3=str.substring(nextCount, str.length());
		
		String r2 = revS(ss3);
		System.out.print(r2+" " );
		

	}
	
	public static String revS(String str) {
		String revString = "";
		for(int i = str.length()-1;i>=0;i--) {
			revString = revString + str.charAt(i);
		}
		return revString;
	}

}
