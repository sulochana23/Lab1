package com.program1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user to enter marks for each subject
	        System.out.println("Enter marks obtained in 5 subjects:");
	        
	        // Variables to store marks for each subject
	        int c, cpp, java, python, php;
	        
	        // Read marks for each subject
	        System.out.print("Enter marks of c: ");
	        c = scanner.nextInt();
	        
	        System.out.print("Enter marks of c++: ");
	        cpp = scanner.nextInt();
	        
	        System.out.print("Enter marks of java: ");
	        java = scanner.nextInt();
	        
	        System.out.print("Enter marks of python: ");
	        python = scanner.nextInt();
	        
	        System.out.print("Enter marks of php: ");
	        php = scanner.nextInt();
	        
	        // Calculate total marks
	        int totalMarks = c+cpp+java+python+php;
	        
	        // Calculate percentage
	        double percentage = (double) totalMarks / 5.0;
	        
	        // Determine grade based on percentage
	        char grade;
	        if (percentage >= 90) {
	            grade = 'A';
	        } else if (percentage >= 80) {
	            grade = 'B';
	        } else if (percentage >= 70) {
	            grade = 'C';
	        } else if (percentage >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        
	        // Print the grade of the student
	        System.out.println("The grade of the student is: " + grade);
	        
	        scanner.close();
	}

}
