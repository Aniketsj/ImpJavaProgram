package com.Arrays;

public class MinValueArray {
	
	static void min(int arr[]){
		int min = arr[0];
		System.out.println("first Min------"+min);
		for(int i=1;i<arr.length;i++){
			System.out.println("arr lengh---------------"+arr.length);
			System.out.println("min---------------"+min);
			System.out.println("arr [i]---------------"+arr[i]);
			
			if(min>arr[i]){
				min=arr[i];
				System.out.println("min------------------------------"+min);
				System.out.println(min);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={22,4,5,3,6,7,56};
		min(a);
	}

}
