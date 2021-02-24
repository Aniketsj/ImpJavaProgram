package com.Arrays;

public class FirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=14;
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			if(a[i]==11){
				System.out.println("it's 11");
			}else{
				System.out.println("not available");
			}
		}
		System.out.println("for each-------------------------------------------");
		for(int arr:a){
			
			System.out.println(arr);
			if(arr==11){
				System.out.println("available");
			}
		}

	}

}
