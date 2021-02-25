package com.String;

public class Split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aniket,jadhav,@gmail.com";
		String[] arr = a.split(",");
		for (String string : arr) {
			System.out.println(string);
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	
	}

}
