package com.practice;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch = {'s','a','q','a'};
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate char: "+ch[i]);
				}
			}
		}
	}

}
