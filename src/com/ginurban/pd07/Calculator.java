/**
 * 
 */
package com.ginurban.pd07;

import java.util.Scanner;

/**
 * Calculator class implements an application which 
 * takes multiple inputs from the user and calls multiple methods, each performing a separate type of calculation.
 * The result is printed to standard output
 */
public class Calculator {
	//  setting up scanner to take user input
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		calculatorCall();
	}

	public static void calculatorCall() {

		//Check if the user wants to run the program
		System.out.println("Do you want to start a calculator? (y/n)");
		char proceed = input.next().toLowerCase().charAt(0);
		if (proceed == 'n') {
			input.close();
			System.out.println("Calculator terminated.");
			return;
		}

		// assign the first numerical input received to a variable
		System.out.println("Types of operations available: \n"
				+ "1. Arithmetic ( +, -, *, /) \n"
				+ "2. Exponentiation (square root, power of two, power of x) \n"
				+ "3. Trigonometric (sin, cos, tg, ctg) \n"
				+ "4. Percentage \n"
				+ "5. Remainder \n");
		System.out.println("Please choose the type of operation (1, 2, 3, 4, 5): ");
		int operationType = input.nextInt();

		// check operationType variable to determine which method should be called and how many inputs are required
		switch (operationType) {
		case 1:
		case 4:
		case 5:
			// call for two inputs and assign to variables
			System.out.println("Selected operation will require two numbers.");
			System.out.println("Please enter the first number: "); 
			double numOne = input.nextDouble();
			System.out.println("Please enter the second number: ");
			double numTwo = input.nextDouble();
			// check operationType variable value to determine which method to call
			if (operationType == 1) {
				// call for additional input to determine the calculation to be performed and assign it to a variable
				System.out.println("Please enter an operator (+, -, *, /): ");
				char aritmeticOperator = input.next().charAt(0);

				arithmeticCalc(numOne, numTwo,aritmeticOperator);
			}
			else if (operationType == 4) {
				percentCalc(numOne, numTwo);
			}
			else {
				remainderCalc(numOne, numTwo);
			}
			break;
		case 2:
		case 3:
			// call for base input and assign it to a variable
			System.out.println("Please enter a base number: "); 
			double baseNum = input.nextDouble();
			// check operationType variable value to determine which method to call 
			if (operationType == 2) {
				// call for additional input to determine the calculation to be performed and assign it to a variable
				System.out.println("Types of operations available: \n"
						+ "1. Square root \n"
						+ "2. Power of 2 \n"
						+ "3. Power of x \n");
				System.out.println("Please choose the operation (1, 2, 3): ");
				int expOperation = input.nextInt();
				//initiate exponent variable
				double exponent = 0.0;
				if (expOperation == 3) {
					//call for additional input and assign it to exponent variable
					System.out.println("Please enter the exponent");
					exponent = input.nextDouble();
				}

				exponCalc(baseNum, expOperation, exponent);
			}
			else {
				// call for additional input to determine the calculation to be performed and assign it to a variable
				System.out.println("Please choose the operation (sin, cos, tan, cot): ");
				String trigOperation = input.next();

				trigonomCalc(baseNum, trigOperation);
			}
			break;
		default:
			System.out.println("Invalid operation type selected.");
			break;
		}
	}



	public static void arithmeticCalc(double numOne, double numTwo, char operator) {
		double result = 0.0;
		switch(operator) { 
		case '+':
			result = numOne + numTwo;
			break;
		case '-':
			result = numOne - numTwo;
			break;
		case '*':
			result = numOne * numTwo;
			break;
		case '/':
			result = numOne / numTwo;
			break;
		default:
			System.out.println("Invalid operator selected");
			break;
		}
		System.out.printf("%.4f %c %.4f = %.4f", numOne, operator, numTwo, result);
		System.out.println("\n");
		calculatorCall();
	}



	public static void percentCalc(double numOne, double numTwo) {
		double result = 0.0;
		result = (numOne/numTwo)*100;
		System.out.printf("%.4f / %.4f = %.4f%%", numOne, numTwo, result);
		System.out.println("\n");
		calculatorCall();
	}


	public static void remainderCalc(double numOne, double numTwo) {
		double result = 0.0;
		result = numOne % numTwo;
		System.out.printf("%.4f / %.4f, remainder is %.4f", numOne, numTwo, result);
		System.out.println("\n");
		calculatorCall();
	}


	public static void exponCalc(double baseNum, int opType, double exponent ) {
		double result = 0.0;
		switch(opType) {
		case 1:
			result = Math.pow(baseNum,0.5);
			System.out.printf("Square Root of %.4f is %.4f", baseNum, result); 
			break;
		case 2:
			result = Math.pow(baseNum,2);
			System.out.printf("%.4f to the power of 2 is %.4f", baseNum, result);
			break;
		case 3:
			result = Math.pow(baseNum,exponent);
			System.out.printf("%.4f to the power of %.4f is %.4f", baseNum, exponent, result);
			break;
		default:
			System.out.println("Selected operation is invalid");
			break;
		}
		System.out.println("\n");
		calculatorCall();
	}


	public static void trigonomCalc(double baseNum, String function) {
		double result = 0.0;
		switch(function) {
		case "sin":
			result = Math.sin(Math.toRadians(baseNum));
			break;
		case "cos":
			result = Math.cos(Math.toRadians(baseNum));
			break;
		case "tan":
			result = Math.tan(Math.toRadians(baseNum));
			break;
		case "cot":
			result = 1.0/Math.tan(Math.toRadians(baseNum));
			break;
		default:
			System.out.println("Selected function is invalid");
			break;
		}
		//print result and format to 4 decimal places
		System.out.printf(function+ "(%.4f) = %.4f", baseNum, result);
		System.out.println("\n");
		calculatorCall();
	}
}		
