package com.ginurban.pd07;

import java.util.Scanner;

public class CalcBinary {
	
	public static void main(String[] args) {
		//  setting up scanner to take user input
		Scanner input = new Scanner(System.in);
		
		// assign the first input received to variables in decimal and binary forms
		System.out.println("Please enter the first whole number: ");
		int firstnum = input.nextInt();
		String firstbin = Integer.toBinaryString(firstnum);
		
		// assign the second input received to variables in decimal and binary forms
		System.out.println("Please enter the second whole number: ");
		int secondnum = input.nextInt();
		String secondbin = Integer.toBinaryString(secondnum);
		
		// assign the third input received to a variable representing an operation
		System.out.println("Please enter an operator (+, -, *, /): ");
		char operator = input.next().charAt(0);
		input.close();
		
		//initialise result variable in decimal form
		int result = 0;
		
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
		
		// print the arguments passed and the result in decimal and binary forms
		System.out.println(firstnum + " (" + firstbin + ") " + operator + " " + secondnum + " (" + secondbin + ") = " + result + " (" + Integer.toBinaryString(result) + ")");
	}
}
