package com.javasample;

public class Fibonacci_Serice {

	
	public static void main(String[] args) {
		
		
		int num=10;
		
		
		
		
		int a=0 ,b=1;
		
		
		
		for (int i = 2; i <num; i++) {
			
			
			
			int next=a+b;
			
			a=b;
			b=next;
			
			System.out.println(next);
		}
	}
}
