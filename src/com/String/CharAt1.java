package com.String;

public class CharAt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Aniket Jadhav";
		System.out.println(name.length());
		System.out.println(name.length()-1);
		System.out.println(name.charAt(name.length()-1));
		int lengthOfString = name.length();
		if(lengthOfString>0){
			for(int i=0;i<lengthOfString;i++){
				//System.out.println(name.charAt(i));
				
				if(i%2==0){
					System.out.println("even character is "+name.charAt(i)+" index is ");
					
				}
				
				if(i%2!=0){
					System.out.println("odd character is= "+name.charAt(i));
				}
			}
			
			
		
		}
	}

}
