package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList();
		str.add("a");
		str.add("z");
		str.add("t");
		str.add("r");
		Iterator itr = str.iterator();
		while(itr.hasNext()){
			Object ret = itr.next();
			System.out.println(ret);
		}
		ArrayList<String> str1 = new ArrayList<>();
		str1.add("new");
		str1.add("z");
		str1.addAll(str);
		System.out.println(str1);
		
		Collections.sort(str);
		System.out.println(str);
		for(String a : str){
			System.out.println(a);
		}
		System.out.println("strrrrrrrrrrrrrrrrrrrrrrrr");
		System.out.println(str);
		str.remove(1);
		System.out.println(str);
		System.out.println("str1 "+str1);
		str1.removeAll(str);
		System.out.println("str1 "+str1);
	}

}
