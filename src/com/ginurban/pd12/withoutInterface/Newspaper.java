package com.ginurban.pd12.withoutInterface;

import com.ginurban.OOP_Calculator.Calculator;

public class Newspaper extends Item {

	
	private static final double NEWSPAPER_VAT = 9;
	
	public Newspaper(String name, double priceEURexVAT) {
		super(name, priceEURexVAT);
	}

	@Override
	public double getPriceEURincVAT() {
		return Calculator.addPercent(getPriceEURexVAT(), this.NEWSPAPER_VAT);
	}
	
	@Override
	public double getPriceUSDincVAT() {
		return Calculator.multiply(Calculator.addPercent(getPriceEURexVAT(), this.NEWSPAPER_VAT), 1.1);
	}
	
	
	
	
	
}
