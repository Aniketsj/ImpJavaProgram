package com.Collection;

import java.util.ArrayList;

public class ArrayListRemoveRetainClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(4);
		
		for(int a :al){
			System.out.println(a);
		}
		System.out.println("***************");
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(3);
		al1.add(1);
		al.addAll(al1);
		
		for(int a :al){
			System.out.println(a);
		}
		System.out.println("after remove");
		al.remove(1);
		for(int a :al){
			System.out.println(a);
		}
		
		al.retainAll(al1);
		System.out.println("*************After retain");
		for(int a :al){
			System.out.println(a);
		}
		
		al.clear();
		System.out.println("*************After clear");
		for(int a :al){
			System.out.println(a);
		}

	}

}
