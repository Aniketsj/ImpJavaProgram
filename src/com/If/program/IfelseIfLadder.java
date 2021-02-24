package com.If.program;

public class IfelseIfLadder {

	public static void main(String[] args) {

		int mark = 58;
		
		if(mark<50){
			System.out.println("fail");
		}else if(mark<60){
			System.out.println("first class");
		}else if(mark<75){
			System.out.println("second class");
		}else if(mark>75){
			System.out.println("Pass");
		}else{
			System.out.println("not valid");
		}
		
		String result = (mark<50)?"Pass":"Fail";
		System.out.println("result is "+result);
	}


}
