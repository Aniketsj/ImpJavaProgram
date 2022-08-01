package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class BookMain {

	public static void main(String[] args) {

		Book b1 = new Book(1, "aniket", "AJ");
		Book b2 = new Book(2, "Damini", "DK");
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			System.out.println(b.id + " " + b.name + " " + b.author);
		}

		for (Book b : al) {
			System.out.println(b.id + " " + b.name + " " + b.author);
		}

	}

}
