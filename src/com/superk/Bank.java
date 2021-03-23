package com.superk;

public class Bank {
	
	int id;
	int name;
	
	 Bank() {
		System.out.println("default constructor");
	}
	 
	 Bank(int id, int name){
		 this.id=id;
		 this.name=name;
	 }
	 
	 public void d() {
		 System.out.println("parent method");
	 }

}
