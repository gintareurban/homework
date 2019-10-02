package com.ginurban.pd08;

import java.util.Scanner;

/**
 * @author gintare
 *
 */
public class ControlFlowStatements {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//8.1 demo if-then statement
		//check if the application should be launched
				System.out.println("Do you want to start the application (y/n): ");
				char proceed = input.next().toLowerCase().charAt(0);

				if (proceed == 'n') {       //demo if-then statement
					System.out.println("Application terminated.");
					return; //demo return
				}
				
		//8.1 demo use of if-then-else, switch statements
		callIfSwitch();
		
		//8.2 demo use of For, while, do-while loops
		callForWhile();
		
		//8.3 demo use of break, continue, return statements & 8.4 demo labeled break and continue statements 
		callReturnBreakContinue();
		
		//8.5 demo return with a value statement
		callReturnValue();
		
		//8.7 take input and check the type
		checkInputType();
		
		//TODO 8.6 and 8.8 - not sure about the task

	}

	public static void callIfSwitch() {
		
		/* demonstrating the use of if-then-else and switch statements; also break and return;
		 *  method takes one argument as month number (1 to 12) and
		 *  prints out the number of calendar days in that month 
		 */ 

		System.out.println("Please enter month number (1 to 12): ");
		int month = input.nextInt();
		System.out.println("Please enter the year: ");
		int year = input.nextInt();
		// initialize variable for output
		int numDays = 0;

		// demo switch, if-then-else statements
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break; //demo break
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if (((year % 4 == 0) && !(year % 100 ==0)) || (year % 400 ==0)) { // checks for leap year
				numDays = 29;
			}
			else {
				numDays = 28;
			}
			break;
		default:
			System.out.printf("Month %d does not exist \n", month);
			break;
		}

		System.out.printf("Month number %d in year %d has %d days \n \n", month, year, numDays);	

	}
	

	public static void callForWhile() {
		
		//demo For loop, While loop, DoWhile loop and return statement;
		System.out.println("Please enter a whole number for multiplication table: ");
		int numOne = input.nextInt();


		// demo for statement
		//print multiplication table (times 1 to 10)

		// initiate result variable
		int result = 0;
		//print table
		for(int i = 1; i < 11; i++) {
			result = numOne * i;
			System.out.printf("%d x %d = %d \n", numOne, i, result);
		}
		System.out.println();

		// demo while statement
		//calculate cumulative sum for natural numbers
		System.out.println("Please enter a natural number for cumulative sum: ");
		int numTwo = input.nextInt();
		if (numTwo < 0) {
			System.out.println("Invalid input");
		}
		else {
			int sum = 0;
			int i = numTwo;
			while (i > 0) {
				sum += i;
				i--;
			}
			System.out.printf("Cumulative sum for %d is %d \n \n", numTwo, sum);
		}

		//demo doWhile statement
		System.out.println("This part will print all numbers between first and second number entered.");
		System.out.println("Please enter a number: ");
		int lowerInt = input.nextInt();
		System.out.println("Please enter a greater number: ");
		int greaterInt = input.nextInt();

		if (lowerInt >= greaterInt) {
			System.out.println("Invalid input: second number entered is not greater than the first number entered");
			return; //demo return;
		}
		int i = lowerInt;
		do {
			System.out.print(i+ ", ");
			i++;
		}
		while(i<=greaterInt);
		System.out.println("\n");

	}
	

	public static void callReturnBreakContinue() {

		System.out.println("The following part illustrates the difference between labeled and unlabeled break. \n"
				+ "Two dimentional array is built using For loop:");
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(i + ":" + j + " ");
			}
			System.out.println();
		}
		System.out.println();

		// demo Unlabeled Continue & Break statements
		System.out.println("Unlabeled Continue at column index 2 & Unlabeled Break at column index 4:");
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if (j==2) {
					continue;
				}
				else if (j==4) {
					break;
				}
				System.out.print(i + ":" + j + " ");
			}
			System.out.println();
		}
		System.out.println();

		//demo Labeled Continue statement
		System.out.println("Labeled Continue (returning to the outer loop) at column index 2:");
		loop1:
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					if (j==2) {
						System.out.println();
						continue loop1;
					}
					System.out.print(i + ":" + j + " ");
				}
				System.out.println();
			}
		System.out.println();

		//demo Labeled Return statement
		System.out.println("Labeled Return at column index 4:");
		loop1:
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					if (j==4) {
						System.out.println();
						break loop1;
					}
					System.out.print(i + ":" + j + " ");
				}
				System.out.println();
			}
		System.out.println();
	}
	

	public static void callReturnValue() {

		System.out.println("This part will check if the given number is prime.");
		System.out.println("Please enter a number:");
		int inputNum = input.nextInt();
		System.out.println(checkIfPrime(inputNum));
		System.out.println();
	}
	
	
	private static boolean checkIfPrime(int num) {
		
		boolean isPrime = false; 
		if(num <= 1) {
			isPrime = false;
		} else {
			for(int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}else {
					isPrime = true;
				}
			}
		}
		return isPrime;
	}

	public static void checkInputType() {
		
		System.out.println("This part will check the type of your input");
		System.out.println("Please enter a random number/word(s): ");


		if (input.hasNextByte()) {
			System.out.println("You have entered byte");
		}
		else if (input.hasNextShort()) {
			System.out.println("You have entered short");
		}
		else if (input.hasNextInt()) {
			System.out.println("You have entered integer");
		}
		else if (input.hasNextLong()) {
			System.out.println("You have entered long");
		}
		else if (input.hasNextFloat()) {
			System.out.println("You have entered float");
		}
		else if (input.hasNextDouble()) {
			System.out.println("You have entered double");
		}
		else if (input.hasNextBoolean()) {
			System.out.println("You have entered boolean");
		}
		else if (input.next().length() == 1) {
			System.out.println("You have entered char");
		}
		else if (input.hasNextLine()) {
			System.out.println("You have entered string");
		}
		else {
			System.out.println("I do not recognize the type entered");
		}
	}
}
