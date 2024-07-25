package com.lab2;
import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		      Scanner scanner = new Scanner(System.in);

		        // Input the amount of electricity consumed in units (kWh)
		        System.out.print("Enter the amount of electricity consumed (in kWh): ");
		        int unitsConsumed = scanner.nextInt();

		        // Calculate the electricity bill
		        int billAmount = calculateElectricityBill(unitsConsumed);

		        // Display the electricity bill amount
		        System.out.println("Electricity bill amount: Rs. " + billAmount);

		        scanner.close();
		    }

		    public static int calculateElectricityBill(int units) {
		        int bill = 0;

		        // Rates based on the given ranges
		        // 1 to 100 units – Rs. 10/unit
		        if (units <= 100) {
		            bill = units * 10;
		        }
		        // 101 to 200 units – Rs. 15/unit
		        else if (units <= 200) {
		            bill = 100 * 10 + (units - 100) * 15;
		        }
		        // 201 to 300 units – Rs. 20/unit
		        else if (units <= 300) {
		            bill = 100 * 10 + 100 * 15 + (units - 200) * 20;
		        }
		        // Above 300 units – Rs. 25/unit
		        else {
		            bill = 100 * 10 + 100 * 15 + 100 * 20 + (units - 300) * 25;
		        }

		        return bill;
		    	}

}
