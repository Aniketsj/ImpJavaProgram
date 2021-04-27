package com.String;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		
		String str = "aniket jadheaev";
		int count = 0;
		String dp = "" ;
		char[] s = str.toCharArray();
		for(int i=0;i<str.length()-1;i++) {
			for(int k=i+1;k<str.length()-1;k++) {
				count = 1;
				if(s[i]==s[k]&&s[i]!=' ') {
					count++;
					s[k]='0';
					
				}
			}
			if(count>1&&s[i]!='0') {
				System.out.println(s[i]);
				
			}
		}
		
	}

}
