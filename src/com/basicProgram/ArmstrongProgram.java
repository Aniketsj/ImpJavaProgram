package com.basicProgram;

public class ArmstrongProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=153,rem,sum=0;
		int temp=no;
		
		while(no>0){
			System.out.println("loop start-------------");
			rem = no % 10;
			//3,5,1
			System.out.println("rem---"+rem);
			no = no / 10;
			//15, 1
			System.out.println("no----------"+no);
			sum = sum + (rem*rem*rem);
			System.out.println("sum-----------"+sum);
			System.out.println("----------------------loop end");
		}
		
		if(temp==sum){
			System.out.println("arm");
		}else{
			System.out.println("not arm");
		}
		

	}

}
