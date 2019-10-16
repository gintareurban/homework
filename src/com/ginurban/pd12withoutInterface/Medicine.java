package com.ginurban.pd12withoutInterface;

import com.ginurban.CalculatorOOP.Calculator;

public class Medicine extends Item {
	

	private static final double MED_VAT = 5;
	

	public Medicine(String name, double priceEURexVAT) {
		super(name, priceEURexVAT);
	}
	
	
	@Override
	public double getPriceEURincVAT() {
		return Calculator.addPercent(getPriceEURexVAT(), this.MED_VAT);
	}
	
	@Override
	public double getPriceUSDincVAT() {
		return Calculator.multiply(Calculator.addPercent(getPriceEURexVAT(), this.MED_VAT), 1.1);
	}
	
	

}
