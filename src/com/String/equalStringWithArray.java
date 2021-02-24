package com.String;

import java.util.ArrayList;

public class equalStringWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Jadhav";
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Aniket");
		a.add("Jadhav");
		a.add("Automation");
		
		for(String t:a){
			if(t.equals(str)){
				System.out.println("Equal");
			}else{
				System.out.println("not equal");
			}
			System.out.println(t);
		}
		
		

	}

}
