package com.String;

public class IndexOf {

	public static void main(String[] args) {

		String str = "Aniketiket of jadhav of";
		System.out.println(str.indexOf("i",3));
		System.out.println(str.substring(str.indexOf("i",4), str.length()));
		
		String a = "Order id is #12345 (new)";
		String orderid = a.substring(a.indexOf("#"), a.indexOf("(")-1);
		System.out.println(orderid);
		System.out.println(str.isEmpty());
		String aa = "";
		String aaa = null;
		System.out.println(aa.isEmpty());
		System.out.println(aa.length()==0);
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i",3));
		
		System.out.println(str.lastIndexOf("i"));
		System.out.println(str.lastIndexOf("of"));
		System.out.println(str.lastIndexOf("of",11));
		
		System.out.println(str.replace("a", "$"));
		System.out.println(str.replaceAll("\\s", ""));
		
	}

}
