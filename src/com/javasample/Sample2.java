package com.javasample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample2 {

	// find the occurance of string
	
	public static void main(String[] args) {
		
		String s= "Java selenium";
		
		
		
		Map<Character, Integer> mp=new HashMap<>();
		
		
		char[] charArray = s.toCharArray();
		
		
		for (char c : charArray) {
			
			
			if(mp.containsKey(c)) {
				
				
				mp.put(c, mp.get(c)+1);
				
				
			}
			
			else {
				mp.put(c, 1);
			}
			}
		
		
		System.out.print(mp);
			
		}
		
		
	}
	

