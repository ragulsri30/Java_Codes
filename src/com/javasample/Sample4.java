package com.javasample;

public class Sample4 {

	
	public static void main(String[] args) {
		
		
	Singleton s= Singleton.getInstance();
	System.out.println(s);
	Singleton s1= Singleton.getInstance();
	System.out.println(s1);
	
	Singleton instance = s.getInstance();
		
		System.out.println(instance);
	}
}
