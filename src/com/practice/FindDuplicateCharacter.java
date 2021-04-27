package com.practice;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String str = "Automation Testing Engineer";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		
		
		int count = 0;
		for(int i =0;i<ch.length;i++) {
			count = 1;
			for(int k=i+1;k<ch.length;k++) {
				if(ch[i]==ch[k]&&ch[k]!=' ') {
					count++;
					ch[k]='0';
				}
			}
			if(count>1&&ch[i]!='0') {
				System.out.println(ch[i]+"  "+count);
			}
		}

	}

}
