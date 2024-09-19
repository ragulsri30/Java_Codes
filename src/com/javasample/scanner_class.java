package com.javasample;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class scanner_class {

	
	// to find the second largest number in Array
	
	public static void main(String[] args) throws Exception {

		int[] num = { 111, 33,78,20,100,9, 5, 6, 8, 11, 23, 65 };

		Arrays.sort(num);

		System.out.println("Seconde largest number in Array is  : "+num[num.length - 2]);

	}

}
