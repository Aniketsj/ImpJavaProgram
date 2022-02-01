package com.collectionDec21;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		Book b = new Book(1, "English", "Aniket"), b1 = new Book(2, "Automation", "Aniket"),
				b2 = new Book(3, "Test", "Aniket");

		List<Book> l = new ArrayList<Book>();
		l.add(b);
		l.add(b1);
		l.add(b2);

		for (Book a : l) {
			System.out.println(a.no + " " + a.name + " " + a.author);
		}
	}

}
