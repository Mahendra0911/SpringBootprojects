package com.java.programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveSuplicatesFromTheString {

	public static void main(String[] args) {
		String str = "MAHENDRA" ;
//		StringBuilder sb = new StringBuilder();
//		str.chars().distinct().forEach((a)-> sb.append( (char)a));
//
//		System.out.println("The string after removing the duplicates is " + sb );
		StringBuilder sb = new StringBuilder ();
		//char[] str1 = str.toCharArray();
//	Set<Character> set = new LinkedHashSet () ;
//		for (int i = 0; i < str.length(); i++) {
//		char ch = str.charAt(i) ;
//			set.add(ch) ;
//			
//			
//		}
//		for(Character ch : set) {
//			sb.append( (char)ch) ;
//			
//		}
//		System.out.println("The string after removing the duplicates is " + sb );
		
		int index = 0 ;
		//char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			index =str.indexOf(ch, i +1) ;
			
			if(index== -1)
			{
				sb.append(ch);
			}
			
			
			
			
			}
		System.out.println("The string after removing the duplicates is " + sb );
		
		}
		
	

	@Override
	public String toString() {
		return "RemoveSuplicatesFromTheString [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
