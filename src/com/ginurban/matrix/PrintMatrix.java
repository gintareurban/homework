package com.ginurban.matrix;

public class PrintMatrix {

	public static void main(String[] args) {
		printOne();
		printTwo();
		printThree();
		printFour();
		printFive();
		printSix();
		printSeven();
		printEight();
	}
	private static void printOne() {
		for (int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printTwo() {
		for (int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10; j++) {
				if (i==j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printThree() {
		for (int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10; j++) {
				if ((i==9-j) || (i==j)) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printFour() {
		for (int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10; j++) {
				if  (i%2==0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printFive() {
		for (int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10; j++) {
				if  ((j%2==0) || (i==0)) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printSix() {
		for (int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10; j++) {
				if  ((j==0) || (i==0)||(j==9)) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printSeven() {
		for (int i = 0; i < 9; i++ ) {
			for(int j = 0; j < 10; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printEight() {
		for (int i = 0; i < 9; i++ ) {
			for(int j = 1; j < 11; j++) {
				System.out.printf("%2d ", i + j);
			}
			System.out.println();
		}
		System.out.println();
	}
}


