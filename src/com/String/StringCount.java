package com.String;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "This is Aniket Jadhav";
		int count = 0;
		
		if(!a.isEmpty()){
			System.out.println(a.length());
			for(int i=0;i<a.length();i++){
				
				if((a.charAt(i)!=' ')){
					System.out.println(a.indexOf(a.charAt(i)));
					count++;
					System.out.println(count);
				}
			}
			
		}else{
			System.out.println("is empty");
		}

	}

}
