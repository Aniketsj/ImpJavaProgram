package com.String;

public class ReplaceWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "{\"testsdassadasdda\" sdsad\"hg";
//		str = str.replace("\"", "");
		System.out.println(str.substring(str.indexOf("t"),str.lastIndexOf("\"")));
		str = str.replace(str.substring(str.indexOf("t")+1,str.lastIndexOf("\"")),"");
		System.out.println(str);
	}

}
