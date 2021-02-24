package com.String;

public class IndexOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Aniket Sambhaji Jadhav";
		System.out.println(str.indexOf("a",9));
		
		System.out.println(str.charAt(str.indexOf("a")));
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf("a"));
		
		String str1 ="";
		String str2 ="aniket";
		String str3 ="jadhav";
		
		System.out.println(str1==null);
		if(str2.length()>0){
			System.out.println("str 2 present");
		}
		
		if(str1.length()>0){
			System.out.println("str1 presetn");
		}else{
			System.out.println("not present");
		}
		
		String date = String.join(":", "1","2","2021");
		System.out.println(date);
		
		String strr = "/asds/adsad/sadas.feature";
		
		strr = strr.substring(strr.lastIndexOf("/")+1);
		System.out.println(strr);
		
		String strrr1 = "	AniketJadhav \n";
		
		strrr1= strrr1.replaceAll("\\n", "");
		System.out.println(strrr1);
	}

}
