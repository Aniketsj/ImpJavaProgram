package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList18Student {

	public static void main(String[] args) {
		Student18 st = new Student18("Aniket", 1);
		Student18 st1 = new Student18("Jadhav", 2);
		
		ArrayList<Student18> al =new ArrayList<>();
		al.add(st);
		al.add(st1);
		System.out.println("al size = "+al.size());
		System.out.println(al);
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Student18 std = (Student18) it.next();
			System.out.println(std.id);
			System.out.println(std.name);
		}
	}

}
