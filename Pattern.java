package com.lab2;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       int rows = 4; // Number of rows in the pattern

		        // Outer loop for rows
		        for (int i = 1; i <= rows; i++) {
		            // Printing numbers in increasing order
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }

		            // Printing numbers in decreasing order
		            for (int j = i - 1; j >= 1; j--) {
		                System.out.print(j);
		            }

		            // Move to the next line after each row is printed
		            System.out.println();
		        }
	}

}
