package com.javasample;

import java.util.Scanner;

public class Cons {
	
	public static void count_Character() {

		
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Enter the String");
		
		String str = scan.next();
		
		
		
		int []  count= new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			
			
			
			char ch = str.charAt(i);
			
			
			
			count [ch]++;
			
		}
		
		for (int i = 0; i < count.length; i++) {
			
			
			if (count[i]!=0) {
				
				
				System.out.println((char) i +"="+ count[i]);
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		count_Character();
	}
}
