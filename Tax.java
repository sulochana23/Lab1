package com.lab2;
import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Scanner scanner = new Scanner(System.in);

		        // Input employee name
		        System.out.print("Enter employee name: ");
		        String name = scanner.nextLine();

		        // Input annual income
		        System.out.print("Enter annual income (in INR): ");
		        double annualIncome = scanner.nextDouble();

		        // Calculate income tax
		        double tax = calculateIncomeTax(annualIncome);

		        // Display employee name and income tax
		        System.out.println("\nEmployee Name: " + name);
		        System.out.println("Income Tax to be paid: Rs. " + tax);

		        scanner.close();
		    }

		    public static double calculateIncomeTax(double income) {
		        double tax = 0;

		        if (income <= 250000) {
		            tax = 0; // No tax
		        } else if (income <= 500000) {
		            tax = (income - 250000) * 0.1; // 10% of income exceeding 2,50,000
		        } else if (income <= 1000000) {
		            tax = 25000 + (income - 500000) * 0.2; // 30,000 + 20% of income exceeding 5,00,000
		        } else {
		            tax = 125000 + (income - 1000000) * 0.3; // 1,25,000 + 30% of income exceeding 10,00,000
		        }

		        return tax;

	}

}
