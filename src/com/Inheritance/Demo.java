package com.Inheritance;

public class Demo {
	
	int id;
	String name;
	int roll =1;
	
	public Demo(){
		System.out.println("this is default constructor");
	}
	
	public Demo(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public void parentMethod(){
		System.out.println("this is Parent class method");
	}
	
	public void parentMethod(int id, String name){
		
		System.out.println(id+"+test+"+name);
		
	}
	
}
