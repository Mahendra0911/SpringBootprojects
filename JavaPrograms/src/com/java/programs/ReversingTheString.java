package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class ReversingTheString {

	public static void main(String[] args) {
//		String str = "NAYAN" ;
//		String reverseStr = "";
//		for (int j = str.length() -1; j >= 0; j--) {
//			reverseStr += str.charAt(j) ;
//			
//		}
//if (reverseStr.equals(str)  ) {
//	
//	System.out.println("The strings are Equal " + reverseStr); 
		
//}
//
//else {
//	
//	System.out.println("The strings are not Equal "+ reverseStr);
//}
		
	String str = "NAYAN" ;
		  
		StringBuilder reverseStr = new StringBuilder (str);
		reverseStr = reverseStr.reverse();
		String reverseStrString = reverseStr.toString();
		if (reverseStrString.equals(str) ) {
			
			System.out.println("The strings are Equal " + reverseStrString);
			
		}
	else {
	
		System.out.println("The strings are not Equal "+ reverseStrString);
		
	}
		List <Integer> list = Arrays.asList(1,2,3,4,5);
		Integer z = list.stream().reduce((a ,b) -> a + b).get();
	
		System.out.println("The strings are not Equal "+ z );
}
}