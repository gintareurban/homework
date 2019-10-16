package com.ginurban.pd12withoutInterface;

import com.ginurban.CalculatorOOP.Calculator;

public class Item {

	private double priceEURexVAT; 
	private String name;
	private static double VAT = 21;
	
	
	
	public Item(String name, double priceEURexVAT) {
		this.name = name;
		this.priceEURexVAT = priceEURexVAT;
		
	}
	
	public double getPriceUSDincVAT() {
		return Calculator.multiply(Calculator.addPercent(priceEURexVAT, VAT), 1.1);
	}
	
	public double getPriceUSDexVAT() {
		return Calculator.multiply(priceEURexVAT, 1.1);
	}
	
	public double getPriceEURincVAT() {
		return Calculator.addPercent(priceEURexVAT, VAT);
	}

	public double getPriceEURexVAT() {
		return priceEURexVAT;
	}
	



	public void setPriceEURexVAT(double priceEURexVAT) {
		this.priceEURexVAT = priceEURexVAT;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
