package com.program1;

import java.util.Scanner;

public class Tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first angle of triangle: ");
	        double angle1 = sc.nextDouble();

	        System.out.print("Enter second angle of triangle: ");
	        double angle2 = sc.nextDouble();

	        System.out.print("Enter third angle of triangle: ");
	        double angle3 = sc.nextDouble();

	        sc.close();

	        // Calculate the sum of angles
	        double totalAngle = angle1 + angle2 + angle3;

	        // Check if it forms a valid triangle (sum of angles should be 180 degrees)
	        if (totalAngle != 180) 
	        {
	            System.out.println("Not a valid triangle");
	        } 
	        else {
	            // Check the type of triangle based on angles
	            if (angle1 < 90 && angle2 < 90 && angle3 < 90) 
	            {
	                System.out.println("Triangle type: Acute Triangle");
	            } 
	            else if (angle1 == 90 || angle2 == 90 || angle3 == 90) 
	            {
	                System.out.println("Triangle type: Right Triangle");
	            } 
	            else if (angle1 > 90 || angle2 > 90 || angle3 > 90)
	            {
	                System.out.println("Triangle type: Obtuse Triangle");
	            }
	        }
	}

}
