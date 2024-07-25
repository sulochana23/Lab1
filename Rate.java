package com.lab2;
import java.util.Scanner;

public class Rate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Input gender
		        System.out.print("Enter your gender (M/F): ");
		        String gender = scanner.nextLine().toUpperCase();

		        // Input weight in kilograms
		        System.out.print("Enter your weight (in kg): ");
		        double weight = scanner.nextDouble();

		        // Input height in centimeters
		        System.out.print("Enter your height (in cm): ");
		        double heightCm = scanner.nextDouble();

		        // Input age
		        System.out.print("Enter your age (in years): ");
		        int age = scanner.nextInt();

		        // Calculate BMR and BMI
		        double bmr = calculateBMR(gender, weight, heightCm, age);
		        double bmi = calculateBMI(weight, heightCm);

		        // Display BMR and BMI
		        System.out.printf("\nYour Basal Metabolic Rate (BMR): %.2f calories/day\n", bmr);
		        System.out.printf("Your Body Mass Index (BMI): %.2f\n", bmi);

		        // Determine BMI category
		        String bmiCategory = determineBMICategory(bmi);
		        System.out.println("BMI Category: " + bmiCategory);

		        scanner.close();
		    }

		    // Method to calculate BMR based on Harris-Benedict equation
		    public static double calculateBMR(String gender, double weight, double heightCm, int age) {
		        double bmr = 0;

		        if (gender.equals("M")) {
		            // BMR calculation for males
		            bmr = 88.362 + (13.397 * weight) + (4.799 * heightCm) - (5.677 * age);
		        } else if (gender.equals("F")) {
		            // BMR calculation for females
		            bmr = 447.593 + (9.247 * weight) + (3.098 * heightCm) - (4.330 * age);
		        }

		        return bmr;
		    }

		    // Method to calculate BMI
		    public static double calculateBMI(double weight, double heightCm) {
		        // Convert height from centimeters to meters
		        double heightM = heightCm / 100.0;
		        
		        // Calculate BMI
		        double bmi = weight / (heightM * heightM);
		        return bmi;
		    }

		    // Method to determine BMI category
		    public static String determineBMICategory(double bmi) {
		        if (bmi < 18.5) {
		            return "Underweight";
		        } else if (bmi >= 18.5 && bmi < 25) {
		            return "Healthy";
		        } else if (bmi >= 25 && bmi < 30) {
		            return "Overweight";
		        } else {
		            return "Obese";
		        }
	}

}
