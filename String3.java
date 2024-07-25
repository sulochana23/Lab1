package com.lab;
import java.util.HashMap;
import java.util.Map;
 
public class String3 {

	public static void main(String[] args) { 
		        String input = "Hi I am Fine, How are you";
		        printDuplicateCharacters(input);
		    }

		    public static void printDuplicateCharacters(String str) {
		        // Create a map to store character counts
		        Map<Character, Integer> charCountMap = new HashMap<>();

		        // Convert the string to lowercase (assuming case insensitive)
		        str = str.toLowerCase();

		        // Populate the map with character counts
		        for (char c : str.toCharArray()) {
		            if (Character.isLetter(c)) { // Consider only alphabetic characters
		                if (charCountMap.containsKey(c)) {
		                    charCountMap.put(c, charCountMap.get(c) + 1);
		                } else {
		                    charCountMap.put(c, 1);
		                }
		            }
		        }

		        // Print characters with count > 1 (duplicates)
		        System.out.println("Duplicate characters in the string '" + str + "':");
		        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
		            }
		        }
	}

}
