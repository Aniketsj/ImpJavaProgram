package com.String;

public class IndexOfStringCheck {

	public static void main(String[] args) {

		String str= "This is Aniket Jadhav";
		System.out.println(str.substring(str.indexOf("is",4)));
		String a = str.substring(str.indexOf("A"),str.indexOf("J")-1);
		System.out.println(a);

		if(!str.isEmpty()){
			System.out.println("string is not empty");
		}
		if(str.length()==0){
			System.out.println("empty");
		}else{
			System.out.println("not empty");
		}
	}

}
