package com.program1;

import java.util.Scanner;

public class Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt user to enter length and width of the field in feet
	        System.out.print("Enter length of the field in feet: ");
	        double lengthFeet = scanner.nextDouble();

	        System.out.print("Enter width of the field in feet: ");
	        double widthFeet = scanner.nextDouble();

	        // Calculate area in square feet
	        double areaSquareFeet = lengthFeet * widthFeet;

	        // Convert square feet to acres (1 acre = 43,560 square feet)
	        double areaAcres = areaSquareFeet / 43560.0;

	        // Display the area of the field in acres
	        System.out.printf("The area of the field is %.2f acres.\n", areaAcres);

	        scanner.close();
	}

}
