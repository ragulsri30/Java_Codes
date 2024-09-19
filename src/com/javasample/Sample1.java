package com.javasample;

public class Sample1 {

	public static void main(String[] args) {

		// to remove space from string
		String s = "slkdcvnlsan@#$%^&*(kxcjvhsdh76592365";

		System.out.println(s.replaceAll("[^A-Za-z0-9]", ""));
	}

}
