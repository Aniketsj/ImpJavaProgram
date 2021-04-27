package com.practice;

public class DupChar {

	public static void main(String[] args) {

		String str = "aniket sambhaji jadhav";
		char[] s = str.toCharArray();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			count =1;
			for(int k=i+1;k<str.length();k++) {
				if(s[i]==s[k]&&s[k]!=' ') {
					count++;
					s[k]='0';
				}
			}
			if(count>1&&s[i]!='0') {
				System.out.println(s[i]+" "+count);
			}
		}

	}

}
