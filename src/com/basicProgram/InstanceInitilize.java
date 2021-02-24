package com.basicProgram;

public class InstanceInitilize {
	
	int a;
	
	{
		a=100;
	}
	public InstanceInitilize(){
		System.out.println("constructor");
	}
	
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInitilize i =new InstanceInitilize();
		
		
	}

}
