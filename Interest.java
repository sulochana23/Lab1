package com.program1;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		  // Simple Interest calculation
      System.out.print("\nEnter principal amount (P): ");
      double principal = scanner.nextDouble();

      System.out.print("Enter rate of interest per year (R): ");
      double rate = scanner.nextDouble();

      System.out.print("Enter time in years (T): ");
      double time = scanner.nextDouble();

      double simpleInterest = (principal * rate * time) / 100;
      System.out.printf("Simple Interest (SI) = %.2f\n", simpleInterest);
      	scanner.close();
	}

}
