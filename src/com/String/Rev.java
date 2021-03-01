package com.String;

public class Rev {

	public static void main(String[] args) {

		String re= "Aniket";
		
		char[] c = re.toCharArray();
		System.out.println(c.length);
		for(int i =c.length;i>=0;i--){
			System.out.println(c[i]);
		}
	}

}
