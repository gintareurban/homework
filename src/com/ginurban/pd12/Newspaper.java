package com.ginurban.pd12;

import com.ginurban.CalculatorOOP.Calculator;

public class Newspaper extends Item {

	
	private static double VAT = 9;
	
	public Newspaper(String name, double priceEURexVAT) {
		super(name, priceEURexVAT);
	}

	@Override
	public double getPriceEURincVAT() {
		return Calculator.addPercent(getPriceEURexVAT(), VAT);
	}
	
	@Override
	public double getPriceUSDincVAT() {
		return Calculator.multiply(Calculator.addPercent(getPriceEURexVAT(), VAT), 1.1);
	}
	
	
	
	
	
}
