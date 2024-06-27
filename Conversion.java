package com.program1;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Temperature conversion from Celsius to Fahrenheit
	        System.out.print("Enter temperature in Celsius: ");
	        double celsius = scanner.nextDouble();
	        double fahrenheit = celsius * 1.8 + 32;
	        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.\n", celsius, fahrenheit);

	        scanner.close();
	}

}
