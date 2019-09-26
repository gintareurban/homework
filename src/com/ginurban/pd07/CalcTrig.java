package com.ginurban.pd07;

import java.util.Scanner;

public class CalcTrig {
	public static void main(String[] args) {
		//  setting up scanner to take user input
		Scanner input = new Scanner(System.in);
		
		// assign the first input received to a variable
		System.out.println("Please enter number of degrees: ");
		double basenum = input.nextDouble();
		
		// assign the second input received to a variable that determines the operation
		System.out.println("Please choose an operation: 1. sin, 2. cos, 3. tg, 4. ctg.");
		System.out.println("Enter the number for desired operation (1, 2, 3, 4): ");
		int operation = input.nextInt();
		input.close();
		
		//initialise result variable
		double result = 0.0;
		
		// if statement checks the 2nd input value and calculates result based on operation required
		if (operation == 1) {
			result = Math.sin(Math.toRadians(basenum));
			System.out.printf("sine of %.4f is %.4f", basenum, result);
		}
		else if (operation == 2) {
			result = Math.cos(Math.toRadians(basenum));
			System.out.printf("cosine of %.4f is %.4f", basenum, result);
		}
		else if (operation == 3) {
			result = Math.tan(Math.toRadians(basenum));
			System.out.printf("tangent of %.4f is %.4f", basenum, result);
		}
		else if (operation == 4) {
			result = 1.0/Math.tan(Math.toRadians(basenum));
			System.out.printf("cotangent of %.4f is %.4f", basenum, result);
		}
		else {
			System.out.println("Operation does not exist");
		}
		
	}
}
