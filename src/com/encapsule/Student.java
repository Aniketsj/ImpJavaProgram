package com.encapsule;

public class Student {
	
	private String name;
	private int id;
	private int a = 10;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public int geta() {
		return a;
	}

}
