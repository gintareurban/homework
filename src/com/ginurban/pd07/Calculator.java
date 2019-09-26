/**
 * 
 */
package com.ginurban.pd07;

import java.util.Scanner;

/**
 * Calculator class implements an application which 
 * takes two float arguments and one char argument (values in +,-,*,/)
 * and prints the result to standard output
 */
public class Calculator {

	public static void main(String[] args) {
		//  setting up scanner to take user input
		Scanner input = new Scanner(System.in);
		
		// assign the first input received to a variable
		System.out.println("Please enter the first number: ");
		float firstnum = input.nextFloat();
		
		// assign the second input received to a variable
		System.out.println("Please enter the second number: ");
		float secondnum = input.nextFloat();
		
		// assign the third input received to a variable
		System.out.println("Please enter an operator (+, -, *, /): ");
		char operator = input.next().charAt(0);
		input.close();
		
		//initialise result variable
		float result = 0.0f;
		
		// if statement checks the 3rd input value and calculates result based on operator required
		if (operator == '+') {
			result = firstnum + secondnum;
		}
		else if (operator == '-') {
			result = firstnum - secondnum;
		}
		else if (operator == '*') {
			result = firstnum * secondnum;
		}
		else if (operator == '/') {
			result = firstnum / secondnum;
		}
		else {
			System.out.println("Operator does not exist");
		}
		
		// print and format the result to a float with 4 decimal places
		System.out.printf("%.4f %c %.4f = %.4f", firstnum, operator, secondnum, result);
	}
}