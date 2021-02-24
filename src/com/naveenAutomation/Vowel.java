package com.naveenAutomation;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Aniket";
		int vow = 0;
		
		char ch[] = str.toCharArray();
		
		for(int i =0;i<ch.length;i++){
			if(ch[i]=='a'||ch[i]=='e'){
				vow++;
			}
		}
		System.out.println(vow);

	}

}
