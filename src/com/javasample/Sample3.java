package com.javasample;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample3 {
	
	
	
	// Romove the dublicate value from String

	public static void main(String[] args) {
		
		
		String s= "Automation";
		
	Set<Character> se= new LinkedHashSet<>();
	
	
	
	
	
	for (int i = 0; i <s.length(); i++) {
		
		
		
		char charAt = s.charAt(i);
				

		se.add(charAt);
		
	}
	
	StringBuilder s1= new StringBuilder();
	
	
	
	for (Character c : se) {
		
		
		s1.append(c);
		
	}
	
	System.out.println(s1);
	
	
	}
		
	}

