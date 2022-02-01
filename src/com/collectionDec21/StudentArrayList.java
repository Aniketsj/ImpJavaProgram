package com.collectionDec21;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "Aniket", "Sinhgad");
		Student s2 = new Student(2, "Test", "Sinhgad");
		Student s3 = new Student(3, "Automation", "Sinhgad");
		Student ss=new Student(11, "a", "aa");

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(ss);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.collage);
		}
	}

}
