package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Book{

	int id;
	String name;
	
	Book(int id, String name){
		this.id=id;
		this.name=name;
	}
	
}


public class ArrayListV2 {

	public static void main(String[] args) {
	
		Book b = new Book(1, "Aniket");
		Book b1= new Book(2, "Kadhav");
		
		ArrayList<Book> alb = new ArrayList<>();
		alb.add(b);
		alb.add(b1);
		
		for(Book bb:alb){
			int i = bb.id;
			String nm = bb.name;
			System.out.println(i+" "+nm);
		}
		
		System.out.println("while---------------");
		Iterator attt = alb.iterator();
		while(attt.hasNext()){
			Book b11 = (Book) attt.next();
			System.out.println(b11.id+"  "+b11.name);
		}

	}

}
