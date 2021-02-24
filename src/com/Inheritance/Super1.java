package com.Inheritance;

public class Super1 extends Demo {

	String ab = "aniket";
String salary;
	public Super1(){
		
		System.out.println("this is child class constructor.");
	}
	public Super1(String salary,int id, String name){
		super(id,name);
		this.salary=salary;
	}	
	public void display(){
		System.out.println(ab);
		System.out.println(super.roll);
		super.parentMethod();
		super.parentMethod(super.id, super.name);
	}
	public static void main(String[] args) {

		Super1 s = new Super1("t",1,"na");
		s.display();
	}

}
