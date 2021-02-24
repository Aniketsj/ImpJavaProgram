package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {

		String[] arr = {"Aniket","Jadhav","Automation","Java"};
		
		System.out.println(Arrays.toString(arr));
		ArrayList<String> al = new ArrayList<>();
		
		System.out.println("add into arraylist  ");
		
		for(String aladd:arr){
			al.add(aladd);
			
		}
		
		
		System.out.println("--------------print arraylist");
		for(String b:al){
			System.out.println(b);
		}
		
	}

}
