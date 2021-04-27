package com.String;

public class DuplicateChar {

	public static void main(String[] args) {
		String s1 = "aniket jadhav automation";
		char[] ch = s1.toCharArray();
		int count =0;
		for(int i=0;i<s1.length();i++) {
			count= 1;
			for(int k=i+1;k<s1.length();k++) {
				if(ch[i]==ch[k]&&ch[k]!=' ') {
					count++;
					ch[k]= '0';
				}
			}
			if(count>1&&ch[i]!='0') {
				System.out.println(ch[i]+" "+count);
			}
		}

	}

}
