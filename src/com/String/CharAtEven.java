package com.String;

public class CharAtEven {

	public static void main(String[] args) {

		String a = "Aniket";
		//print odd character
		
		for(int i=0;i<a.length();i++){
			if(i%2!=0){
				System.out.println("odd character is "+ a.charAt(i)+" index is "+i);
			}
		}			
		
	}

}
