package com.ginurban.pd09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author gin_urban
 * @version 1.0
 * @
 */
public class ControlFlowStatementsExamples {
	// set up scanner to take user input
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//9.1 check if triangle is right
		checkIfTriangleIsRight();
		//9.2 calculate Discriminant of a quadratic equation D = b^2-4ac
		calculateDiscriminant();
		//9.3 guess Random number between 0 and 100
		guessRandomNumber(100);
		//9.4 solve equation y = 3x using For loop when x increases from 0 to 10
		solveEquationUsingFor();
		//9.5 solve equation y = 3x using While loop when x increases from 0 to 10
		solveEquationUsingWhile();
		//9.6 add all numbers in range minValue to maxValue using For loop
		sumUsingFor(1,100);
		//9.7 add all numbers in range minValue to maxValue using While loop
		sumUsingWhile(1,100);
		//9.8 add all numbers in range minValue to maxValue using DoWhile loop
		sumUsingDoWhile(1,100);
		//9.9 print all capital letters A to Z to standard output using For loop
		printCapitalAtoZ();
		//9.10 print multiplication table minValue to maxValue using nested For loop
		printMultiplicationTable(1,100);
	}


	private static void printMultiplicationTable(int minValue, int maxValue) {
		// 
		for (int head = minValue; head <= maxValue; head++) {
			if(head == minValue) {
				System.out.printf("        %5d ", head);
			}else {
				System.out.printf("%5d ", head);
			}
		}
		System.out.println();
		for (int i = minValue; i <= maxValue; i++) {
			System.out.printf("%5d   ", i);
			for (int j = minValue; j <= maxValue; j++) {
				System.out.printf("%5d ", i*j);
			}
			System.out.println();
		}

	}


	private static void printCapitalAtoZ() {
		// loop through characters number 65 to 90 and print
		for (int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println("\n");	
	}


	private static void sumUsingDoWhile(int minValue, int maxValue) {
		//add all numbers in range minValue to maxValue(inclusive) using DoWhile loop
		int sum = 0;
		int i = maxValue;
		do{
			sum += i;
			i--;
		}while(i >= minValue);
		System.out.printf("Sum of all numbers between %d and %d is %d", minValue, maxValue, sum);
		System.out.println("\n");
	}


	private static void sumUsingWhile(int minValue, int maxValue) {
		//add all numbers in range minValue to maxValue(inclusive) using While loop
		int sum = 0;
		int i = maxValue;
		while (i >= minValue) {
			sum += i;
			i--;
		}
		System.out.printf("Sum of all numbers between %d and %d is %d", minValue, maxValue, sum);
		System.out.println("\n");
	}


	private static void sumUsingFor(int minValue, int maxValue) {
		//add all numbers in range minValue to maxValue(inclusive) using For loop
		int sum = 0;
		for (int i = maxValue; i >= minValue; i--) {
			sum += i;
		}
		System.out.printf("Sum of all numbers between %d and %d is %d", minValue, maxValue, sum);
		System.out.println("\n");
	}


	private static void solveEquationUsingWhile() {
		// loop through 0 to 10 for x and print out the result of y = 3x
		int x = 0;		
		while (x <= 10) {
			System.out.println("3 * " + x + " = " + (3 * x));
			x++;
		}
		System.out.println();
	}


	private static void solveEquationUsingFor() {
		// loop through 0 to 10 for x and print out the result of y = 3x
		for (int x = 0; x <= 10; x++) {
			System.out.println("3 * " + x + " = " + (3 * x));
		}
		System.out.println();
	}


	private static void guessRandomNumber(int maxValue) {
		boolean repeat = false;
		do {
			// generate random int using Random class and assign to variable
			Random random = new Random();
			int randomNum = random.nextInt(maxValue);
			// call for user input and assign to variable
			System.out.println("Try to guess a whole number between 0 and "+ maxValue + ":");
			int userGuess = input.nextInt();
			//check if user input matches the randomly generated integer
			if (userGuess < randomNum) {
				System.out.println("You guessed too low. Correct answer is: " + randomNum);
			} else if(userGuess > randomNum) {
				System.out.println("You guessed too high. Correct answer is: " + randomNum);
			} else if (userGuess == randomNum) {
				System.out.println("Correct! You got me");
			}
			repeat = checkIfRepeat();

		} while (repeat);
		System.out.println();
	}


	private static void calculateDiscriminant() {
		boolean repeat = false;
		do {
			//take input and assign to variables
			System.out.println("Let's calculate the Discriminant for the quadratic equation ax2 + bx + c = 0.");
			System.out.println("Please enter the coefficient a:");
			double a = input.nextDouble();
			System.out.println("Please enter the coefficient b:");
			double b = input.nextDouble();
			System.out.println("Please enter the coefficient c:");
			double c = input.nextDouble();

			//check if coefficient a is 0 and if true ask for input again
			if (a == 0) {
				System.out.println("Invalid input: quadratic coefficient a cannot be equal to 0!");
				repeat = checkIfRepeat();
				continue;
			}

			double d;
			// calculate Discriminant and provide info about equation solutions for x
			d = Math.round((b * b - 4 * a * c)*100.0)/100.0;
			if (d > 0) {
				System.out.printf("Discriminant is %.2f. There are two real solutions for x. \n", d);
			} else if (d == 0) {
				System.out.printf("Discriminant is %.2f. There is one real solution for x. \n", d);
			} else {
				System.out.printf("Discriminant is %.2f. Attention: there are two COMPLEX solutions for x \n", d);
			}
			repeat = checkIfRepeat();

		}while(repeat);
		System.out.println();
	}


	private static void checkIfTriangleIsRight() {
		boolean repeat = false;
		do {
			//take input and assign to variables
			System.out.println("Let's check if the triangle is right based on their sides length.");
			System.out.println("Please enter the first side length (has to be more than 0):");
			double side1 = input.nextDouble();
			System.out.println("Please enter the second side length (has to be more than 0):");
			double side2 = input.nextDouble();
			System.out.println("Please enter the third side length (has to be more than 0):");
			double side3 = input.nextDouble();
			if (side1 < 0 || side2 < 0 || side3 < 0) {
				System.out.println("Invalid input: side lengths cannot be negative!");
				continue;
			}
			//create an array containing side lengths and sort ascending
			double[] sides = {side1, side2, side3};
			Arrays.sort(sides);

			/*check if triangle right by using Pythagorean theorem (c^2=a^2 + b^2),
			 *longest side is the last element in the sorted Array
			 */
			if (sides[2]*sides[2] == (sides[0]*sides[0]) + (sides[1]*sides[1])) {
				System.out.println("The triangle is right!");
			}else {
				System.out.println("The tringle is NOT right.");
			}
			repeat = checkIfRepeat();
		}while(repeat);
		System.out.println();
	}


	private static boolean checkIfRepeat() {
		System.out.println("Do you want to repeat?(y/n)");
		char answer = input.next().toLowerCase().charAt(0);
		if (answer == 'y') {       
			return true;
		}else {
			return false;
		}
	}

	//	private static void checkIfProceed() {
	//		//check if the application should keep running
	//		System.out.println("Do you want to continue running the application (y/n): ");
	//		char answer = input.next().toLowerCase().charAt(0);
	//		if (answer == 'n') {       
	//			System.out.println("Application terminated.");
	//			System.exit(0);
	//		}
	//	}

}
