package com.Collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListJava {

	public static void main(String[] args) {

		//convert array to list
		String [] arr = {"a","b","w","r"};
		
		System.out.println(Arrays.toString(arr));
		List<String> list = new ArrayList<>();
		
		for(String a : arr){
			list.add(a);
		}
		System.out.println(list);
		for(String b : list){
			System.out.println("listtttttttttttt  "+b);
		}
		
		
	}

}
