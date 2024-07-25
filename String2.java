package com.lab;

public class String2 {

	public static void main(String[] args) {
		
		        String[] arr1 = {"Hi", " I", " am", " Student"};
		        String[] arr2 = {"Concatenate", "these", "strings"};
		        String[] arr3 = null;

		       
		        String result1 = concatenateStrings(arr1);
		        String result2 = concatenateStrings(arr2);
		        String result3 = concatenateStrings(arr3);

		        // Printing results
		        System.out.println("Result 1: " + result1);
		        System.out.println("Result 2: " + result2);
		        System.out.println("Result 3: " + result3);
		    }

		    public static String concatenateStrings(String[] strings) {
		        if (strings == null) {
		            return ""; // Return empty string if input array is null
		        }

		        StringBuilder sb = new StringBuilder();
		        for (String str : strings) {
		            sb.append(str);
		        }
		        return sb.toString();
	}
}
