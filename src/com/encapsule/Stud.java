package com.encapsule;

public class Stud {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("aniket");
		String s = s1.getName();
		System.out.println(s);

		s1.setId(1);
		int a = s1.getId();
		System.out.println(a);

		int aa = s1.geta();
		System.out.println(aa);
	}

}
