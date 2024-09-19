package com.javasample;

public class Singleton {

	public static Singleton s ;
	
	
	private Singleton() {
		
	}
	
	public static  Singleton getInstance() {
		
		
		if (s==null) {
			s=new Singleton();
		}
		return s;
		
	}
	
	
	
}
