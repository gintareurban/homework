package com.ginurban.pd12;

import com.ginurban.CalculatorOOP.Calculator;

public class Medicine extends Item {
	

	private static double VAT = 5;
	

	public Medicine(String name, double priceEURexVAT) {
		super(name, priceEURexVAT);
	}
	
	
	@Override
	public double getPriceEURincVAT() {
		return Calculator.addPercent(getPriceEURexVAT(), this.VAT);
	}
	
	@Override
	public double getPriceUSDincVAT() {
		return Calculator.multiply(Calculator.addPercent(getPriceEURexVAT(), this.VAT), 1.1);
	}
	
	

}
