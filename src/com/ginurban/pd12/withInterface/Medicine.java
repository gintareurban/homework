package com.ginurban.pd12.withInterface;

public class Medicine extends Product implements CartItems {
	
	private static final double MEDICINE_VAT = 0.05;
	
	public Medicine(String name, double price) {
		super(name, price);
		
	}

	@Override
	public double getVAT() {
		
		return MEDICINE_VAT;
	}

	
	
	
}
