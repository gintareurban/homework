package com.ginurban.pd07;

import java.util.Scanner;

public class CalcPowerOps {
	
	public static void main(String[] args) {
		//  setting up scanner to take user input
		Scanner input = new Scanner(System.in);
		
		// assign the first input received to a variable
		System.out.println("Please enter a number for base: ");
		double basenum = input.nextDouble();
		
		// assign the second input received to a variable
		System.out.println("Please choose an operation: 1. Find Square Root, 2. Raise to power of 2, 3. Raise to the power of x.");
		System.out.println("Enter the number for desired operation (1, 2, 3): ");
		int operation = input.nextInt();
		
		
		//initialise result variable
		double result = 0.0;
		
		// if statement checks the 2nd input value and calculates result based on operation required or asks for further input
		if (operation == 1) {
			result = Math.pow(basenum,0.5);
			System.out.printf("Square Root of %.4f is %.4f", basenum, result);
		}
		else if (operation == 2) {
			result = Math.pow(basenum,2);
			System.out.printf("%.4f to the power of 2 is %.4f", basenum, result);
		}
		else if (operation == 3) {
			// if option 3 is required, additional argument is called for and assigned to a variable 
			System.out.println("Please enter the exponent: ");
			double expnum = input.nextDouble();			
			result = Math.pow(basenum, expnum);
			System.out.printf("%.4f to the power of %.4f is %.4f", basenum, expnum, result);
		}
		else {
			System.out.println("Operation does not exist");
		}
		input.close();
		
	}
}
