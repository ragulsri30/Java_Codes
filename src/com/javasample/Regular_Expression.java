package com.javasample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {

	 public static void main(String[] args) {
	        // Define the regular expression pattern
		  // Define the regular expression pattern
	        String regex = "\\b[A-Z][a-zA-Z0-9\\s]*\\b"; // Matches one or more word characters
	        
	        // Compile the pattern
	        Pattern pattern = Pattern.compile(regex);
	        
	        // Input string
	        String input = "REDMI 13C (Stardust Black, 128 GB)";
	        
	        // Create a matcher
	        Matcher matcher = pattern.matcher(input);
	        
	        // Find and print all matches
	        if (matcher.find()) {
	            System.out.println("Found a word: " + matcher.group());
	        }
	    }
}
