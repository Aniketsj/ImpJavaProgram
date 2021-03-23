package com.String;

public class ReverseWord {

	public static void main(String[] args) {
		int count = 0;
		int cont = 0;
		String str = "Aniket Sambhaji Jadhav Automation";
		String rr1 = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ') {
				count++;

				if (count == 1) {
					String ss = str.substring(0, i);
					
					//
					for(int ii = ss.length()-1;ii>=0;ii--) {
					rr1	= rr1 + ss.charAt(ii);
					}
					System.out.println(rr1);
					
					///
					StringBuilder sb = new StringBuilder(ss);
					StringBuilder rev1 = sb.reverse();
					cont = i + 1;

//					System.out.println(rev1);
				} else {
					String ss1 = str.substring(cont, i);

					StringBuilder sb = new StringBuilder(ss1);
					StringBuilder rev2 = sb.reverse();
					cont = i + 1;
					System.out.println(rev2);

				}
			}
		}

		String sss = str.substring(cont, str.length());

		StringBuilder sb = new StringBuilder(sss);
		StringBuilder rev1 = sb.reverse();
		System.out.println(rev1);
	}
	public static String revString(String revS) {
		String rev = "";
	
		for(int i = revS.length()-1;i>=0;i--) {
			rev	= rev + revS.charAt(i);
	}
		return rev;

}
}
