package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int roll;
	String name;

	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
}

public class ArrayListStudent {

	public static void main(String[] args) {

		Student s = new Student(1, "Aniket");
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(s);
		Iterator itr = st.iterator();
		while (itr.hasNext()) {
			Student stt = (Student) itr.next();
			System.out.println(stt.roll);
			System.out.println(stt.name);
		}
		
		for(Student s1:st){
			System.out.println(s1.name);
			System.out.println(s1.roll);
		}
	}
}
