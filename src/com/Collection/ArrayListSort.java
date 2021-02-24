package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Aniket");
		al.add("Automation");
		al.add("ze");
		al.add("bb");
		al.add("bd");
		
		System.out.println("befor sort");
		for(String s:al){
			System.out.println(s);
		}
		System.out.println("afer sort");
		Collections.sort(al);
		for(String s:al){
			System.out.println(s);
		}
	}

}
