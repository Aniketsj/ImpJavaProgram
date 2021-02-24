package com.Inheritance;


public class SuperKeywords extends Demo{
	
	double salary;
	public SuperKeywords(double salary,int id,String name) {
	this.salary=salary;
	this.id=id;
	this.name=name;
	}
	
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywords s = new SuperKeywords(1.2,1,"name");
		
		s.display();
	}

}
