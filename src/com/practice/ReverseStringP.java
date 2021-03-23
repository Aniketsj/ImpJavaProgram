package com.practice;

public class ReverseStringP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Aniket";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			//System.out.print(str.charAt(i));
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rever = sb.reverse();
		System.out.println("string buffer = "+rever);
		
		int i = 12345;
		StringBuffer stt = new StringBuffer(String.valueOf(i));
		StringBuffer revvv = stt.reverse();
		System.out.println(revvv);
	}

}
