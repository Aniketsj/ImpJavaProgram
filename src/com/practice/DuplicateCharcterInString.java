package com.practice;

public class DuplicateCharcterInString {

	public static void main(String[] args) {

		String str = "aniket sambhaji jadhav";
		char[] ch = str.toCharArray();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			count =1;
			for(int k=i+1;k<str.length();k++) {
				if(ch[i]==ch[k]&&ch[k]!=' ') {
					count++;
					ch[k]='0';
				}
			}
			if(count>1&&ch[i]!='0') {
				System.out.println(ch[i]);
			}
		}
	}

}
