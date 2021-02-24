package com.String;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AniketJadhdav";
		String s2 = "order id is #12345";
		String s3 = "ORder id is #123456 ( test )";
		
		System.out.println(s2.substring(s2.indexOf("#"),s2.length()));
		System.out.println(s3.substring(s3.indexOf("#"),s3.indexOf("(")));
		System.out.println(s2.length());
		char a[] = s1.toCharArray();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		

	}

}
