package com.ginurban.OOP_Calculator;

public class Calculator {

	public static double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	public static double subtract(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}

	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}

	public static double divide(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
	
	public static double sin(double baseNumber) {
		double result = Math.sin(Math.toRadians(baseNumber));
		return result;
	}
	
	public static double cos(double baseNumber) {
		double result = Math.cos(Math.toRadians(baseNumber));
		return result;
	}

	public static double tan(double baseNumber) {
		double result = Math.tan(Math.toRadians(baseNumber));
		return result;
	}
	
	public static double cot(double baseNumber) {
		double result = 1.0/Math.tan(Math.toRadians(baseNumber));
		return result;
	}
	
	public static double getSqrt(double baseNumber) {
		double result = Math.pow(baseNumber,0.5);
		return result;
	}
	
	public static double getPowerOfTwo(double baseNumber) {
		double result = Math.pow(baseNumber,2);
		return result;
	}
	
	public static double getPowerOfExponent(double baseNumber, double exponent) {
		double result = Math.pow(baseNumber, exponent);
		return result;
	}
	
	public static double getPercent(double num1, double num2) {
		double result = (num1/num2)*100;
		return result;
	}
	
	public static double addPercent(double baseNum, double percent) {
		double result = baseNum + baseNum * (percent/100);
		return result;
	}
	
	public static double subtractPercent(double baseNum, double percent) {
		double result = baseNum - baseNum * (percent/100);
		return result;
	}
	
	public static double getRemainder(double num1, double num2) {
		double result = num1 % num2;
		return result;
	}

	
	
	
	
}
