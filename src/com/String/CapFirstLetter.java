package com.String;

public class CapFirstLetter {

	public static void main(String[] args) {

		String st = "i am aniket";
		String[] s = st.split(" ");
		
		String cap = "";
		for(int i =0;i<s.length;i++) {
			cap = s[i].substring(0,1).toUpperCase();
			String f  = s[i].substring(1).toLowerCase();
			String a = cap + f+" ";
			System.out.print(a);
		}
		String cap1= "";
		for(String ss : s) {
			cap1  = ss.substring(0,1).toUpperCase();
			String aa = ss.substring(1).toLowerCase();
			String all = cap1 + aa +" ";
			System.out.print(all);
		}

	}

}
